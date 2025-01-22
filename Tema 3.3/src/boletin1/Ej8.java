package boletin1;

import java.util.HashMap;
import java.util.Scanner;

public class Ej8 {
	// Crear el HashMap
	static HashMap<String, String> login = new HashMap<>();
	// Escaner
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Añadir valores usando put()
		login.put("usuario", "usuario");

		// Variable para el menu
		int ans;

		do {
			// Menu
			System.out.println("1. Registro");
			System.out.println("2. Login");
			System.out.println("0. Salir");
			ans = scanner.nextInt();

			// Accion seleccionada
			switch (ans) {
			case 1 -> insertar();
			case 2 -> buscar();
			}

		} while (ans != 0);
	}

	public static void insertar() {
		// Variables
		String user;
		String pass;

		// Pide los datos
		System.out.println("Dime el nombre de usuario: ");
		user = scanner.next();

		System.out.println("Dime la contraseña: ");
		pass = scanner.next();

		// Inserta los datos
		login.put(user, pass);

		System.out.println("Usuario registrado correctamente.");
	}

	public static void buscar() {
		// Variables
		String user;
		String pass;
		int intentos = 3;

		while (intentos > 0) {
			// Pide los datos
			System.out.println("Dime tu nombre de usuario: ");
			user = scanner.next();
			System.out.println("Dime tu contraseña: ");
			pass = scanner.next();

			// Comprueba las credenciales
			if (login.containsKey(user) && login.get(user).equals(pass)) {
				System.out.println("Acceso permitido");
				return; // Salir del método si las credenciales son correctas
			} else {
				intentos--;
				System.out
						.println("Usuario no encontrado o contraseña incorrecta. Te quedan " + intentos + " intentos.");
			}
		}

		System.out.println("Se han agotado los intentos. Acceso denegado.");
	}
}
