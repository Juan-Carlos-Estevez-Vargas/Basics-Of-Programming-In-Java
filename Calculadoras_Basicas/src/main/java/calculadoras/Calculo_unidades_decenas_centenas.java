/*

    * Realizar un programa que cualcule ¿Cuántas unidades, decenas y centenas? 
    * hay en un número de tres cifras ingresado por teclado

 */
package calculadoras;

import java.util.Scanner;

public class Calculo_unidades_decenas_centenas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, unidades, decenas, centenas;
        char respuesta;

        do {
            System.out.println("\nIngrese un número de tres cifras");
            num = entrada.nextInt();
            if (num >= 100 && num <= 999) {
                centenas = num / 100;
                decenas = (num % 100) / 10;
                unidades = num % 10;
                System.out.println("En el número " + num + " hay " + centenas + " centenas, " + decenas + " decenas y " + unidades + " unidades");
                System.out.println("¿Desea ingresar otro número? (s/n) ");
                respuesta = entrada.next().charAt(0);
            } else {
                respuesta = 's';
            }
        } while ((respuesta == 's') || (respuesta == 'S'));
    }
}
