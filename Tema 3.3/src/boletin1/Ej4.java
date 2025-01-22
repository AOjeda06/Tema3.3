package boletin1;

import java.util.Random;
import java.util.TreeSet;

public class Ej4 {

	public static void main(String[] args) {
		// TreeSet para los numeros
		TreeSet<Integer> numeros = new TreeSet<>();

		// Random
		Random rand = new Random();

		// Variable para los numeros aleatorios
		int random;

		// Añadimos valores
		while (numeros.size() < 20) {
			random = rand.nextInt(100);
			numeros.add(random);
		}

		// Imprime los pares con un for each
		System.out.println("Numeros introducidos ordenados: ");
		for (Integer numero : numeros) {
			System.out.print(numero + " ");
		}
	}

}
