package exercise1;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaramos las variables
				double num1, num2, suma, resta, multiplicación;
				Scanner sc= new Scanner (System.in);
				
				//Instrucciones
				System.out.println("Escribe un número: ");
				System.out.println("Escribe otro número: ");
				
				num1 = sc.nextDouble();
				num2 = sc.nextDouble();
				
				suma = num1 + num2 ;
				resta= num1 - num2 ;
				multiplicación = num1 * num2;
				
				System.out.println("Suma: "+ suma);
				System.out.println("Resta: "+ resta);
				System.out.println("Multipliación: "+ multiplicación);
				
				sc.close();


	}

}
