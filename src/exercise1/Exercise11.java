package exercise1;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {

		// Variable donde guardamos las notas y la media
		double nota1, nota2, media;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario la primera y la segunda nota
		System.out.println("Primera nota: ");
		System.out.println("Segunda nota: ");
		
		// Leemos los números
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		
		// Operación para calcular la media entera
		media = (nota1 + nota2) / 2;
		
		// Le decimos al usuario cual es su media
		System.out.println("Tu media aritmética es: " + media);
		
		// Cerramos el Scanner
		sc.close();

	}

}
