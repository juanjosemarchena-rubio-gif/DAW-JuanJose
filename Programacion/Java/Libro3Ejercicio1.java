
/*Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación*/

import java.util.Scanner;
public class Libro3Ejercicio1{
	
public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.println("Introduce dos números enteros separados por espacios y pulsa intro para ver la multiplicación");
	int a = s.nextInt();
	int b = s.nextInt();
	int resultado = a * b;
	System.out.print("El primer número introducido es " + a);
	System.out.println(" y el segundo es " + b);
	System.out.print("El resultado de la multiplicación es ");
	System.out.print(resultado);
}

}

