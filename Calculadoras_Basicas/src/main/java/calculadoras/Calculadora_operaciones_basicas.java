/*

    * Realizar un programa que simule una calculadora básica
*/

package calculadoras;

import java.util.Scanner;

public class Calculadora_operaciones_basicas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num1, num2, resultado;
        int opc;

        System.out.println("\n\tMENÚ");
        System.out.println("1. Sumar");
        System.out.println("2. REstar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");

        do {
            System.out.println("\nDigite su opción ");
            opc = entrada.nextInt();
            switch (opc) {
                case 1 -> {
                    System.out.println("Digite un número ");
                    num1 = entrada.nextFloat();
                    System.out.println("Ingrese otro número ");
                    num2 = entrada.nextFloat();
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                }

                case 2 -> {
                    System.out.println("Digite un número  ");
                    num1 = entrada.nextFloat();
                    System.out.println("Ingrese otro número  ");
                    num2 = entrada.nextFloat();
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resultado);
                }

                case 3 -> {
                    System.out.println("Digite un número  ");
                    num1 = entrada.nextFloat();
                    System.out.println("Ingrese otro número  ");
                    num2 = entrada.nextFloat();
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                }

                case 4 -> {
                    System.out.println("Digite un número  ");
                    num1 = entrada.nextFloat();
                    System.out.println("Ingrese otro número  ");
                    num2 = entrada.nextFloat();
                    while (num2 == 0) {
                        System.out.println("NO es posible dividor por 0");
                        System.out.println("Ingrese otro número  ");
                        num2 = entrada.nextFloat();
                    }
                    resultado = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                }
            }
        } while (opc >= 1 && opc <= 4);
    }
}
