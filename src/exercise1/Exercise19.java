package exercise1;

import java.util.Scanner;

public class Exercise19 {

	public static void main(String[] args) {
		
		//Declaramos las variable que nos permitira saber si el usuario es mayor de edad
		boolean mayorEdad;
		
		//Declaramos la variable para saber la edad del usuario
		int edad;
		
		//Scanner para poder leer el teclado
		Scanner sc = new Scanner (System.in);
		
		//Instrucciones para el usuario
		System.out.println("Este programa evaluara si eres o no mayor de edad");
		
		//Le pedimos al usuario que escriba su edad
		System.out.print("Escriba su edad: ");
		
		//Leemos el número
		edad= sc.nextInt();
		
		//Condición para poder ser mayor de edad
		mayorEdad = edad>=18;
		
		//Mostramos al usuario si es mayor o menor de edad
		System.out.println(mayorEdad ? "Eres mayor de edad": "Eres menor de edad");
		
		//Cierre
		sc.close();

	}

}
