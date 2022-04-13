package ClasesGenericasPropias;

public class Pareja<T> {

    private T primero;

    public Pareja() {
        primero = null;
    }

    public void setPrimero(T nuevovalor) {
        primero = nuevovalor;
    }

    public T getPrimero() {
        return primero;
    }

}
