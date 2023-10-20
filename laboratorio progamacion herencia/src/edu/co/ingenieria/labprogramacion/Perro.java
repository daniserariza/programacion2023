package edu.co.ingenieria.labprogramacion;

public class Perro extends Animal {

	public Perro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perro(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	public void ladrar() {
		System.out.println("El perro ladra.");
	}

	@Override
	public void hacerSonido() {
		System.out.println("El perro ladra.");
	}
}
