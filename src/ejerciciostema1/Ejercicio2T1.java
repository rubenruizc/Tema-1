package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio2T1 {

	public static void main(String[] args) {

		// Variables donde guardamos el número del usuario
		int nument;
		
		// Variable donde guardamos el resto de la división entre 7
		int multiplo;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);                                    
		
		// Le pedimos al usuario que nos diga un número entero
		System.out.print("Escriba un número entero: ");
		
		// Leemos el número
		nument = sc.nextInt();
		
		// Operación para calcular cuanto hay que sumarle al número del usuario
		multiplo = 7 - (nument % 7);
		
		// Operador Ternario para no sumar cuando sea múltiplo de 7
		nument = multiplo == 7 ? 0 : multiplo;
		
		// Le decimos al usuario cuanto hay que sumarle a su número
		System.out.println("Para que su número sea multiplo de 7 hay que sumarle: " + nument);
		
		// Cerramos el Scanner
		sc.close();
	}

}
