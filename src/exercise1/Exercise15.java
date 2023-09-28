package exercise1;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		
		// Variable donde guardamos el nombre que nos diga el usuario
		String nombre;
		
		// Variable donde guardamos la edad que nos diga el usuario
		int edad;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario un nombre y una edad
		System.out.println("Nombre: ");
		System.out.println("Edad: ");
		
		// Leemos el nombre y la edad
		nombre = sc.nextLine();
		edad = sc.nextInt();
		
		// Le decimos al usuario su nombre y su edad
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
		
		// Cerramos el Scanner
		sc.close();

	}

}
