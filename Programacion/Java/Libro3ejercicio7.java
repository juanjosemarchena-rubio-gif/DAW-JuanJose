/*Escribe un programa que calcule el total de una factura a partir de la base
imponible.*/

import java.util.Scanner;
public class Libro3ejercicio7{
public static void main(String [] args){
	
	Scanner s = new Scanner(System.in);
	System.out.println("Introduce el importe de la base imponible");
	double base = s.nextDouble();
	double iva = (base * 21) / 100;
	double total = base + iva;
	System.out.println("Si el importe de la factura es " + base + " más iva. El importe total es " + total);
}
}
