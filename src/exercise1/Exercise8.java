package exercise1;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		
		// Variable donde guardamos el número que nos va a introducir el usuario
		int numero;
		
		//Scanner para poder leer el teclado
		Scanner sc = new Scanner(System.in);

		//Le pedimos un número al usuario
		System.out.println("Introduzca su número de usuario: ");
		
		//Leemos el número
		numero = sc.nextInt();
		
		//Le decimos cual es su número
		System.out.println("Su número es: " + numero);

		//Cerramos el Scanner 
		sc.close();

	}

}
