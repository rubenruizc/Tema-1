package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio4T1 {

	public static void main(String[] args) {
		
		//Variables donde guardamos los datos de la base, la altura y el área
		double base, altura, área;
		
		//Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario que escriba una base para el triángulo
		System.out.println("Escriba la base de un triángulo: ");
		
		//Leemos el número
		base = sc.nextDouble();
		
		//Le pedimos al usuario que escriba una altura para el triángulo
		System.out.println("Escriba la altura de un triángulo: ");
		
		//Leemos el número
		altura = sc.nextDouble();
		
		//Operación para calcular el área
		área = (base * altura) / 2;
		
		//Le decimos al usuario cual es el área de su triángulo
		System.out.println("El área de el triangulo es: " + área);
		
		//Cerramos el Scanner 
		sc.close();
	}

}
