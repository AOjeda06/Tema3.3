package boletin2;

import java.util.LinkedHashSet;
import java.util.Random;

public class Ej2 {

	public static void main(String[] args) {
		// Conjunto para los numeros
		LinkedHashSet<Integer> numeros = new LinkedHashSet<>();

		// Random
		Random rand = new Random();

		// Variables
		boolean insertado;
		int random;

		// Bucle para la insercion de datos
		for (int i = 0; i <= 10; i++) {
			// Inicializamos a false el booleano en cada insercion
			insertado = false;
			do {
				// Se generan numero aleatorios hasta que sean insertables
				random = rand.nextInt(1, 21);
				insertado = numeros.add(random);
			} while (insertado);
		}
		System.out.println(numeros);

	}

}
