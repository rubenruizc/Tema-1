package exercise1;

import java.util.Scanner;

public class Exercise21 {

	public static void main(String[] args) {
		
		//Declaramos las variables que nos ayudaran a saber si podemos o no salir
		boolean llueve, tareasFinalizadas, biblioteca, salir;
		
		//Scanner para que pueda leer el teclado
		Scanner sc = new Scanner (System.in);
		
		//Explicamos como podra responder el usuario
		System.out.println("SOLO PUEDES RESPONDER CON TRUE O FALSE");
		
		//Preguntas que tendra que contestar el usuario 
		System.out.println("¿Está lloviendo?");
		
		//Lee el siguiente boleean (true o false)
		llueve = sc.nextBoolean();
		
		//Preguntas que tendra que contestar el usuario
		System.out.println("¿Has hecho los deberes?");
		
		//Lee el siguiente boleean (true o false)
		tareasFinalizadas = sc.nextBoolean();
		
		//Preguntas que tendra que contestar el usuario
		System.out.println("¿Tienes que ir a la biblioteca?");
		
		//Lee el siguiente boleean (true o false)
		biblioteca = sc.nextBoolean();
		
		//Operador ternario que nos permite saber si podemos o no salir 
		salir = biblioteca || (!llueve && tareasFinalizadas);
		
		//Comunicamos al usuario si puede o no salir
		System.out.println(salir? "Puedes salir":"No puedes salir");
		
		//Cerramos el Scanner
		sc.close();
		
		
		



	}

}
