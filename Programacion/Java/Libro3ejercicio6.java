/*Escribe un programa que calcule el área de un triángulo.*/

import java.util.Scanner;
public class Libro3ejercicio6{
public static void main(String [] args){
	
	Scanner s = new Scanner(System.in);
	System.out.println("Introduce la base del triángulo en cm");
	double base = s.nextDouble();
	System.out.println("Ahora introduce la altura del triángulo en cm");
	double altura = s.nextDouble();
	double area = (base * altura) / 2;
	System.out.println("Si la base del triángulo es " + base + "cm y la altura es " + altura + "cm entonces el area del triángulo es " + area + "cm²");
}	
}

