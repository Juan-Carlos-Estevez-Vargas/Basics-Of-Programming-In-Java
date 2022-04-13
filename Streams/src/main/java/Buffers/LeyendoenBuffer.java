package Buffers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeyendoenBuffer {

    public static void main(String[] args) {

        Leer_Fichero_en_Buffer accediendo = new Leer_Fichero_en_Buffer();
        accediendo.lee();

    }
}

class Leer_Fichero_en_Buffer {

    public void lee() {

        try {
            //Almacenamos el archivo
            FileReader entrada = new FileReader("/home/onixseries/Descargas/Parcial.docx");

            //Creamos en Buffer
            BufferedReader buffer = new BufferedReader(entrada);

            String linea = "";

            //Mientras c no llegue al final guardamos e imprimimos el unicode de cada caracter
            while (linea != null) {
                linea = buffer.readLine(); //Leemos linea a linea

                if (linea != null) {
                    System.out.println(linea);
                }

            }

        } catch (IOException ex) {
            System.out.println("No se ha encontrado el archivo");
        }

    }
}
