package boletin2;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ej7 {
	// Mapa para las palabras
	static TreeMap<Integer, HashSet<String>> palabras = new TreeMap<>();

	// Escáner
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Variable para el menú
		int ans;

		do {
			// Menú
			System.out.println("1. Agregar palabra");
			System.out.println("2. Mostrar estadísticas");
			System.out.println("0. Salir");
			ans = scanner.nextInt();
			scanner.nextLine();

			// Acción seleccionada
			switch (ans) {
			case 1 -> añadirPalabra();
			case 2 -> estadisticas();
			}

		} while (ans != 0);
	}

	public static void añadirPalabra() {
		// Variable
		String palabra;

		// Pide los datos
		System.out.println("Escribe la palabra que quieres introducir: ");
		palabra = scanner.nextLine();

		// Añadimos al mapa
		if (palabras.containsKey(palabra.length())) {
			palabras.get(palabra.length()).add(palabra);
		} else {
			HashSet<String> set = new HashSet<>();
			set.add(palabra);
			palabras.put(palabra.length(), set);
		}
		System.out.println("Palabra añadida correctamente.");
	}

	public static void estadisticas() {
		System.out.println("Estadísticas de palabras:");
		// Este bucle recorre el mapa entero
		for (Map.Entry<Integer, HashSet<String>> entry : palabras.entrySet()) {
			System.out.println("Longitud " + entry.getKey() + ": ");
			entry.getValue().forEach(word -> System.out.print(word + " "));
			System.out.println();
		}
	}
}
