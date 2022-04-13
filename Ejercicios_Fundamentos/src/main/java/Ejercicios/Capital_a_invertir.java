/*

    * Escriba un programa que dado un capital a invertir muestre
    * el dinero recibido en un mes y en un año

 */

package Ejercicios;

import java.util.Scanner;

public class Capital_a_invertir {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int interes = 3;
        double capital, mes, year;

        System.out.println("Ingrese el capital a invertir");
        capital = entrada.nextDouble();
        System.out.println("Se le depositará un interés del " + interes + " mensual");
        mes = capital + (capital * 3) / 100;

        System.out.println("Al cabo de un mes recibirá " + mes);
        year = capital + ((capital * 3) / 100) * 12;

        System.out.println("Y al cabo de un año recibirá " + year);
    }
}
