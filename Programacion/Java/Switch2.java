//Objetivo: Evaluar caracteres y compartir bloques para mayúsculas/minúsculas.
//Consigna: Dada una variable char nota = 'B'; , muestra la calificación usando switch :
//• 'A' / 'a' : "Sobresaliente" | • 'B' / 'b' : "Notable" | • 'C' / 'c' : "Aprobado" | • 'F' / 'f' :
//"Suspenso"
//Cualquier otra letra debe indicar "Nota no reconocida"

import java.util.*;
public class Switch2{
		public static void main (String[] args){
		//Declaración de variables
			char nota;	
			Scanner s = new Scanner(System.in);
		
			//Petición de datos
			System.out.println("Introduce la nota");
			nota = s.next().charAt(0);
		
			switch (nota){
				case 'a', 'A'-> System.out.println("Sobresaliente");
				case 'b','B'-> System.out.println("Notable");
				case 'c','C'-> System.out.println("Aprobado");
				case 'f','F'-> System.out.println("Suspenso");
				default-> System.out.println("Has introducido un caracter no válido");
			}
	}
}
		
