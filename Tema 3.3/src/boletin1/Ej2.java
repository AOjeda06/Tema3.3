package boletin1;

import java.util.ArrayList;
import java.util.Random;

public class Ej2 {

	public static void main(String[] args) {
		// Random
		Random rand = new Random();

		// Longitud del arraylist
		int longitud = rand.nextInt(5, 11);

		// Numeros aleatorios
		int random;

		// Indicadores a calcular
		int media;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int suma = 0;

		// ArrayList para los numeros
		ArrayList<Integer> numeros = new ArrayList<>(longitud);

		// Añadimos valores
		for (int i = 0; i <= longitud; i++) {
			random = rand.nextInt(0, 101);
			numeros.add(random);
		}

		// Recorremos el array para calcular los datos
		for (Integer numero : numeros) {
			if (numero > max) {
				max = numero;
			}

			if (numero < min) {
				min = numero;
			}

			suma += numero;
		}

		// Calculamos la media
		media = suma / longitud;

		// Imprime los resultados
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		System.out.println("suma: " + suma);
		System.out.println("media: " + media);
	}

}
