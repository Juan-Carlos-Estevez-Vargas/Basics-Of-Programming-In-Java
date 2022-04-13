package ManupulacionFicheros;

import java.io.*;

public class PruebaFicheros {

    public static void main(String[] args) {

        File ruta = new File("/home/onixseries/Descargas/FISICA");
        System.out.println(ruta.getAbsolutePath()); //Este método devuleve la ruta especificada
        System.out.println(ruta.exists()); //Este método comprueba si el archivo o directorio existe

        String[] nombre_archivos = ruta.list(); //Este metodo almacena los elementos del directorio

        for (String nombre_archivo : nombre_archivos) {
            
            System.out.println(nombre_archivo);
            
            //Para almacenar la ruta de los directorios dentro de este directorio
            File file = new File(ruta.getAbsolutePath(),nombre_archivo);
            System.out.println("\n");
            
            if(file.isDirectory()){
                
                String[] archivos_subcarpeta = file.list();
                
                for(String archivo_subcarpeta: archivos_subcarpeta){
                    
                    System.out.println(archivo_subcarpeta);
                }
            }
        }
    }
}
