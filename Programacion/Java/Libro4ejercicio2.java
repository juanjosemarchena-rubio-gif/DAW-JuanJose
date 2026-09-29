/*Realiza un programa que pida una hora por teclado y que muestre luego buenos días buenas tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5 respectivamente. Solo se tiene en cuenta las horas, los minutos no se deben introducir por teclado.*/

import java.util.*;
public class Libro4ejercicio2{
public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce la hora sin minutos");
    int hora = s.nextInt();
    switch(hora) {
    case 6,7,8,9,10,11,12 -> System.out.println("¡Buenos días!");
    case 13,14,15,16,17,18,19,20 ->System.out.println("¡Buenas tardes!");
    case 21,22,23,0,1,2,3,4,5 -> System.out.println("¡Buenas noches!");
    default -> System.out.println("Los campos introducidos no son correctos");
    }
}
}
