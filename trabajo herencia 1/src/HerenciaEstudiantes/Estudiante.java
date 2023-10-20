package HerenciaEstudiantes;

public class Estudiante extends Persona {
private long codigo;

    public Estudiante(String nombre, String fechaNacimento, long codigo) {
        super(nombre, fechaNacimento);
        this.codigo = codigo;
    }

    public void aprobado(){
        System.out.println("El estudiante ha aprovado");
    }
    public void reprobado(){
        System.out.println("El estudiante ha reprobado");
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Código: " + codigo+"}";
    }
}

