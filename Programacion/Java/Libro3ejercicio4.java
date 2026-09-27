/*Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado*/

import java.util.Scanner;
public class Libro3ejercicio4{
	public static void main(String [] args){
	
	Scanner s = new Scanner(System.in);
	System.out.println("Introduce un número");
	double a = s.nextDouble();
	System.out.println("Introduce otro número");
	double b = s.nextDouble();
	
	double suma = a + b;
	double resta = a - b;
	double multi = a * b;
	double div = a / b;
	
	System.out.println( "La suma de " + a + " y " + b + " da como resultado " + suma);
	System.out.println( "La resta de " + a + " y " + b + " da como resultado " + resta);
	System.out.println( "La multiplicación de " + a + " y " + b + " da como resultado " + multi);
	System.out.println( "La división de " + a + " y " + b + " da como resultado " + div);
	
	}
}
