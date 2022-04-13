/*

    * Realice un convertidor de pesos colombianos a dólares y euros 
    * suponiendo que el dólar equivale a $3500 y el euro $3745

 */
package convertidores;

import java.util.Scanner;

public class Convertidor_dolar_euro_a_COP {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dolar = 3500, euro = 3745;
        float cantidad, totalDolar, totalEuro;

        System.out.println("Ingrese una cantidad de dinero en pesos colombianos");
        cantidad = entrada.nextFloat();
        totalDolar = cantidad / dolar;
        totalEuro = cantidad / euro;
        System.out.println("Con " + cantidad + " pesos colombianos usted puede adquirir:");
        System.out.println(totalDolar + " dólares");
        System.out.println(totalEuro + " euros");
    }
}
