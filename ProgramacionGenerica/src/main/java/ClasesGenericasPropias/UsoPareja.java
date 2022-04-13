package ClasesGenericasPropias;

public class UsoPareja {

    public static void main(String[] args) {

        Pareja<String> una = new Pareja<>();
        una.setPrimero("Estevez");
        System.out.println(una.getPrimero());

        Persona persona1 = new Persona("Juan");
        Pareja<Persona> dos = new Pareja<>();
        dos.setPrimero(persona1);
        System.out.println(dos.getPrimero());

    }
}

class Persona {

    private final String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
}
