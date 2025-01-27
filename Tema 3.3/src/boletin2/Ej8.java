package boletin2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;

public class Ej8 {
	// Mapa para las tareas
	static TreeMap<String, HashSet<String>> tareas = new TreeMap<>();

	// Escáner
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Variable para el menú
		int ans;

		do {
			// Menú
			System.out.println("1. Agregar tarea");
			System.out.println("2. Mostrar tareas por categoría");
			System.out.println("3. Eliminar tarea");
			System.out.println("0. Salir");
			ans = scanner.nextInt();
			scanner.nextLine();

			// Acción seleccionada
			switch (ans) {
			case 1 -> añadirTarea();
			case 2 -> mostrarCategoria();
			case 3 -> eliminarTarea();
			}

		} while (ans != 0);
	}

	public static void añadirTarea() {
		// Variable
		String cat;
		String tarea;

		// Pide los datos
		System.out.println("Escribe la categoria de la tarea: ");
		cat = scanner.nextLine();
		System.out.println("Escribe la tarea: ");
		tarea = scanner.nextLine();

		// Añadimos al mapa
		if (tareas.containsKey(cat)) {
			tareas.get(cat).add(tarea);
		} else {
			// Creamos el cunjunto para las tareas de la categoria
			HashSet<String> set = new HashSet<>();
			set.add(tarea);
			tareas.put(cat, set);
		}
		System.out.println("Tarea añadida correctamente.");
	}

	public static void mostrarCategoria() {
		// Variable
		String cat;

		// Pide los datos
		System.out.println("Escribe el nombre de la categoría que quieres buscar: ");
		cat = scanner.nextLine();

		// Imprime el resultado del conjunto asociado a la key
		if (tareas.containsKey(cat)) {
			System.out.println("Tareas de " + cat + ": " + tareas.get(cat));
		} else {
			System.out.println("La categoría '" + cat + "' no está en la lista de tareas.");
		}
	}

	public static void eliminarTarea() {
		// Variables
		String cat;
		String tarea;

		// Pide los datos
		System.out.println("Escribe el nombre de la categoría: ");
		cat = scanner.nextLine();

		if (tareas.containsKey(cat)) {
			System.out.println("Escribe la tarea que quieres eliminar: ");
			tarea = scanner.nextLine();

			// Elimina la tarea
			if (tareas.get(cat).remove(tarea)) {
				System.out.println("Tarea eliminada correctamente.");
			} else {
				System.out.println("La tarea no está en la categoría.");
			}
		} else {
			System.out.println("La categoría '" + cat + "' no está en la lista.");
		}
	}
}
