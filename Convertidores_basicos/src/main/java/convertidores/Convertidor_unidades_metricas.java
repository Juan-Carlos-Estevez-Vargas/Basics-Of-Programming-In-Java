/*

    * Convertidor de unidades métricas

*/
package convertidores;

import java.util.Scanner;

public class Convertidor_unidades_metricas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opc;
        double resultado, num;
        char respuesta;

        do {
            System.out.println("\n\tCONVERTIDOR DE UNIDADES MÉTRICAS");
            System.out.println("1. Convertir de Centímetros a Pulgadas");
            System.out.println("2. Convertir de Centimetros a Pies");
            System.out.println("3. Convertir de Centímetros a Metros");
            System.out.println("4. Convertir de Pulgadas a Centímetros");
            System.out.println("5. Convertir de Pulgadas a Pies");
            System.out.println("6. Convertir de Pulgadas a Metros");
            System.out.println("7. Convertir de Pies a Centímetros");
            System.out.println("8. Convertir de Pies a Pulgadas");
            System.out.println("9. Convertir de Pies a Metros");
            System.out.println("10. Convertir de Metros a Centímetros");
            System.out.println("11. Convertir de Metros a Pies");
            System.out.println("12. Convertir de Metros a Pulgadas");
            System.out.println("13. Salir");
            System.out.println("\nDigite su opción");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    do {
                        System.out.println("\nIngrese el número de Centímetros");
                        num = entrada.nextDouble();
                        resultado = num / 2.54;
                        System.out.println("En " + num + " centímetros hay " + resultado + " pulgadas");
                        System.out.println("¿Desea seguir convirtiendo? (s/n) ");
                        respuesta = entrada.next().charAt(0);
                    } while (respuesta == 's' || respuesta == 'S');
                    break;

                case 2:
                    do {
                        System.out.println("\nIngrese el número de Centímetros");
                        num = entrada.nextDouble();
                        resultado = num / 30.49;
                        System.out.println("En " + num + " centímetros hay " + resultado + " pies");
                        System.out.println("¿Desea seguir convirtiendo? (s/n) ");
                        respuesta = entrada.next().charAt(0);
                    } while (respuesta == 's' || respuesta == 'S');
                    break;

                case 3:
                    do {
                        System.out.println("\nIngrese el número de Centímetros");
                        num = entrada.nextDouble();
                        resultado = num / 100;
                        System.out.println("En " + num + " centímetros hay " + resultado + " metros");
                        System.out.println("¿Desea seguir convirtiendo? (s/n) ");
                        respuesta = entrada.next().charAt(0);
                    } while (respuesta == 's' || respuesta == 'S');
                    break;

                case 4:
                    do {
                        System.out.println("\nIngrese el número de Pulgadas");
                        num = entrada.nextDouble();
                        resultado = num * 2.54;
                        System.out.println("En " + num + " pulgadas hay " + resultado + " centímetros");
                        System.out.println("¿Desea seguir convirtiendo? (s/n) ");
                        respuesta = entrada.next().charAt(0);
                    } while (respuesta == 's' || respuesta == 'S');
                    break;

                case 5:
                    do {
                        System.out.println("\nIngrese el número de Pulgadas");
                        num = entrada.nextDouble();
                        resultado = num / 12;
                        System.out.println("En " + num + " pulgadas hay " + resultado + " pies");
                        System.out.println("¿Desea seguir convirtiendo? (s/n) ");
                        respuesta = entrada.next().charAt(0);
                    } while (respuesta == 's' || respuesta == 'S');
                    break;

                case 6:
                    do {
                        System.out.println("\nIngrese el número de Pulgadas");
                        num = entrada.nextDouble();
                        resultado = num * 2.54 / 100;
                        System.out.println("En " + num + " pulgadas hay " + resultado + " metros");
                        System.out.println("¿Desea seguir convirtiendo? (s/n) ");
                        respuesta = entrada.next().charAt(0);
                    } while (respuesta == 's' || respuesta == 'S');
                    break;

                case 7:
                    do {
                        System.out.println("\nIngrese el número de Pies");
                        num = entrada.nextDouble();
                        resultado = num * 30.49;
                        System.out.println("En " + num + " pies hay " + resultado + " centímetros");
                        System.out.println("¿Desea seguir convirtiendo? (s/n) ");
                        respuesta = entrada.next().charAt(0);
                    } while (respuesta == 's' || respuesta == 'S');
                    break;

                case 8:
                    do {
                        System.out.println("\nIngrese el número de Pies");
                        num = entrada.nextDouble();
                        resultado = num * 12;
                        System.out.println("En " + num + " pies hay " + resultado + " pulgadas");
                        System.out.println("¿Desea seguir convirtiendo? (s/n) ");
                        respuesta = entrada.next().charAt(0);
                    } while (respuesta == 's' || respuesta == 'S');
                    break;

                case 9:
                    do {
                        System.out.println("\nIngrese el número de Pies");
                        num = entrada.nextDouble();
                        resultado = num * 30.49 / 100;
                        System.out.println("En " + num + " pies hay " + resultado + " metros");
                        System.out.println("¿Desea seguir convirtiendo? (s/n) ");
                        respuesta = entrada.next().charAt(0);
                    } while (respuesta == 's' || respuesta == 'S');
                    break;

                case 10:
                    do {
                        System.out.println("\nIngrese el número de Metros");
                        num = entrada.nextDouble();
                        resultado = num * 100;
                        System.out.println("En " + num + " metros hay " + resultado + " centímetros");
                        System.out.println("¿Desea seguir convirtiendo? (s/n) ");
                        respuesta = entrada.next().charAt(0);
                    } while (respuesta == 's' || respuesta == 'S');
                    break;

                case 11:
                    do {
                        System.out.println("\nIngrese el número de Metros");
                        num = entrada.nextDouble();
                        resultado = num * 100 / 30.49;
                        System.out.println("En " + num + " metros hay " + resultado + " pies");
                        System.out.println("¿Desea seguir convirtiendo? (s/n) ");
                        respuesta = entrada.next().charAt(0);
                    } while (respuesta == 's' || respuesta == 'S');
                    break;

                case 12:
                    do {
                        System.out.println("\nIngrese el número de Metros");
                        num = entrada.nextDouble();
                        resultado = num * 100 / 2.54;
                        System.out.println("En " + num + " metros hay " + resultado + " pulgadas");
                        System.out.println("¿Desea seguir convirtiendo? (s/n) ");
                        respuesta = entrada.next().charAt(0);
                    } while (respuesta == 's' || respuesta == 'S');
                    break;

                case 13:
                    break;

            }
        } while (opc >= 1 && opc <= 13);
    }
}
