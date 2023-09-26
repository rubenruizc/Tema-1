package exercise1;

import java.util.Scanner;

public class Exercise18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaramos las variables de los productos vendidos
		int manzana, pera;
		
		//Declaramos las variables de los kilos de cada producto
		double kiloman, kilopera, total;
		
		//Scanner para poder leer el teclado
		Scanner sc = new Scanner(System.in);
		
		//Asignamos el precio a cada uno
		kiloman = 2.35;
		kilopera = 1.95;

		//Preguntamos al usuario sobre los kilos vendidos de manzana
		System.out.print("Kilos de manzanas vendidas en todo el año: ");
		
		//Leemos el número
		manzana= sc.nextInt();
		
		//Preguntamos al usuario sobre los kilos vendidos de peras
		System.out.print("Kilos de peras vendidas en todo el año: ");
		
		//Leemos el número
		pera= sc.nextInt();
		
		//Espacio de separación
		System.out.println();
		
		//Expresamos cuanto dinero ha ganado por kilo de manzanas
		System.out.println("Usted ha conseguido un total de: " + manzana * kiloman + " euros con las manzanas");
		
		//Expresamos cuanto dinero ha ganado por kilo de peras
		System.out.println("Usted ha conseguido un total de: " + pera * kilopera + " euros con las peras");
		
		//Operación para saber cuanto ha ganado en total
		total= (pera*kilopera) + (manzana*kiloman);
		
		//Expresamos cuanto ha ganado en total 
		System.out.println("En total has ganado: " + total + " euros");
		
		//Cierre
		sc.close();
		

		

	}

}
