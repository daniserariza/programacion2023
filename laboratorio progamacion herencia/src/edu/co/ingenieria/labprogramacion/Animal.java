package edu.co.ingenieria.labprogramacion;

public class Animal {

	private String nombre ;

	private int edad;

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(String nombre, int edad) {
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


	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad + " años");
	}

	public void hacerSonido() {
		System.out.println("El animal hace un sonido genérico.");
	}
}
