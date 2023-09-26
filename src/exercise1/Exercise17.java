package exercise1;

import java.util.Scanner;

public class Exercise17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaramos la variable
				int iva;
				double precio, total;
				Scanner sc = new Scanner (System.in);
				iva = 21;
				
				//Instrucciones
				System.out.print("Escriba el precio de algo: ");
				precio = sc.nextDouble();
				total = precio + iva;
				
				System.out.println("Su precio con IVA incluido será de: " + total + " euros" );
				
				sc.close();


	}

}
