package HerenciaEstudiantes;

public class Persona {

    private String nombre;
    private String fechaNacimento;

    public Persona(String nombre, String fechaNacimento){
        this.nombre = nombre;
        this.fechaNacimento = fechaNacimento;
    }

    public void dormir(){
        System.out.println("La persona esta dormiendo");
    }

    public void respirar(){
        System.out.println("La persona esta respirando");
    }

    public void comer(){
        System.out.println("La persona esta comiendo");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimento() {
        return fechaNacimento;
    }

    public void setFechaNacimento(String fechaNacimento) {
        this.fechaNacimento = fechaNacimento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimento='" + fechaNacimento + '\'';
    }
}
