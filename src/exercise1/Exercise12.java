package exercise1;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaramos las variables
				Scanner sc = new Scanner (System.in);
				double longitud, área;
				double radio;
				
				//Instrucciones
				
				System.out.print("Escriba un radio: ");
				
				radio = sc.nextDouble();
				longitud = 2 * Math.PI * radio;
				área= Math.PI * (radio * radio);
				
				System.out.println("Longitud: " + longitud );
				System.out.println("Área: " + área);
				
				//Cierre
				sc.close();


	}

}
