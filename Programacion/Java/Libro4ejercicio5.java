/*Escribe un programa que dada una hora determinada (horas y minutos),
calcule los segundos que faltan para llegar a la medianoche.*/

import java.util.*;
public class Libro4ejercicio5{
	public static void main(String [] args){
	Scanner s = new Scanner(System.in);
	System.out.println("Introduce la hora");
	int hora = s.nextInt();
	System.out.println("Introduce los minutos");
	int minutos = s.nextInt();
	int hseg = hora * 3600;
	int mseg = minutos * 60;
	int seg = hseg + mseg;
	int medianoche = 24 * 3600;
	int falta = medianoche - seg;
	System.out.println("Para medianoche quedan " + medianoche + " segundos");
	
	
	
	}
}

