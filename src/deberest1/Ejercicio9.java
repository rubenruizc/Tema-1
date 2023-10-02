package deberest1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		// Variable donde guardamos el primer número
		int num1;

		// Variable donde guardamos el segundo número
		int num2;

		// Variable donde guardamos la solución del ejercicio
		boolean solucion;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que escriba un número
		System.out.println("Escriba un número: ");

		// Leemos el número
		num1 = sc.nextInt();

		// Le pedimos al usuario que escriba otro número
		System.out.println("Escriba otro número: ");

		// Leemos el número
		num2 = sc.nextInt();

		// Operación para saber si los dos números son iguales
		solucion = num1 == num2;

		// Le decimos al usuario si los números son o no iguales
		System.out.println(solucion ? "Los dos números son iguales" : "Los dos números no son iguales");

		// Cerramos el Scanner
		sc.close();

	}

}
