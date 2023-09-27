package exercise1;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {

		// Variable para guardar los números y las operaciones
		double num1, num2, suma, resta, multiplicación;
		
		//Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);

		//Le pedimos al usuario que nos escriba dos números para sumarlos, restarlos y multiplicarlos
		System.out.println("Escribe un número: ");
		System.out.println("Escribe otro número: ");
		
		//Leemos los números
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		
		//Operaciones para la suma, la resta y la multiplicación
		suma = num1 + num2;
		resta = num1 - num2;
		multiplicación = num1 * num2;
		
		// Le decimos al usuario cual sería el resultado de la suma
		System.out.println("Suma: " + suma);
		
		// Le decimos al usuario cual sería el resultado de la resta
		System.out.println("Resta: " + resta);
		
		// Le decimos al usuario cual sería el resultado de la multiplicación
		System.out.println("Multipliación: " + multiplicación);
		
		// Cerramos el Scanner
		sc.close();

	}

}
