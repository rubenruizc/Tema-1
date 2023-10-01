package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio5T1 {

	public static void main(String[] args) {

		// Variable donde guardamos el valor de a
		double a;
		
		// Variable donde guardamos el valor de b
		double b;
		
		// Variable donde guardamos el valor de c
		double c;
		
		// Variable donde guardamos el valor de x
		double x;
		
		// Variable donde guardamos el valor de y
		double y;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le explicamos al usuario en que consiste el ejercicio
		System.out.println("Tenemos la siguiente expresión: y=ax^2+bx+c");

		// Le pedimos al usuario un valor para a
		System.out.print("Escriba un valor para a: ");

		// Leemos el número
		a = sc.nextDouble();

		// Le pedimos al usuario un valor para b
		System.out.print("Escriba un valor para b: ");

		// Leemos el número
		b = sc.nextDouble();

		// Le pedimos al usuario un valor para c
		System.out.print("Escriba un valor para c: ");

		// Leemos el número
		c = sc.nextDouble();

		// Le pedimos al usuario un valor para x
		System.out.print("Escriba un valor para x: ");

		// Leemos el número
		x = sc.nextDouble();

		// Operación para calcular y
		y = (a * Math.pow(x, 2)) + b * x + c;

		// Le mostramos al usuario cual es el valor final de y
		System.out.println("Tras hacer la operación la Y es igual a: " + y);

		// Cerramos el Scanner
		sc.close();
	}

}
