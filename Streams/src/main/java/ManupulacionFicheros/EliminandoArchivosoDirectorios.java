package ManupulacionFicheros;

import java.io.*;

public class EliminandoArchivosoDirectorios {

    public static void main(String[] args) {

        File ruta = new File("/home/onixseries/Descargas/FISICA/NuevoDirectorioJava");
        ruta.delete();

    }
}
