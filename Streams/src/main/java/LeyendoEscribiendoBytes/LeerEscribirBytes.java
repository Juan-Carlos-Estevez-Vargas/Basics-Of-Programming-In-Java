package LeyendoEscribiendoBytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class LeerEscribirBytes {

    public static void main(String[] args) {

        int contador = 0;
        int datosentrada[] = new int[61042];

        try {

            FileInputStream archivolectura = new FileInputStream("/home/onixseries/Descargas/fondo2.jpg");

            boolean finalarchivo = false;

            while (!finalarchivo) {
                int byteentrada = archivolectura.read();

                if (byteentrada != -1) {

                    datosentrada[contador] = byteentrada;

                } else {

                    finalarchivo = true;

                }

                System.out.println(datosentrada[contador]);

                contador++;
            }

        } catch (IOException ex) {

        }

        System.out.println(contador);
        crearFichero(datosentrada);

    }

    //Método para crear el nuevo fichero
    static void crearFichero(int datos_crear_fichero[]) {

        try {

            FileOutputStream fichero_nuevo = new FileOutputStream("/home/onixseries/Descargas/fondo2_copia.jpg");

            for (int i = 0; i < datos_crear_fichero.length; i++) {

                fichero_nuevo.write(datos_crear_fichero[i]);

            }

        } catch (IOException ex) {

        }
    }
}
