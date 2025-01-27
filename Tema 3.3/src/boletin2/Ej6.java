package boletin2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;

public class Ej6 {
	// Escáner
	static Scanner scanner = new Scanner(System.in);

	// Mapa para los contactos
	static TreeMap<String, HashSet<Integer>> contactos = new TreeMap<>();

	public static void main(String[] args) {
		// Variable para el menú
		int ans;

		do {
			// Menú
			System.out.println("1. Agregar contacto");
			System.out.println("2. Agregar teléfono a un contacto");
			System.out.println("3. Mostrar los teléfonos de un contacto");
			System.out.println("4. Eliminar un teléfono de un contacto");
			System.out.println("5. Eliminar un contacto");
			System.out.println("0. Salir");
			ans = scanner.nextInt();
			scanner.nextLine(); // Añadir una línea aquí para evitar problemas de entrada.

			// Acción seleccionada
			switch (ans) {
			case 1 -> añadirContacto();
			case 2 -> añadirTelefono();
			case 3 -> mostrarTeléfonos();
			case 4 -> eliminarTelefono();
			case 5 -> eliminarContacto();
			}

		} while (ans != 0);
	}

	public static void añadirContacto() {
		// Variable
		String nombre;

		// Pide los datos
		System.out.println("Escribe el nombre del nuevo contacto: ");
		nombre = scanner.nextLine();

		// Guarda en el mapa el contacto con un set vacío de teléfonos
		contactos.put(nombre, new HashSet<>());
		System.out.println("Contacto añadido correctamente.");
	}

	public static void añadirTelefono() {
		// Variables
		String nombre;
		int telefono;

		// Pide los datos
		System.out.println("Escribe el nombre del contacto: ");
		nombre = scanner.nextLine();

		if (contactos.containsKey(nombre)) {
			System.out.println("Escribe el número de teléfono: ");
			telefono = scanner.nextInt();
			scanner.nextLine(); // Añadir una línea aquí para evitar problemas de entrada.

			// Guarda en el mapa el número
			contactos.get(nombre).add(telefono);
			System.out.println("Teléfono añadido correctamente.");
		} else {
			System.out.println("El contacto '" + nombre + "' no está en la lista.");
		}
	}

	public static void mostrarTeléfonos() {
		// Variable
		String nombre;

		// Pide los datos
		System.out.println("Escribe el nombre del contacto que quieres buscar: ");
		nombre = scanner.nextLine();

		// Imprime el resultado del conjunto asociado a la key
		if (contactos.containsKey(nombre)) {
			System.out.println("Teléfonos de " + nombre + ": " + contactos.get(nombre));
		} else {
			System.out.println("El contacto '" + nombre + "' no está en la lista de contactos.");
		}
	}

	public static void eliminarTelefono() {
		// Variables
		String nombre;
		int telefono;

		// Pide los datos
		System.out.println("Escribe el nombre del contacto: ");
		nombre = scanner.nextLine();

		if (contactos.containsKey(nombre)) {
			System.out.println("Escribe el número de teléfono que quieres eliminar: ");
			telefono = scanner.nextInt();
			scanner.nextLine(); // Añadir una línea aquí para evitar problemas de entrada.

			// Elimina el número de teléfono
			if (contactos.get(nombre).remove(telefono)) {
				System.out.println("Teléfono eliminado correctamente.");
			} else {
				System.out.println("El teléfono no está en la lista del contacto.");
			}
		} else {
			System.out.println("El contacto '" + nombre + "' no está en la lista.");
		}
	}

	public static void eliminarContacto() {
		// Variable
		String nombre;

		// Pide los datos
		System.out.println("Escribe el nombre del contacto que quieres eliminar: ");
		nombre = scanner.nextLine();

		// Elimina el contacto
		if (contactos.remove(nombre) != null) {
			System.out.println("Contacto eliminado correctamente.");
		} else {
			System.out.println("El contacto no está en la lista.");
		}
	}
}
