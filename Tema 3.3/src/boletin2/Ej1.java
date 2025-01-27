package boletin2;

import java.util.ArrayList;
import java.util.Collections;

public class Ej1 {

	public static void main(String[] args) {
		// ArrayList para los numeros
		ArrayList<Integer> numeros = new ArrayList<>();

		// Rellenamos la lista
		for (int i = 1; i <= 10; i++) {
			numeros.add(i);
		}

		// Imprimimos la lista ordenada
		System.out.println(numeros);

		// Desordenamos la lista
		Collections.shuffle(numeros);

		// Imprimimos la lista desordenada
		System.out.println(numeros);

	}

}
