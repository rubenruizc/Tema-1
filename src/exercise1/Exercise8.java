package exercise1;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Declaración de variables
int numero;

Scanner sc= new Scanner (System.in);

//Instrucciones

System.out.println("Introduzca su número de usuario:");
numero= sc.nextInt();

System.out.println("Su número es: " + numero);

//Cierre
sc.close();

	}

}
