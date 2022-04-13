/*

    * Escriba un programa que permita calcular la raiz cuadrada de un número

*/

package Ejercicios;

import javax.swing.JOptionPane;

public class Raiz_cuadrada {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        System.out.println("La raiz cuadrada de " + num + " es: " + Math.sqrt(num));

    }
}
