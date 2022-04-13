package divisores_de_un_numero;

import java.util.Scanner;

public class Divisores_de_un_numero {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Por favor digite un número");
        numero = entrada.nextInt();
        System.out.println("Los divisores del número " + numero + " son:");
        
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }
    }
}
