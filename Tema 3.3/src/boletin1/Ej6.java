package boletin1;

import java.util.Scanner;
import java.util.TreeSet;

public class Ej6 {

	public static void main(String[] args) {
		// Conjunto
		TreeSet<String> nombres = new TreeSet<>();

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
