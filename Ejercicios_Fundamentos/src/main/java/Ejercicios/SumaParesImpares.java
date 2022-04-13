package Ejercicios;


import java.util.Scanner;

/*
    Suma los pares y los impares hasta un número pedido por teclado por ejemplo,
    por teclado se ingresa el número 5
 */
public class SumaParesImpares {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0, pares = 0, impares = 0;

        System.out.println("Introduzca el numero hasta donde desea sumar los pares e impares");
        numero = teclado.nextInt();

        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0) {
                pares += i;
            } else {
                impares += i;
            }
        }

        System.out.println("\nLa suma de los números pares es: " + pares
                + "\nLa suma de los números impares es: " + impares);
    }
}
