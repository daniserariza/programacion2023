package edu.co.ingenieria.labprogramacion;

public class PruebaAnimal {

	public static void main(String[] args) {
		Gato miGato = new Gato("Pelusa", 5);
		miGato.mostrarInformacion();
		miGato.maullar();

		Perro miPerro = new Perro("Rex", 3);
		miPerro.mostrarInformacion();
		miPerro.ladrar();
	}
}
