package model;

public class Hombre extends Persona {

	public Hombre(int altura, int peso, int edad) {
		super(altura, peso, edad);
	}

	@Override
	public double calcularTasaMetabolica() {
		
		return 88.362 + (13.397 * this.peso) + (4.799 * this.altura) - (5.677 * this.edad);
	}
	
}
