/*Escribe un programa que calcule el área de un rectángulo.*/

import java.util.Scanner;
public class Libro3ejercicio5{
public static void main(String [] args){
	
	Scanner s = new Scanner(System.in);
	System.out.println("Introduce la base del rectángulo en cm");
	double base = s.nextDouble();
	System.out.println("Ahora introduce la altura del rectángulo en cm");
	double altura = s.nextDouble();
	double area = base * altura;
	System.out.println("Si la base del rectángulo es " + base + "cm y la altura es " + altura + "cm entonces el area del rectángulo es " + area + "cm²");
}	
}
