package exercise1;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		// Declaramos las variables
		double nota1, nota2, media;
		Scanner sc = new Scanner(System.in);
		
		//Instrucciones
		System.out.println("Primera nota:");
		System.out.println("Segunda nota:");
		
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		media = (nota1 + nota2)/2;
		
		System.out.println("Tu media aritmética es: " + media);
		
		sc.close();

	}

}
