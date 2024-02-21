package model;

public abstract class Persona {
	
	protected double altura;
	protected double peso;
	protected double edad;
	
	public Persona(int altura, int peso, int edad) {
		this.altura = altura;
		this.peso = peso;
		this.edad = edad;
	}
	
	public abstract double calcularTasaMetabolica();

}
