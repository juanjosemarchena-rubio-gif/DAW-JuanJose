/*Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
euros la hora.*/
import java.util.*;
public class Libro4ejercicio4{
	public static void main(String [] args){
	Scanner s = new Scanner(System.in);
	System.out.println("¿Cuantas horas trabajaste en la semana?");
	int horas = s.nextInt();
	
		if(horas <= 40){
			int salario = horas * 12;
		System.out.println("Tu salario de la semana es " + salario + " euros");
		
		}else if(horas > 40){
			int extras = (horas - 40) * 16;
			int total = 40 * 12 + extras;
			System.out.println("Tu salario de la semana es " + total + " euros");
			}
	
	}
}

