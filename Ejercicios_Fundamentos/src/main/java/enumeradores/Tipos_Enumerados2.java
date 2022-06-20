package enumeradores;

import javax.swing.JOptionPane;

/**
 * 
 * @author Juan Carlos Estevez Vargas.
 *
 */
public class Tipos_Enumerados2 {

	/**
	 * Clase enumerada
	 * 
	 * @author Juan Carlos Estevez Vargas.
	 *
	 */
	enum Talla {
		PEQUEÑO("S"), MEDIANO("M"), GRANDE("L"), MUYGRANDE("XL");

		private String abreviatura;

		private Talla(String abreviatura) {
			this.abreviatura = abreviatura;
		}

		public String getAbreviatura() {
			return abreviatura;
		}
	}

	public static void main(String[] args) {
		String talla;

		talla = JOptionPane.showInputDialog("Ingrese su talla: PEQUEÑO, MEDIANO, GRANDE, MUYGRANDE").toUpperCase();

		/**
		 * Nos permite evaluar y usar el método Getter de la clase enum.
		 */
		Talla LaTalla = Enum.valueOf(Talla.class, talla);
		System.out.println("Su talla es: " + LaTalla.getAbreviatura());
	}
}
