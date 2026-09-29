/*Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la asignatura Programación para obtener la nota deseada. Hay que tener en cuenta que la nota del primer examen cuenta el 40% y la del segundo examen un 60%.*/

import java.util.Scanner;
public class Libro3ejercicio13{
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.println("Introduce la nota del primer examen");
double nota1 = s.nextDouble();
System.out.println("¿Qué nota deseas sacar en el trimestre?");
double notad = s.nextDouble();
double nota2 = (notad - nota1 * 0.4) / 0.6;
System.out.println("Si la nota que deseas es " + notad + " la nota que necesitas en el segundo examen es " + nota2);

//Pendiente de  ejecutar
}
}