package Ejercicios;


import java.util.Scanner;

/*
    Calcular el factorial de un número pedido por teclado
*/

public class Factorial {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        System.out.println("Introduzca el numero del que desea ver el factorial");
        numero = teclado.nextInt();

        System.out.println("\nEl factorial del número " + numero + " es: " + Factorial(numero));
    }

    public static int Factorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; ++i) {
            factorial *= i;
        }
        return factorial;
    }
}
