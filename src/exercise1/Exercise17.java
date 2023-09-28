package exercise1;

import java.util.Scanner;

public class Exercise17 {

	public static void main(String[] args) {
		
		// Constante donde guardamos el valor del IVA
		final int IVA = 21;
		
		// Variable donde guardamos el precio que nos diga el usuario
		double precio;
		
		// Variable donde guardamos el total del precio
		double total;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario un precio
		System.out.print("Escriba el precio de algo: ");
		
		// Leemos el precio/número
		precio = sc.nextDouble();
		
		// Operación para calcular el precio total
		total = precio + IVA;
		
		// Le decimos al usuario cual será el precio final incluyendo el IVA
		System.out.println("Su precio con IVA incluido será de: " + total + " euros");
		
		// Cerramos el Scanner
		sc.close();

	}

}
