package MetodosGenericosPropios;

public class PrimerosMetodos {

    public static void main(String[] args) {

        String[] elementos = {"Pedro","Ignasio","Hefesto"};
        System.out.println(MisMatrices.getElementos(elementos));
        
    }
}

class MisMatrices {

    public static <T> String getElementos(T[] a) {
        return "El array tiene " + a.length + " elementos";
    }

}
