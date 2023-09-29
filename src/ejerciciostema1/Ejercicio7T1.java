package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio7T1 {

	public static void main(String[] args) {
		
		double milimetros, centimetros, metros;
		double total;
		Scanner sc = new Scanner (System.in);
		System.out.println("Escriba una medida en milímetros: ");
		milimetros = sc.nextDouble();
		System.out.println("Escriba una medida en centrímetros: ");
		centimetros = sc.nextDouble();
		System.out.println("Escriba una medida en metros: ");
		metros = sc.nextDouble();
		
		milimetros = milimetros / 10;
		metros = metros * 100;
		total = milimetros + centimetros + metros;
		
		System.out.println("La suma de las tres longitudes introducidas en centimetros es: " + total);
		
		sc.close();
		
		
		
	}

}
