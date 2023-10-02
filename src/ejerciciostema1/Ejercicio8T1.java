package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio8T1 {

	public static void main(String[] args) {
		
		// Constante donde guardamos el precio de las entradas infantiles
		final float infantil = 15.50f;

		// Constante donde guardamos el descuento que aplicaremos en algunos casos
		final float descuento = 0.05f;

		// Constante donde guardamos el precio de las entradas adultas
		final int adulto = 20;

		// Variable donde guardamos el importe total de la compra
		double importeTotal;

		// Variable donde guardamos el número de entradas infantiles
		int entradasI;

		// Variable donde guardamos el numero de entradas adultas
		int entradasA;

		// Scanner para poder leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le preguntamos cuantas entradas infantiles desea
		System.out.println("¿Cuantas entradas infantiles desea?");

		// Leemos el número
		entradasI = sc.nextInt();

		// Le preguntamos cuantas entradas adultas desea
		System.out.println("¿Cuantas entradas adultas desea?");

		// Leemos el número
		entradasA = sc.nextInt();

		// Operación para calcular el importe total de las entradas infantiles y adultas
		importeTotal = (infantil * entradasI) + (adulto * entradasA);

		// Le decimos al usuario cuanto sería el importe total
		System.out.println("Tendra que abonar un total de: " + importeTotal + " euros.");

		// Operación para saber cuando aplicar o no el descuento
		importeTotal = importeTotal >= 100 ? importeTotal - (importeTotal * descuento) : importeTotal;

		// Le avisamos al usuario sobre el descuento
		System.out.println("Si su compra es igual o superior a 100 € le haremos un descuento del 5%");

		// Le enseñamos al usuario su importe final con descuento en caso de que este haya sido aplicado
		System.out.println("Su importe final será de: " + importeTotal + " euros.");

		// Cerramos el Scanner
		sc.close();
	}

}
