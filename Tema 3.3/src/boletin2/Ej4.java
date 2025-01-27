package boletin2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ej4 {
	// Escáner
	static Scanner scanner = new Scanner(System.in);

	// Lista para los nombres
	static ArrayList<String> nombres = new ArrayList<>();

	public static void main(String[] args) {
		int ans;

		do {
			// Menú
			System.out.println("1. Añadir nuevo nombre a la lista");
			System.out.println("2. Eliminar nombre de la lista");
			System.out.println("3. Ordenar la lista alfabéticamente");
			System.out.println("4. Buscar nombre en la lista");
			System.out.println("0. Salir");
			ans = scanner.nextInt();
			scanner.nextLine(); // añadir una línea aquí para evitar problemas de entrada.

			// Acción seleccionada
			switch (ans) {
			case 1 -> añadirNombre();
			case 2 -> eliminarNombre();
			case 3 -> ordenarLista();
			case 4 -> buscarNombre();
			}

		} while (ans != 0);
	}

	public static void añadirNombre() {
		// Variable
		String nombre;

		// Pide los datos
		System.out.println("Escribe el nombre que quieres introducir: ");
		nombre = scanner.nextLine();

		// Añade el nombre a la lista
		nombres.add(nombre);
		System.out.println("Nombre añadido correctamente.");
	}

	public static void eliminarNombre() {
		// Variable
		String nombre;

		// Pide los datos
		System.out.println("Escribe el nombre que quieres eliminar: ");
		nombre = scanner.nextLine();

		// Elimina el nombre de la lista
		if (nombres.remove(nombre)) {
			System.out.println("Nombre eliminado correctamente.");
		} else {
			System.out.println("Nombre no encontrado en la lista.");
		}
	}

	public static void ordenarLista() {
		// Ordena la lista
		Collections.sort(nombres);

		// Imprime el resultado
		System.out.println("Lista ordenada alfabéticamente: ");
		System.out.println(nombres);
	}

	public static void buscarNombre() {
		// Variable
		String nombre;

		// Pide los datos
		System.out.println("Escribe el nombre que quieres buscar: ");
		nombre = scanner.nextLine();

		// Imprime el resultado de la búsqueda
		if (nombres.contains(nombre)) {
			System.out.println("El nombre '" + nombre + "' está en la lista.");
		} else {
			System.out.println("El nombre '" + nombre + "' no está en la lista.");
		}
	}
}
