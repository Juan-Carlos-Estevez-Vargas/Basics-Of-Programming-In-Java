package ManupulacionFicheros;

import java.io.*;

public class CreandoFicherosDirectorios {

    public static void main(String[] args) {

        //mkdir() crea el nuevo directorio o archivo especificado en el pathname
        File ruta = new File("/home/onixseries/Descargas/FISICA/NuevoDirectorioJava");
        ruta.mkdir();

        //createNewFile() crea un nuevo archivo
        File ruta2 = new File("/home/onixseries/Descargas/FISICA/nuevoarchivo.txt");

        try {

            ruta2.createNewFile();

        } catch (IOException ex) {

            System.out.println("Error al crear el archivo");

        }

        //Creando un archivo con algo escrito 
        String ruta_destino = ruta2.getAbsolutePath();

        Escribiendo escribiendoFicheroNuevo = new Escribiendo();
        escribiendoFicheroNuevo.escribir(ruta_destino);
    }
}

class Escribiendo {

    public void escribir(String ruta_destino) {

        String frase = "xdxdxdx";

        try {

            FileWriter archivonuevo = new FileWriter(ruta_destino);

            for (int i = 0; i < frase.length(); i++) {

                archivonuevo.write(frase.charAt(i));

            }

        } catch (IOException ex) {

            System.out.println("Algo falló");

        }

    }
}
