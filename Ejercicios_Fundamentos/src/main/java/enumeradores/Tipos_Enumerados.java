package enumeradores;

import javax.swing.JOptionPane;

/**
 * Los tipos enumerados son una subclase por asi decirlo, que sólo admite
 * ciertos valores y si se intenta almacenar un valor diferente al predefinido
 * pues es un error
 * 
 * @author Juan Carlos Estevez Vargas.
 *
 */
public class Tipos_Enumerados {

	enum Talla {
		Pequeño, Mediano, Grande, MuyGrande
	};

	public static void main(String[] args) {
		String talla;

		talla = JOptionPane.showInputDialog("Ingrese su talla");

		if (talla.equalsIgnoreCase("s")) {
			System.out.println("Su talla es " + Talla.Pequeño);
		} else if (talla.equalsIgnoreCase("m")) {
			System.out.println("Su talla es " + Talla.Mediano);
		} else if (talla.equalsIgnoreCase("l")) {
			System.out.println("Su talla es " + Talla.Grande);
		} else if (talla.equalsIgnoreCase("xl")) {
			System.out.println("Su talla es " + Talla.MuyGrande);
		} else {
			System.out.println("Ingresó una talla incorrecta");
		}
	}
}
