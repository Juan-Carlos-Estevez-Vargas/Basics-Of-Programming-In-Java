package Ejercicios;

import javax.swing.JOptionPane;

/**
 * Escriba un programa que permita calcular la raiz cuadrada de un número.
 * 
 * @author Juan Carlos Estevez Vargas.
 *
 */
public class Raiz_cuadrada {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
		System.out.println("La raiz cuadrada de " + num + " es: " + Math.sqrt(num));

	}
}
