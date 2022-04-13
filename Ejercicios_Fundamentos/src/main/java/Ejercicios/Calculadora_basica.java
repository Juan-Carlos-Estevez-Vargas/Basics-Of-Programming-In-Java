package Ejercicios;


import java.util.Scanner;

/*
    Declara dos variables numéricas (Con ek valor deseado), muestre por consola la suma,
    resta, multiplicación, división y módulo (Resta de la división)
 */
public class Calculadora_basica {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1, num2, suma = 0, resta = 0, multiplicacion = 0, division = 0, modulo = 0;

        System.out.println("\nIngrese un número ");
        num1 = entrada.nextDouble();
        System.out.println("\nIngrese otro número");
        num2 = entrada.nextDouble();

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        if (num2 == 0) {
            System.out.println("\nNO es posible dividir por 0");

        } else {
            division = num1 / num2;
        }
        modulo = num1 % num2;
        
        System.out.println("\n\nSuma = " + suma
                + "\nResta = " + resta
                + "\nMultiplicación = " + multiplicacion
                + "\nDivisión = " + division
                + "\nMódulo = " + modulo);
    }
}
