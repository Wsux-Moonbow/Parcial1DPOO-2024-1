package view;

import model.Hombre;
import model.Mujer;
import model.Persona;

public class console {

	public static void main(String[] args) {

		Persona p;
		
		p = new Mujer(161, 54, 20); //161cm, 54Kg, 20 años
		System.out.println(p.calcularTasaMetabolica());
		
		p = new Hombre(161, 54, 20); //161cm, 54Kg, 20 años
		System.out.println(p.calcularTasaMetabolica());

	}

}
