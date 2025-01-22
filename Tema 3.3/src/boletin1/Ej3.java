package boletin1;

import java.util.ArrayList;
import java.util.Random;

public class Ej3 {

	public static void main(String[] args) {
		// ArrayList para los numeros
		ArrayList<Integer> numeros = new ArrayList<>(30);
		// Random
		Random rand = new Random();

		int random;

		// Añadimos valores
		for (int i = 0; i < 30; i++) { 
			random = rand.nextInt(11); 
			numeros.add(random);
		}

		// Imprime los pares con un for each
		System.out.println("Numeros introducidos");
		for (Integer numero : numeros) {
			System.out.print(numero + " ");
		}
	}
}
