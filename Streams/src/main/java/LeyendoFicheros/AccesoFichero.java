package LeyendoFicheros;

import java.io.FileReader;
import java.io.IOException;

public class AccesoFichero {

    public static void main(String[] args) {

        Leer_Fichero accediendo = new Leer_Fichero();
        accediendo.lee();

    }
}

class Leer_Fichero {

    public void lee() {

        try {
            //Almacenamos el archivo
            FileReader entrada = new FileReader("/home/onixseries/Descargas/Parcial.docx");

            //Almacenamos el valor unicode del primer caracter
            int c = entrada.read();

            //Mientras c no llegue al final guardamos e imprimimos el unicode de cada caracter
            while (c != -1) {
                c = 0;
                char letra = (char) c;
                System.out.println(letra);
            }

        } catch (IOException ex) {
            System.out.println("No se ha encontrado el archivo");
        }

    }
}
