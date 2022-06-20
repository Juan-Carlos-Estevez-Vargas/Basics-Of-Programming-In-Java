package Ejercicios;

import java.util.Scanner;

/**
 * Realice un programa que determine si un número es par o impar.
 * 
 * @author Juan Carlos Estevez Vargas.
 *
 */
public class Numero_par_impar {

	public static void main(String[] args) {

		try (Scanner entrada = new Scanner(System.in)) {
			int num1;
			char respuesta;

			do {
				System.out.println("\nIngrese un número ");
				num1 = entrada.nextInt();

				if (num1 % 2 == 0) {
					System.out.println("****El número " + num1 + " es par****");
				} else {
					System.out.println("****El número " + num1 + " es impar****");
				}

				System.out.println("¿Desea ingresar otro número? (s/n) ");
				respuesta = entrada.next().charAt(0);
			} while ((respuesta == 's') || (respuesta == 'S'));

			System.out.println("\n---Bye---");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
