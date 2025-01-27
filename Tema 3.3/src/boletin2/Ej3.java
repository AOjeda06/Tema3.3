package boletin2;

import java.util.Map;
import java.util.TreeMap;

public class Ej3 {
	// Crear TreeMap para las letras
	static TreeMap<Character, Integer> letras = new TreeMap<>();

	// Frase a analizar
	static String frase = "En un agujero en el suelo, vivia un hobbit. No un agujero humedo, sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad";

	public static void main(String[] args) {
		// Llamamos a las funciones
		contarLetras();
		verEstadisticas();
	}

	public static void contarLetras() {
		// Bucle que recorre el string entero
		for (int i = 0; i < frase.length(); i++) {
			// Creamos una variable para hacer referencia a la letra en la posicion i
			char c = Character.toLowerCase(frase.charAt(i));
			// Comprobamos si es una letra
			if (Character.isLetter(c)) {
				// Actualizamos sus estadísticas
				if (letras.containsKey(c)) {
					letras.put(c, letras.get(c) + 1);
					// O la registramos si es nueva
				} else {
					letras.put(c, 1);
				}
			}
		}
	}

	public static void verEstadisticas() {
		System.out.println("Estadísticas de letras:");
		// Este bucle recorre el mapa entero
		for (Map.Entry<Character, Integer> entry : letras.entrySet()) {
			System.out.println("Letra " + entry.getKey() + ": " + entry.getValue() + " veces");
		}
	}
}
