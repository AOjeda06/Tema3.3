package boletin2;

import java.util.Scanner;
import java.util.TreeMap;

public class Ej5 {
	// Escáner
	static Scanner scanner = new Scanner(System.in);

	// Mapa para las series
	static TreeMap<String, Integer> series = new TreeMap<>();

	public static void main(String[] args) {
		// Variable para el menú
		int ans;

		do {
			// Menú
			System.out.println("1. Agregar serie");
			System.out.println("2. Buscar serie");
			System.out.println("3. Eliminar serie");
			System.out.println("0. Salir");
			ans = scanner.nextInt();
			scanner.nextLine(); // Añadir una línea aquí para evitar problemas de entrada.

			// Acción seleccionada
			switch (ans) {
			case 1 -> añadirSerie();
			case 2 -> buscarSerie();
			case 3 -> eliminarSerie();
			}

		} while (ans != 0);
	}

	public static void añadirSerie() {
		// Variable
		String nombre;
		int valoracion;

		// Pide los datos
		System.out.println("Escribe la serie que quieres introducir: ");
		nombre = scanner.nextLine();
		System.out.println("Escribe la valoración de la serie: ");
		valoracion = scanner.nextInt();
		scanner.nextLine(); // Añadir una línea para limpiar el buffer.

		// Añade la serie al mapa
		series.put(nombre, valoracion);
		System.out.println("Serie añadida correctamente.");
	}

	public static void buscarSerie() {
		// Variable
		String nombre;

		// Pide los datos
		System.out.println("Escribe el nombre de la serie que quieres buscar: ");
		nombre = scanner.nextLine();

		// Imprime el resultado de la búsqueda
		if (series.containsKey(nombre)) {
			System.out.println(
					"La serie '" + nombre + "' está en la lista, y su valoración es de: " + series.get(nombre));
		} else {
			System.out.println("La serie '" + nombre + "' no está en la lista.");
		}
	}

	public static void eliminarSerie() {
		// Variable
		String nombre;

		// Pide los datos
		System.out.println("Escribe el nombre de la serie que quieres eliminar: ");
		nombre = scanner.nextLine();

		// Elimina la serie de la lista
		if (series.remove(nombre) != null) {
			System.out.println("Serie eliminada correctamente.");
		} else {
			System.out.println("Serie no encontrada en la lista.");
		}
	}
}
