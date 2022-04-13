/*

    * Un viajero desea saber cuánto tiempo tomó su viaje. Él tiene la duración de
    * los tres tramos de viaje en minutos.
    * Desarrolle un programa que devuelva el tiempo total de viaje en formato
    * horas, minutos

*/
package Ejercicios;
import java.util.Scanner;
public class Tiempo_de_viaje {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String name;
        int tramo1, tramo2, tramo3, horas=0, minutos;
        
        System.out.println("Ingrese su nombre por favor"); name = entrada.nextLine();
        System.out.println("Ahora digite el tiempo en minutos del recorrido");
        System.out.println("Primer tramo:"); tramo1 = entrada.nextInt();
        System.out.println("Segundo tramo:"); tramo2 = entrada.nextInt();
        System.out.println("Tercer tramo:"); tramo3 = entrada.nextInt();
        minutos = tramo1+tramo2+tramo3;
        while(minutos >= 60){
            if(minutos >= 60){
                horas++;
                minutos -= 60;
            }
        }
        System.out.println("\nSeñor@ "+name+" el tiempo total transcurrido en su viaje fue de: "+horas+" horas con "+minutos+" minutos");
    }
}
