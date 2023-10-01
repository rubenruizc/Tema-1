package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio1T1 {

	public static void main(String[] args) {

		// Variable donde guardamos el número entero
		int numeroent;

		// Variable donde guardamos el número con decimales (también podia ser float)
		double numerodec;

		// Scanner para poder leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que escriba un número con decimales
		System.out.print("Escriba un número con decimales: ");

		// Leemos el número
		numerodec = sc.nextDouble();

		/*
		 * Decimos que el numeroent es un número sin decimales y le sumamos 0,5 ya que
		 * el programa siempre redondea por lo bajo
		 */
		numeroent = (int) (numerodec + 0.5);

		// Le decimos al usuario cual es su numero redondeado
		System.out.println("Su número redondeado sería: " + numeroent);

		// Cerramos el Scanner
		sc.close();
	}

}
