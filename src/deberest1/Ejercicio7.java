package deberest1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		double milimetros;

		// Variable donde guardamos los centímetros
		double centimetros;

		// Variable donde guardamos los metros
		double metros;

		// Variable donde guardamos la suma total de centímetros
		double total;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario una medida en milímetros
		System.out.println("Escriba una medida en milímetros: ");

		// Leemos el número
		milimetros = sc.nextDouble();

		// Le pedimos al usuario una medida en centímetros
		System.out.println("Escriba una medida en centímetros: ");

		// Leemos el número
		centimetros = sc.nextDouble();

		// Le pedimos al usuario una medida en metros
		System.out.println("Escriba una medida en metros: ");

		// Leemos el número
		metros = sc.nextDouble();

		// Operación para pasar los milímetros a centímetros
		milimetros = milimetros / 10;

		// Operación para pasar los metros a centímetros
		metros = metros * 100;

		// Operación para saber el total de centímetros
		total = milimetros + centimetros + metros;

		// Le decimos al usuario cuál sería la suma total
		System.out.println("La suma de las tres longitudes introducidas en centímetros es: " + total);

		// Cerramos el Scanner
		sc.close();

	}

}
