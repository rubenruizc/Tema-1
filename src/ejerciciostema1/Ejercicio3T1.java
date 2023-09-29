package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio3T1 {

	public static void main(String[] args) {
		
		// Variables donde guardamos los números del usuario
				int num1, num2;
				
				// Variable donde guardamos la operación para que sea múltiplo
				int multiplo;
				
				// Scanner para leer el teclado
				Scanner sc = new Scanner(System.in);                                    
				
				// Le pedimos al usuario que nos diga un número entero
				System.out.print("Escriba un número entero: ");
				
				// Leemos el número
				num1 = sc.nextInt();
				
				// Le pedimos al usuario que nos diga un número entero
				System.out.print("Escriba otro número entero: ");
				
				// Leemos el número
				num2 = sc.nextInt();
				
				// Operación para calcular cuanto hay que sumarle al número del usuario
				multiplo = num2 - (num1 % num2);
				
				// Operador Ternario para no sumar cuando sea múltiplo de num2
				num1 = multiplo == num2 ? 0 : multiplo;
				
				// Le decimos al usuario cuanto hay que sumarle a su número
				System.out.println("Para que su número sea multiplo de " + num2 + " hay que sumarle: " + num1);
				
				// Cerramos el Scanner
				sc.close();
	
	}

}
