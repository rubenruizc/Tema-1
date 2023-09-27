package exercise1;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		// Variable para guardar el nombre que nos diga el usuario
		String nombre;
		
		//Variable para guardar la dirección que nos diga el usuario
		String dirección;
		
		//Variable para guardar el número de teléfono que nos diga el usuario
		int teléfono;
		
		//Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario un nombre, una dirección y un número de teléfono
		System.out.println("Escriba su nombre: ");
		System.out.println("Escriba su dirección: ");
		System.out.println("Escriba su teléfono: ");
		
		//Leemos el nombre, dirección y número de teléfono
		nombre = sc.nextLine();
		dirección = sc.nextLine();
		teléfono = sc.nextInt();
		
		//Espacio entre líneas
		System.out.println();
		
		//Le decimos el nombre, la dirección y el número de teléfono
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + dirección);
		System.out.println("Teléfono: " + teléfono);
		
		//Cerramos el Scanner
		sc.close();

	}

}
