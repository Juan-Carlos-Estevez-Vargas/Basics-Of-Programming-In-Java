package Serializacion;

import java.util.*;
import java.io.*;

public class Serializando {

    public static void main(String[] args) {

        Administrador jefe = new Administrador("Juan", 80000, 2005, 12, 15);

        jefe.setIncentivo(5000);

        Empleado[] personal = new Empleado[3];

        personal[0] = jefe;
        personal[1] = new Empleado("Ana", 25000, 2008, 10, 1);
        personal[2] = new Empleado("Luis", 18000, 2012, 9, 15);

        try {

            ObjectOutputStream escribiendo_ficheros = new ObjectOutputStream(new FileOutputStream("/home/onixseries/Descargas/empleado.dat"));
            escribiendo_ficheros.writeObject(personal);

            ObjectInputStream rescatando_ficheros = new ObjectInputStream(new FileInputStream("/home/onixseries/Descargas/empleado.dat"));

            try {

                Empleado[] personal_recuperado = (Empleado[]) rescatando_ficheros.readObject();

                for (Empleado e : personal_recuperado) {

                    System.out.println(e);

                }

            } catch (ClassNotFoundException ex) {
            }

        } catch (IOException ex) {
        }

    }

}

//-----------------------------------------------------------------------------------------------------------
class Empleado implements Serializable {

    private final String nombre;
    private double sueldo;
    private final Date fechaContrato;

    public Empleado(String n, double s, int agno, int mes, int dia) {

        nombre = n;
        sueldo = s;

        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        fechaContrato = calendario.getTime();

    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void subirSueldo(double porcentaje) {

        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;

    }

    @Override
    public String toString() {

        return "El Nombre es =" + nombre + ",y su sueldo es =" + sueldo + ", fecha de contrato=" + fechaContrato;

    }

}

//--------------------------------------------------------------------------------------------------------
class Administrador extends Empleado {

    private double incentivo;

    public Administrador(String n, double s, int agno, int mes, int dia) {

        super(n, s, agno, mes, dia);
        incentivo = 0;

    }

    @Override
    public double getSueldo() {

        double sueldoBase = super.getSueldo();
        return sueldoBase + incentivo;

    }

    public void setIncentivo(double b) {

        incentivo = b;
    }

    @Override
    public String toString() {

        return super.toString() + " Incentivo=" + incentivo;

    }

}
