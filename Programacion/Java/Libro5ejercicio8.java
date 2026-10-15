//Muestra la tabla de multiplicar de un número introducido por teclado.

import java.util.*;
public class Libro5ejercicio8{
		public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un número");
		int n = s.nextInt();
		System.out.println("TABLA DEL " + n);
		for(int i =0; i <=10; i++){
			int r = n * i;
			System.out.println(n + " X " + i + " = " + r);
			}
		
		}	
}
