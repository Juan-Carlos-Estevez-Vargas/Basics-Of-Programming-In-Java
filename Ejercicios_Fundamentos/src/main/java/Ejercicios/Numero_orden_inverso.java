/*

    * Escriba un programa que lea un número de 3 cifras y 
    * lo devuelva en órden inverso

 */
package Ejercicios;

import java.util.Scanner;

public class Numero_orden_inverso {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, unidades, decenas, centenas;

        System.out.println("Ingrese un número de tres cifras ");
        num = entrada.nextInt();
        if (num >= 100 && num <= 999) {
            centenas = num / 100;
            decenas = (num % 100) / 10;
            unidades = (num % 100) % 10;
            System.out.println("El número en órden inverso es: " + unidades + decenas + centenas);
        } else {
            System.out.println("No ingresaste un número de tres cifras");
        }
    }
}
