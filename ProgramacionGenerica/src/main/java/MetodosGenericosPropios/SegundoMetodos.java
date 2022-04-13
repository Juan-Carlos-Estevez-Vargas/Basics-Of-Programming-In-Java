package MetodosGenericosPropios;

import java.util.GregorianCalendar;

public class SegundoMetodos {

    public static void main(String[] args) {

        String[] nombres = {"Pedro", "Ignasio", "Hefesto"};
        System.out.println(MisMatrices2.getMenor(nombres));

        GregorianCalendar fechas[] = {
            new GregorianCalendar(2021, 02, 3),
            new GregorianCalendar(2021, 01, 30),
            new GregorianCalendar(2020, 2, 3)};
        
        System.out.println(MisMatrices2.getMenor(fechas).getTime());
    }
}

class MisMatrices2 {

    public static <T extends Comparable> T getMenor(T[] a) {

        if (a == null || a.length == 0) {
            return null;
        }

        T elementoMenor = a[0];

        for (int i = 1; i < a.length; i++) {

            if (elementoMenor.compareTo(a[i]) > 0) {
                elementoMenor = a[i];
            }
        }

        return elementoMenor;
    }

}
