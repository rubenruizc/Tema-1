package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio6T1 {

	public static void main(String[] args) {
		//Variable donde guardamos los varables de los segundos, horas y minutos
		int segundos, horas, minutos, resto;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner (System.in);
		
		//Le pedimos al usuario que escriba un número de segundos
		System.out.println("Escriba una cantidad de segundos: ");
		
		//Leemos el número del teclado
		segundos = sc.nextInt();
		
		//Variable con el resto
		resto = segundos % 3600;
		
		//Operación para pasar de segundos a horas 
		horas = segundos / 3600;
		
		//Operación para pasar de segundos a minutos
		minutos = resto / 60 ; 
		
		//Operación para obtener los segundos sobrantes
		segundos = resto % 60; 
		
		// Le decimos al usuario el resultado
		System.out.println("Tus segundos son: " + horas +  " hora/s, " + minutos + " minuto/s, " + segundos + " segundo/s");
		
		//Cerramos el Scanner
		sc.close();
	}

}
