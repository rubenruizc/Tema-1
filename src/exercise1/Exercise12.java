package exercise1;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {

		//Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		//Variables para guardar la longitud y área de la circunferencia
		double longitud, área;
		
		//Variable para guardar el radio de la circunferencia
		double radio;
		
		//Le pedimos al usuario que nos diga un radio
		System.out.print("Escriba un radio: ");
		
		//Leemos el número
		radio = sc.nextDouble();
		
		//Operación para calcular la longitud de la circunferencia
		longitud = 2 * Math.PI * radio;
		
		//Operación para calcular el área de la circunferencia
		área = Math.PI * (radio * radio);
		
		//Le decimos al usuario cual sera la longitud y cual el área
		System.out.println("Longitud: " + longitud);
		System.out.println("Área: " + área);
		
		//Cerramos el Scanner
		sc.close();

	}

}
