/*Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
a las 15:00h*/

import java.util.*;
public class Libro4ejercicio22{
    public static void main(String [] args){
    
    Scanner s = new Scanner(System.in);
    String dia;
    int h = 0;
    int m = 0;
    int fin = 0;
    int queda = 0;
    System.out.println("¿Qué día es hoy?");
    dia = s.next();
    System.out.println("¿En qué hora en punto estamos?");
    h = s.nextInt();
    System.out.println("¿Cuantos minutos?");
    m = s.nextInt();
		switch(dia){
			case "lunes","Lunes","LUNES" -> {fin = ((24 * 4) + 15) * 60;
			queda = fin - (h * 60 + m);
			System.out.println("Quedan para el fin de semana " + queda + " minutos");}
			case "martes","Martes","MARTES" -> {fin = ((24 * 3) + 15) * 60;
			queda = fin - (h * 60 + m);
			System.out.println("Quedan para el fin de semana " + queda + " minutos");}
			case "miercoles","Miercoles","MIERCOLES" -> {fin = ((24 * 2) + 15) * 60;
			queda = fin - (h * 60 + m);
			System.out.println("Quedan para el fin de semana " + queda + " minutos");}
			case "jueves","Jueves","JUEVES" -> {fin = ((24 * 1) + 15) * 60;
			queda = fin - (h * 60 + m);
			System.out.println("Quedan para el fin de semana " + queda + " minutos");}
			case "VIERNES","Viernes","viernes" -> {fin = 15 * 60;
			queda = fin - (h * 60 + m);
			System.out.println("Quedan para el fin de semana " + queda + " minutos");}
			default -> System.out.println("Los valores introducidos son incorrectos");
			}
		
    

    }
}
