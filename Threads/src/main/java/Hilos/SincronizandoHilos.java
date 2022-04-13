package Hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SincronizandoHilos {

    public static void main(String[] args) {

        HilosVarios hilo1 = new HilosVarios();
        hilo1.start();

        HilosVarios2 hilo2 = new HilosVarios2(hilo1);
        hilo2.start();

        System.out.println("Tareas terminadas");

    }
}

class HilosVarios extends Thread {

    public void run() {

        for (int i = 0; i < 15; i++) {
            System.out.println("Ejecutando hilo" + this.getName());
        }

    }

}

class HilosVarios2 extends Thread {

    private Thread hilo;

    public HilosVarios2(Thread hilo) {
        this.hilo = hilo;
    }

    public void run() {

        try {
            hilo.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(HilosVarios2.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < 15; i++) {
            System.out.println("Ejecutando hilo" + this.getName());
        }

    }

}
