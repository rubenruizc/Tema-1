package exercise1;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaración de variables
		int anioActual, anioNacimiento, edad;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Escribe el año actual: ");

			System.out.println("Escribe el anio cuando naciste:");

			anioActual = sc.nextInt();

			anioNacimiento = sc.nextInt();

//Instrucciones

			System.out.println("Estamos en el año: " + anioActual);

			System.out.println();

			System.out.println("Tu anio de nacimiento es: " + anioNacimiento);

			System.out.println();

			edad = anioActual - anioNacimiento;

			System.out.println("Tu edad es: " + edad + " anios");

			sc.close();

		}
	}
}
