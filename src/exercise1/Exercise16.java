package exercise1;

import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {

		// Variable donde guardamos los euros
		double euro;
		
		// Variable donde guardamos las pesetas
		double pesetas;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Número de pesetas en un euro
		euro = 166.6666666666667;
		
		// Le pedimos al usuario un número de euros
		System.out.print("Escriba un número de euros: ");
		
		// Leemos el número
		pesetas = sc.nextDouble();
		
		// Le decimos al usuario la equivalencia
		System.out.println("Equivalen a: " + euro * pesetas + " pesetas");
		
		// Número de eruos en una peseta
		pesetas = 0.006;
		
		// Espacio entre líneas
		System.out.println();
		
		// Le pedimos al usuario un número de pesetas
		System.out.print("Escriba un número de pesetas: ");
		
		// Leemos el número
		euro = sc.nextDouble();
		
		// Le decimos al usuario la equivalencia
		System.out.println("Equivalen a: " + euro * pesetas + " euros");
		
		// Cerramos el Scanner
		sc.close();

	}

}
