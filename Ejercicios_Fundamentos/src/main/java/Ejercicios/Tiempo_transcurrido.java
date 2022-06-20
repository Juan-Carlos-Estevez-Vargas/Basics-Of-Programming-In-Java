package Ejercicios;

import java.util.Scanner;

/**
 * Escribir un programa que arroje la cantidad de horas, minutos y segundos que
 * haya en una cifra de segundos suministrada por el usuraio
 * 
 * @author Juan Carlos Estevez Vargas.
 *
 */
public class Tiempo_transcurrido {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("\n\tHORAS, MINUTOS Y SEGUNDOS");
			int horas = 0, minutos = 0, segundos;

			System.out.println("Ingrese la cantidad de segundos");
			segundos = entrada.nextInt();
			while (segundos >= 60) {
				if (minutos >= 60) {
					horas++;
					minutos -= 60;
				} else if (segundos >= 60) {
					minutos++;
					segundos -= 60;
				}
			}
			System.out.println("Horas: " + horas);
			System.out.println("Minutos: " + minutos);
			System.out.println("Segundos: " + segundos);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
