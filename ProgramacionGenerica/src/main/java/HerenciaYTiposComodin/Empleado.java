package HerenciaYTiposComodin;

public class Empleado {

    private final String nombre;
    private final int edad;
    private final double salario;

    public Empleado(String nombre, int edad, double salario) {

        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;

    }

    public String getDatos() {
        return "El empleado " + nombre + " de " + edad + " años de edad, consta de un salario de: $" + salario;
    }

}
