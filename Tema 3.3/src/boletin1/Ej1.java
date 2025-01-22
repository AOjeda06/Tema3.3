package boletin1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// Escaner
		Scanner scanner = new Scanner(System.in);
		// ArrayList para los numeros
		ArrayList<Integer> numeros = new ArrayList<>();
		// Variable para los numeros introducidos
		int num;
		// Empieza a pedir numeros
		System.out.println("Escibre numeros enteros (escribe uno negativo para terminar): ");
		num = scanner.nextInt();
		// Guarda los positivos
		do {
			numeros.add(num);
			num = scanner.nextInt();
		} while (num >= 0);
		// Imprime los pares con un for each
		System.out.println("Numeros pares introducidos");
		for (Integer numero : numeros) {
			if (numero % 2 == 0) {
				System.out.print(numero + " ");
			}
		}
		// Cerramos el scanner
		scanner.close();
	}

}
