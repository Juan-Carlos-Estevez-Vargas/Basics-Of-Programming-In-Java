/*
 
    * Los tipos enumerados son una subclase por asi decirlo, que sólo admite ciertos
    * valores y si se intenta almacenar un valor diferente al predefinido pues es un 
    * error

 */
package enumeradores;

import javax.swing.JOptionPane;

public class Tipos_Enumerados {

    enum Talla {
        Pequeño, Mediano, Grande, MuyGrande
    };

    public static void main(String[] args) {
        String talla;

        Talla s = Talla.Pequeño;
        Talla m = Talla.Mediano;
        Talla l = Talla.Grande;
        Talla xl = Talla.MuyGrande;

        talla = JOptionPane.showInputDialog("Ingrese su talla");

        if (talla.equalsIgnoreCase("s")) {
            System.out.println("Su talla es " + talla);
        } else if (talla.equalsIgnoreCase("m")) {
            System.out.println("Su talla es " + talla);
        } else if (talla.equalsIgnoreCase("l")) {
            System.out.println("Su talla es " + talla);
        } else if (talla.equalsIgnoreCase("xl")) {
            System.out.println("Su talla es " + talla);
        } else {
            System.out.println("Ingresó una talla incorrecta");
        }
    }
}
