package HerenciaEstudiantes;

public class Empleado extends Persona {

    private double sueldo;

    public Empleado(String nombre, String fechaNacimento, double sueldo) {
        super(nombre, fechaNacimento);
        this.sueldo = sueldo;
    }

    public void trabajando(){
        System.out.println("El emplado esta trabajando");
    }

    public void cobrando(){
        System.out.println("El emplado esta cobrando");
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString()+
                "sueldo=" + sueldo +
                '}';
    }
}
