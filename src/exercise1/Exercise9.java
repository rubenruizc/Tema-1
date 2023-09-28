package exercise1;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {

		// Variable donde guardamos la edad del usuario
		int edad;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos la edad al usuario
		System.out.println("Introduzca su edad:");
		
		// Leemos el número
		edad = sc.nextInt();
		
		// Operación para calcular su edad el próximo año
		edad = edad + 1;
		
		// Le decimos al usuario cual será su edad el próximo año
		System.out.println("Su edad el próximo año será: " + edad + " años");

		//Cierre
		sc.close();

	}

}
