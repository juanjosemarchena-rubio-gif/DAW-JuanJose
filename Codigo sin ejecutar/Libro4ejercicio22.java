/*Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
a las 15:00h*/

import java.util.*;
public class Libro4ejercicio22{
    public static void main(String [] args){
    
    Scanner s = new Scanner(System.in);
    String dia = 0;
    int h = 0;
    int m = 0;
    int fin = 6660;
    int queda = 0;
    System.out.println("¿Qué día es hoy?");
    dia = s.next();
    System.out.println("¿En qué hora en punto estamos?");
    h = s.nextInt();
    System.out.println("¿Cuantos minutos?");
    m = s.nextInt();

    }
}
