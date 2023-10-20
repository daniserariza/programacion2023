package edu.co.ingenieria.labprogramacion;

public class Persona {

	private String nombre ;

	private int edad;

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void saludar() {
		System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
	}

	public static void main(String[] args) {
		Persona persona = new Persona("Sergio", 21);

		System.out.println("Nombre: " + persona.getNombre());
		System.out.println("Edad: " + persona.getEdad());
	}

}
