package Hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BancoSyncronized {

    public static void main(String[] args) {

        Banco mibanco = new Banco();

        for (int i = 0; i < 100; i++) {

            EjecucionTransferencias r = new EjecucionTransferencias(mibanco, i, 2000);
            Thread t = new Thread(r);
            t.start();

        }
    }
}

//--------------Clase que crea en banco--------------------------------------------
class Banco2 {

    private final double[] cuentas;

    public Banco2() {

        this.cuentas = new double[100];

        for (int i = 0; i < cuentas.length; i++) {
            cuentas[i] = 2000;
        }

    }

    //Método sincronizado 
    public synchronized void transferencia(int cuenta_origen, int cuenta_destino, double cantidad) throws InterruptedException {

        //Mientras el valor a transpasar es mayor al que hay en la cuenta, no retorna nada
        while (cuentas[cuenta_origen] < cantidad) {

            this.wait(); //ponemos el hilo a la espera

        }

        System.out.println(Thread.currentThread());
        cuentas[cuenta_origen] -= cantidad; //dinero que sale de la cuenta origen 
        System.out.printf("%10.2f de %d para %d", cantidad, cuenta_origen, cuenta_destino);
        cuentas[cuenta_destino] += cantidad; //dinero que entra en la cuenta destino
        System.out.printf(" Saldo total: %10.2f ", this.getSaldoTotal());

        this.notifyAll();

    }

    public double getSaldoTotal() {

        double suma_cuentas = 0;

        for (double a : cuentas) {
            suma_cuentas += a;
        }

        return suma_cuentas;
    }
}

//----------------Clase para ejecutar las transferencias---------------------------------------------------
class EjecucionTransferencias2 implements Runnable {

    private final Banco bank;
    private final int deLaCuenta;
    private final double cantidadMaxima;

    public EjecucionTransferencias2(Banco bank, int de, double max) {

        this.bank = bank;
        this.deLaCuenta = de;
        this.cantidadMaxima = max;

    }

    @Override
    public void run() {

        while (true) {

            int paraLaCuenta = (int) (Math.random() * 100); //Cuenta destino
            double cantidad = cantidadMaxima * Math.random(); //Cantidad a transferir
            
            try {
                bank.transferencia(deLaCuenta, paraLaCuenta, cantidad);  //Llamamos al metodo que hace las transferencias
            } catch (InterruptedException ex) {
                Logger.getLogger(EjecucionTransferencias2.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                Thread.sleep((int) (Math.random() * 10));
            } catch (InterruptedException ex) {
                System.out.println("Algo salió mal");
            }
        }
    }

}
