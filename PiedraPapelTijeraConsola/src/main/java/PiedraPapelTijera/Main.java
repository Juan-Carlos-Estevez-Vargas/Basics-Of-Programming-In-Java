package PiedraPapelTijera;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion;
        int numero = (int) (Math.random() * 3 + 1);

        Mano j1 = null;
        Mano j2 = null;

        System.out.println("Elije una:"
                + "\n1. PIEDRA"
                + "\n2. PAPEL"
                + "\n3. TIJERA");
        eleccion = teclado.nextInt();

        switch (eleccion) {
            case 1:
                j1 = Mano.PIEDRA;
                break;
            case 2:
                j1 = Mano.PAPEL;
                break;
            case 3:
                j1 = Mano.TIJERA;
                break;
            default:
                System.out.println("Opción errónea");
                break;
        }

        switch (numero) {
            case 1 -> {
                j2 = Mano.PAPEL;
                System.out.println("Elección de la máquina: PAPEL");
            }
            case 2 -> {
                j2 = Mano.PIEDRA;
                System.out.println("Elección de la máquina: PIEDRA");
            }
            default -> {
                j2 = Mano.TIJERA;
                System.out.println("Elección de la máquina: TIJERA");
            }
        }

        PiedraPapelTijera ppt = new PiedraPapelTijera();

        int ganador = ppt.ganador(j1, j2);

        switch (ganador) {
            case 0 ->
                System.out.println("Empate");
            case 1 ->
                System.out.println("Tú ganas");
            case -1 ->
                System.out.println("Máquina gana");
        }

    }

}
