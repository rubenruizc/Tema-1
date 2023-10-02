package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio10T1 {

	public static void main(String[] args) {
		
		// Variable donde guardaremos los centímetros que nos diga el usuario
		double centimetros;

		// Variable donde guardaremos los metros que hemos convertido
		double metros;

		// Variable donde guardaremos los centímetros sin decimales
		int centimetrosFinales;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que nos diga una longitud en metros
		System.out.print("Inserte una cantidad de metros: ");

		// Leemos el número
		metros = sc.nextDouble();

		// Operación para pasar de metros a centímetros
		centimetros = 100 * metros;

		// Operación para poder tener los centímetros sin decimales
		centimetrosFinales = (int) centimetros;

		// Le decimos al usuario cuantos serían los centímetros finales sin decimales
		System.out.println("La longitud añadida en metros son: " + centimetrosFinales + " centímetros (sin decimales).");

		// Cerramos el Scanner
		sc.close();

	}

}
