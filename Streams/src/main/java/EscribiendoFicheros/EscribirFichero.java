package EscribiendoFicheros;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EscribirFichero {

    public static void main(String[] args) {

        Escribiendo accedees = new Escribiendo();
        accedees.escribir();

    }
}

class Escribiendo {

    public void escribir() {

        FileWriter escribir = null;

        try {

            String frase = "Esto es una escritura";
            escribir = new FileWriter("/home/onixseries/Descargas/Nuevo.txt"); //Esta es la ruta donde crearemos en nuevo archivo
            escribir.write("Hijos de puta");

        } catch (IOException ex) {

            Logger.getLogger(Escribiendo.class.getName()).log(Level.SEVERE, null, ex);

        } finally {

            try {

                escribir.close();

            } catch (IOException ex) {

                Logger.getLogger(Escribiendo.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
    }
}
