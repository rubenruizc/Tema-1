package exercise1;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaración de variables 
		int edad;
		Scanner sc= new Scanner (System.in);
		
		
	//Instrucciones
		System.out.println("Introduzca su edad:");
		
		edad=sc.nextInt();
		
		edad = edad + 1;
		
		
		System.out.println("Su edad es: " + edad + " años");
	 
//Cierre
		sc.close();
	
	
	
	}

	

}
