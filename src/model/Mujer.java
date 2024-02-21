package model;

public class Mujer extends Persona {

	public Mujer(int altura, int peso, int edad) {
		super(altura, peso, edad);
	}

	@Override
	public double calcularTasaMetabolica() {
		return 447.593 + (9.247 * this.peso) + (3.098 * this.altura) - (4.33 * this.edad);
	}

}
