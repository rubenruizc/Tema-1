package exercise1;

import java.util.Scanner;

public class Exercise20 {

	public static void main(String[] args) {

		// Declaramos las variables
		//Variable donde guardamos el número de la persona que escribe
		int numero;
		
		//Variable para indicar si es par o impar
		boolean num;
		
		//Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);

		//Le pido al usuario que escriba un número
		System.out.print("Escriba un numero y te diremos si es par o no: ");
		
		//Leemos el número
		numero = sc.nextInt();
		
		//Condición para que sea par 
		num = numero % 2 == 0;

		//Mostramos si es par o impar 
		System.out.println(num ? "Ese número es par":"Ese número es impar");
		
		//Cerramos el Scanner
		sc.close();
	}

}
