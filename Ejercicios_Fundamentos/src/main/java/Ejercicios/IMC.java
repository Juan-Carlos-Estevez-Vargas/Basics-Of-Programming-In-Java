/**
 * Escribir un programa que calcule el IMC de una persona.
 */
package Ejercicios;

import java.util.Scanner;

/**
 * 
 * @author Juan Carlos Estevez Vargas.
 *
 */
public class IMC {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("\tIMC");
			String name;
			double peso, altura, imc;
			System.out.println("Ingrese su nombre por favor");
			name = entrada.nextLine();
			System.out.println("Digite su peso actual en kg");
			peso = entrada.nextDouble();
			System.out.println("Digite su altura actual en metros");
			altura = entrada.nextDouble();
			imc = (peso / Math.pow(altura, 2));
			System.out.println("\n*****" + name + " su índice de masa corporal(IMC) es: " + imc + "*****");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
