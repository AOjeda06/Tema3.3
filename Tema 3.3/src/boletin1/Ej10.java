package boletin1;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ej10 {
	// Crear el TreeMap
	static TreeMap<String, Double> inventario = new TreeMap<>();
	// Escáner
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Insertar productos por defecto
		inicializarProductos();

		int ans;

		do {
			// Menú
			System.out.println("1. Alta de producto");
			System.out.println("2. Baja de producto");
			System.out.println("3. Listar existencias");
			System.out.println("0. Salir");
			ans = scanner.nextInt();

			// Acción seleccionada
			switch (ans) {
			case 1 -> alta();
			case 2 -> baja();
			case 3 -> listar();
			}

		} while (ans != 0);
	}

	public static void inicializarProductos() {
		// Inserciones a la coleccion
		inventario.put("Manzanas", 1.5);
		inventario.put("Plátanos", 0.9);
		inventario.put("Leche", 1.2);
		inventario.put("Pan", 0.8);
		inventario.put("Huevos", 2.5);
		inventario.put("Mantequilla", 1.8);
		inventario.put("Queso", 3.0);
		inventario.put("Café", 4.5);
		inventario.put("Azúcar", 1.1);
		inventario.put("Harina", 0.7);
	}

	public static void alta() {
		// Variables
		String producto;
		double precio;

		// Pide los datos
		System.out.println("Dime el nombre del producto: ");
		producto = scanner.next();

		System.out.println("Dime el precio: ");
		precio = scanner.nextDouble();

		// Inserta los datos
		inventario.put(producto, precio);

		System.out.println("Producto registrado correctamente.");
		System.out.println();
	}

	public static void baja() {
		// Variables
		String producto;

		// Pide los datos
		System.out.println("Dime el nombre del producto: ");
		producto = scanner.next();

		// Elimina el producto
		inventario.remove(producto);

		System.out.println("Producto eliminado correctamente.");
		System.out.println();
	}

	public static void listar() {
		// Recorre el TreeMap con un for each imprimiendo su contenido uno a uno
		for (Map.Entry<String, Double> entry : inventario.entrySet()) {
			System.out.println("Producto: " + entry.getKey() + ", Precio: " + entry.getValue() + "€");
		}
		System.out.println();
	}
}
