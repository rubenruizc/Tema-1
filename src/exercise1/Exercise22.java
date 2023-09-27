package exercise1;

import java.util.Scanner;

public class Exercise22 {

	public static void main(String[] args) {
		//Variable donde guardamos la primera nota 
		int nota1;
		
		//Variable donde guardamos la segunda nota
		int nota2;
		
		//Variable donde guardamos la tercera nota
		int nota3;
		
		//Variable donde guardamos la media de las tres notas enteras
		int media1;
		
		//Variable donde guardamos la media de las tres notas con decimales
		float media2;
		
		//Scanner para poder leer el teclado
		Scanner sc = new Scanner (System.in);
		
		//Le preguntamos al usuario su nota en el primer trimestre 
		System.out.print("Nota del primer trimestre: ");
		
		//Leemos el número
		nota1 = sc.nextInt();
		
		//Le preguntamos al usuario su nota en el segundo trimestre 
		System.out.print("Nota del segundo trimestre: ");
		
		//Leemos el número
		nota2 = sc.nextInt();
		
		//Le preguntamos al usuario su nota en el tercer trimestre 
		System.out.print("Nota del tercer trimestre: ");
		
		//Leemos el número
		nota3 = sc.nextInt();
		
		//Le decimos al usuario la nota media del curso
		System.out.println("Nota media del curso");
		
		//Operación para calcular la media de forma entera
		media1 = (nota1 + nota2 + nota3)/3;
		
		//Le decimos al usuario la nota media en el boletín de calificaciones
		System.out.println("En el boletín de calificaciones: " + media1);
		
		//Operación para calcular la media de forma decimal
		media2=(float)(nota1+nota2+nota3)/3;
		
		//Le decimos al usuario la nota media en el expediente académico
		System.out.println("En el expediente académico: " + media2);
		
		//Cerramos el scanner
		sc.close();
	}

}
