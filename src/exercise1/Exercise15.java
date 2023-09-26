package exercise1;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaramos las variables
				String nombre;
				int edad;
				Scanner sc = new Scanner (System.in);
				
				//Instrucciones
				System.out.println("Nombre: ");
				System.out.println("Edad: ");
				
				nombre = sc.nextLine();
				edad = sc.nextInt();
				
				System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
				
				sc.close();


	}

}
