package boletin1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// Conjunto
		LinkedHashSet<String> nombres = new LinkedHashSet<>();

		// Escaner
		Scanner scanner = new Scanner(System.in);

		// Variable para la respuesta
		String ans = "";

		// Pide datos
		System.out.println("Introduce nombres, escribe fin para terminar");
		ans = scanner.next();

		// Bucle
		while (!ans.equals("fin")) {
			nombres.add(ans);
			ans = scanner.next();

		}

		// Imprime
		System.out.println("Nombres introducidos ordenados: ");
		for (String nombre : nombres) {
			System.out.print(nombre + " ");
		}

		scanner.close();
	}

}
