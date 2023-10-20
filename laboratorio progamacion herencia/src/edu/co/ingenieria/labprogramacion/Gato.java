package edu.co.ingenieria.labprogramacion;

public class Gato extends Animal {

	public Gato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gato(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	public void maullar() {
		System.out.println("El gato maulla.");
	}

	@Override
	public void hacerSonido() {
		System.out.println("El gato maulla.");
	}
}
