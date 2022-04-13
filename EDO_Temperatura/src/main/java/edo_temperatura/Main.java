// Programa realizado por Juan Carlos Estevez Vargas
package edo_temperatura;
import java.text.DecimalFormat;
public class Main {

    public static double tiempo(double operacion) {
        for (int i = 70; i > 0; i -= 10) {
            double x = i - 40;
            double y = 30;
            if (x >= 0) {
                double log = Math.log(x / y);
                operacion = log / -0.13;
            }
        }
        return operacion;
    }

    public static void temperatura(double operacion) {
        System.out.println();
        DecimalFormat frmt = new DecimalFormat("#.##");
        for (int i = 0; i < operacion; i++) {
            operacion = 30 * Math.exp(-0.13 * i) + 40;
            System.out.println("Tiempo " + i + " Temperatura " + frmt.format(operacion));
        }
    }

    public static void main(String[] args) {
        double operacion = 0;
        temperatura(tiempo(operacion));
    }
}
