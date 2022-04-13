package Ejercicios;


import java.util.Scanner;

/*
    Pide dos números y muestra cuál es el amyor, el menor o si son iguales
 */
public class NumeroMayorMenor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        System.out.println("Introduzca un número por favor");
        num1 = teclado.nextInt();
        System.out.println("Introduzca un segundo número por favor");
        num2 = teclado.nextInt();

        if (num1 > num2) {
            System.out.println("El número " + num1 + " es mayor que " + num2);
        } else if (num1 < num2) {
            System.out.println("El número " + num2 + " es mayor que " + num1);
        } else {
            System.out.println("Los números son iguales");
        }
    }
}
