package Ejercicios;

import java.util.Scanner;

/**
 * Calcular el factorial de un número pedido por teclado.
 * 
 * @author Juan Carlos Estevez Vargas.
 *
 */
public class Factorial {

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			int numero = 0;
			System.out.println("Introduzca el numero del que desea ver el factorial");
			numero = teclado.nextInt();

			System.out.println("\nEl factorial del número " + numero + " es: " + calculoFactorial(numero));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Calcula el factorial de un número entero.
	 * 
	 * @param n = número a operar.
	 * @return factorial del número ingresado.
	 */
	public static int calculoFactorial(int n) {
		int factorial = 1;
		for (int i = 2; i <= n; ++i) {
			factorial *= i;
		}
		return factorial;
	}
}
