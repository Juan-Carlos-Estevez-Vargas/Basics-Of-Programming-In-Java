package Ejercicios;

import java.util.Scanner;

/**
 * Pide un número y muestra si es positivo o negativo y si es par o impar.
 * 
 * @author Juan Carlos Estevez Vargas.
 *
 */
public class NumeroNegativo {

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			int numero = 0;

			System.out.println("Introduzca un número por favor");
			numero = teclado.nextInt();

			if (numero >= 0 && numero % 2 == 0) {
				System.out.println("El número " + numero + " es positivo y par ");
			} else if (numero >= 0 && numero % 2 != 0) {
				System.out.println("El número " + numero + " es positivo e impar ");
			} else if (numero < 0 && numero % 2 == 0) {
				System.out.println("El número " + numero + " es pnegativo y par ");
			} else {
				System.out.println("El número " + numero + " es negativo e impar");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
