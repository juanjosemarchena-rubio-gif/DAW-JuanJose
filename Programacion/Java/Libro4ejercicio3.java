/*Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.*/

import java.util.*;
public class Libro4ejercicio3{
	public static void main(String [] args){
	Scanner s = new Scanner(System.in);
	System.out.println("Introduce un número del 1 al siete para conocer el día de la semana");
	int num = s.nextInt();
		switch(num){
		case 1 -> System.out.println("El número " + num + " corresponde al lunes");
		case 2 -> System.out.println("El número " + num + " corresponde al martes");
		case 3 -> System.out.println("El número " + num + " corresponde al miércoles");
		case 4 -> System.out.println("El número " + num + " corresponde al jueves");
		case 5 -> System.out.println("El número " + num + " corresponde al viernes");
		case 6 -> System.out.println("El número " + num + " corresponde al sábado");
		case 7 -> System.out.println("El número " + num + " corresponde al domingo");
		default -> System.out.println("El número que has introducido no corresponde a ningun día");
		}
	}
}
