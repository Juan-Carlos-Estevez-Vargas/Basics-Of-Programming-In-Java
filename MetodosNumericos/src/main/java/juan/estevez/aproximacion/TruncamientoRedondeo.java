package juan.estevez.aproximacion;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos Estevez y Juan David Cortes Niño
 */
public class TruncamientoRedondeo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número");
        double numero = entrada.nextDouble();

        System.out.println("Ingrese el número de cifras significativas");
        int limite = entrada.nextInt();

        String numeroString = String.valueOf(numero);
        String valorCalculadoTruncamiento = "";
        String valorCalculadoRedondeo = "";

        System.out.println("VALOR CALCULADO POR TRUNCAMIENTO");
        for (int i = 0; i < limite + 2; i++) {
            valorCalculadoTruncamiento += numeroString.charAt(i);
            System.out.print(numeroString.charAt(i));
        }

        System.out.println("\n\nVALOR CALCULADO POR REDONDEO");
        for (int i = 0; i < limite + 1; i++) {
            valorCalculadoRedondeo += numeroString.charAt(i);
            System.out.print(numeroString.charAt(i));
        }

        int numeroRedondear = Integer.parseInt(numeroString.substring(limite + 1, limite + 2));
        int parametro = Integer.parseInt(numeroString.substring(limite + 2, limite + 3));

        if (parametro >= 5) {
            numeroRedondear += 1;
            valorCalculadoRedondeo += numeroRedondear;
        } else {
            numeroRedondear -= 1;
            valorCalculadoRedondeo += numeroRedondear;
        }
        
        System.out.print(numeroRedondear);
        double errorAbsolutoTruncamiento = Math.abs(numero - Double.parseDouble(valorCalculadoTruncamiento));
        double errorRelativoTruncamiento = errorAbsolutoTruncamiento / numero;
        System.out.println("\n\nERROR ABSOLUTO POR TRUNCAMIENTO -> " + errorAbsolutoTruncamiento);
        System.out.println("\nERROR RELATIVO POR TRUNCAMIENTO -> " + errorRelativoTruncamiento);
        double errorAbsolutoRedondeo = Math.abs(numero - Double.parseDouble(valorCalculadoRedondeo));
        double errorRelativoRedondeo = errorAbsolutoRedondeo / numero;
        System.out.println("\n\nERROR ABSOLUTO POR REDONDEO -> " + errorAbsolutoRedondeo);
        System.out.println("\nERROR RELATIVO POR REDONDEO -> " + errorRelativoRedondeo);
        
    }
}
