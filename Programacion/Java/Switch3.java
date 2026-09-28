//Objetivo: Agrupar múltiples casos sin usar break intermedios.
//Consigna: Dado un número entero int mes (1 a 12), indica cuántos días tiene dicho mes (año no bisiesto):
//• Meses 1, 3, 5, 7, 8, 10, 12 → "31 días"
//• Meses 4, 6, 9, 11 → "30 días"
//• Mes 2 → "28 días" | En otro caso → "Mes incorrecto"


import java.util.*;
public class Switch3{
		public static void main (String[] args){
		//Declaración de variables
		int mes=0;
		Scanner scanner = new Scanner(System.in);
		
		//Petición de datos
		System.out.println("Introduce el dia de la semana:");
		diasemana = scanner.nextInt();
		
		Switch (mes){
		case 1,3,5,7,8,10,12-> System.out.println("El mes tiene 31 dias");
		case 4,6,9,11-> System.out.println("El mes tiene 30 dias");
		case 2-> System.out.println("El mes tiene 28 dias");
		default-> System.out.println("Has introducido un caracter no válido");
		
		}
		
	}
}
