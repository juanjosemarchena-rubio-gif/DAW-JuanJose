/*
Escribe un programa que calcule el volumen de un cono según la fórmula V =
1
3πr2h
*/

import java.util.Scanner;
public class Libro3ejercicio9{
public static void main(String [] args){
	Scanner s = new Scanner(System.in);
	System.out.println("Introduce el radio en cm");
	double r = s.nextDouble();
	System.out.println("Introduce la altura en cm");
	double h = s.nextDouble();
	double v = 1.0 / 3.0 * 3.1416 * (r * r) * h;
	System.out.println("Si el radio del cono es " + r + "cm y la altura es " + h + "cm el volumen del cono es " + v + "cm³");
	

}
}
