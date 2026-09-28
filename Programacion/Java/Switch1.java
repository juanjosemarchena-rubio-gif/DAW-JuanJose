//Objetivo: Escribir un switch completo desde cero.
//Consigna: Crea un programa que declare una variable entera int diaSemana (con un valor del 1 al 7). Usa un
//switch para imprimir el día ("Lunes" para 1, "Martes" para 2, ..., "Domingo" para 7). Si el número no está en ese
//rango, debe mostrar "Día no válido"

import java.util.*;
public class Switch1{
		public static void main (String[] args){
		//Declaración de variables
		int diasemana=0;
		
		Scanner scanner = new Scanner(System.in);
		
		//Petición de datos
		System.out.println("Introduce el dia de la semana:");
		diasemana = scanner.nextInt();
		
		switch (diasemana){
			case 1-> System.out.println("Lunes");
			case 2-> System.out.println("Martes");
			case 3-> System.out.println("Miércoles");
			case 4-> System.out.println("Jueves");
			case 5-> System.out.println("Viernes");
			case 6-> System.out.println("Sábado");
			case 7-> System.out.println("Domingo");
			default-> System.out.println("Has introducido una numeración no válida");
		}
	}
}
