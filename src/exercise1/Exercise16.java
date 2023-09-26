package exercise1;

import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaramos las variables
				double euro, pesetas;
				Scanner sc = new Scanner (System.in);
				 euro = 166.6666666666667;//pesetas
				
				 System.out.print("Escriba un número de euros: ");
				 pesetas = sc.nextDouble();
				 System.out.println("Equivalen a: " + euro * pesetas + " pesetas");
				
				 pesetas = 0.006;//euros
				 System.out.println();
				 System.out.print("Escriba un número de pesetas: ");
				 euro = sc.nextDouble();
				 System.out.println("Equivalen a: " + euro * pesetas + " euros");
				
				sc.close();


	}

}
