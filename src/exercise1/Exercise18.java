package exercise1;

import java.util.Scanner;

public class Exercise18 {

	public static void main(String[] args) {
		
		//Constante del precio del kilo de manzana
		final float PRECIO_MANZANA = 2.35f;
		
		//Constante del precio del kilo de peras
		final float PRECIO_PERAS = 1.95f;
		
		//Variable de la cantidad de kilos de manzanas vendidos
		float kiloManzana;
		
		//Variable de la cantidad de kilos de peras vendidos
		float kiloPera;
		
		//Variable para calcular el precio total de manzanas y peras
		float total;
		
		//Variable para calcular cuanto dinero ha ganado con las manzanas
		float total1;
		
		//Variable para calcular cuanto dinero ha ganado con las peras
		float total2;
		
		//Scanner para poder leer el teclado
		Scanner sc = new Scanner (System.in);
		
		//Le preguntamos al usuario cuantos kilos de manzanas ha vendido
		System.out.println("¿Cuantos kilos de manzanas has vendido este año?");
		
		//Leemos el número de kilos de manzanas
		kiloManzana = sc.nextFloat();
		
		//Le preguntamos al usuario cuantos kilos de peras ha vendido
		System.out.println("¿Cuantos kilos de peras has vendido este año?");
		
		//Leemos el número de kilos de peras
		kiloPera = sc.nextFloat();
		
		//Operación para saber el total de dinero conseguido con manzanas y peras
		total = (kiloManzana * PRECIO_MANZANA) + (kiloPera * PRECIO_PERAS);
		
		//Operación para saber el total de dinero conseguido con manzanas
		total1= kiloManzana * PRECIO_MANZANA;
		
		//Operación para saber el total de dinero conseguido con peras
		total2 = kiloPera * PRECIO_PERAS;
		
		//Espacio entre línea y línea
		System.out.println();
		
		//Le decimos al usuario cuanto dinero ha ganado en total
		System.out.print("Usted ha ganado un total de " + total + " euros.");
		
		//Le decimos al usuario cuanto dinero ha ganado por una parte con las manzanas y por otra parte con las peras
		System.out.println("De esos " + total + ", " + total1 + " euros son de manzanas y " + total2 + " euros son de peras");
		
		//Cerramos el Scanner
		sc.close();
		

		

	}

}
