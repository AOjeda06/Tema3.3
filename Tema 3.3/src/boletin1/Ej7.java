package boletin1;

import java.util.Scanner;
import java.util.TreeMap;

public class Ej7 {
	// Crear el TreeMap
	static TreeMap<String, String> diccionario = new TreeMap<>();
	// Escaner
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// Añadir valores usando put()
		diccionario.put("Hola", "Hello");
		diccionario.put("Adiós", "Goodbye");
		diccionario.put("Gracias", "Thank you");
		diccionario.put("Por favor", "Please");
		diccionario.put("Sí", "Yes");
		diccionario.put("No", "No");
		diccionario.put("Amor", "Love");
		diccionario.put("Amigo", "Friend");
		diccionario.put("Coche", "Car");
		diccionario.put("Casa", "House");
		diccionario.put("Escuela", "School");
		diccionario.put("Libro", "Book");
		diccionario.put("Comida", "Food");
		diccionario.put("Agua", "Water");
		diccionario.put("Familia", "Family");
		diccionario.put("Felicidad", "Happiness");
		diccionario.put("Trabajo", "Work");
		diccionario.put("Dinero", "Money");
		diccionario.put("Feliz", "Happy");
		diccionario.put("Triste", "Sad");
		diccionario.put("Rápido", "Fast");

		// Variable para el menu
		int ans;

		do {
			// Menu
			System.out.println("1. Insertar palabra");
			System.out.println("2. Buscar palabra");
			System.out.println("0. Salir");
			ans = scanner.nextInt();

			// Accion seleccionada
			switch (ans) {
			case 1 -> {
				insertar();
			}

			case 2 -> {
				buscar();
			}
			}

		} while (ans != 0);

	}

	public static void insertar() {
		// Variables
		String esp;
		String eng;

		// Pide los datos
		System.out.println("Dime la palabra en español: ");
		esp = scanner.next();

		System.out.println("Dime la palabra en ingles: ");
		eng = scanner.next();

		// Inserta los datos
		diccionario.put(esp, eng);

		System.out.println("Palabra añadida.");
	}

	public static void buscar() {
		// Variables
		String esp;

		// Pide los datos
		System.out.println("Dime qué palabra buscas: ");
		esp = scanner.next();

		// Comprueba la palabra en el diccionario
		if (diccionario.containsKey(esp)) {
			System.out.println("Palabra en español: " + esp);
			System.out.println("Palabra en ingles: " + diccionario.get(esp));
		} else {
			System.out.println("Palabra no encontrada en el diccionario.");
		}
	}
}
