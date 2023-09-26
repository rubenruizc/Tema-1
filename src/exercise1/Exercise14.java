package exercise1;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaramos las varibles
				String nombre, dirección;
				int teléfono;
				Scanner sc = new Scanner (System.in);
				
				//Instrucciones
				System.out.println("Escriba su nombre: ");
				System.out.println("Escriba su dirección: ");
				System.out.println("Escriba su teléfono: ");
				
				nombre = sc.nextLine();
				dirección = sc.nextLine();
				teléfono = sc.nextInt();
				
				System.out.println();
				System.out.println("Nombre: " + nombre);
				System.out.println("Dirección: " + dirección);
				System.out.println("Teléfono: " + teléfono);
				
				sc.close();


	}

}
