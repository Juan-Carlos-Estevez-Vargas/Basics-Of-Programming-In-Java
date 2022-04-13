package HerenciaYTiposComodin;

public class HerenciaGenerica {

    public static void main(String[] args) {
        
        Pareja<Empleado> administrativa = new Pareja<>();
        Pareja<Jefe> directoraComercial = new Pareja<>();
        
        Pareja.imprimirEmpleado(administrativa);
        Pareja.imprimirEmpleado(directoraComercial);
        
    }    
}
