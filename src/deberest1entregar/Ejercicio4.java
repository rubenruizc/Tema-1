package deberest1entregar;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Variable donde guardamos los datos de la base
		double base;

		// Variable donde guardamos los datos de la altura
		double altura;

		// Variable donde guardamos los datos del área
		double area;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que escriba una base para el triángulo
		System.out.println("Escriba la base de un triángulo: ");

		// Leemos el número
		base = sc.nextDouble();

		// Le pedimos al usuario que escriba una altura para el triángulo
		System.out.println("Escriba la altura de un triángulo: ");

		// Leemos el número
		altura = sc.nextDouble();

		// Operación para calcular el área
		area = (base * altura) / 2;

		// Le decimos al usuario cual es el área de su triángulo
		System.out.println("El área de el triangulo es: " + area);

		// Cerramos el Scanner
		sc.close();
	}

}
