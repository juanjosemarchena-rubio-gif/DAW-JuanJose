/*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros números enteros a partir de uno que se introduce por teclado.
 */
 
 import java.util.*;
public class Libro5ejercicio11{
		public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int n =0;
		int p =1;
		System.out.println("Introduce un número");
		n = s.nextInt();
		for(int i = n+1; p <=5; i++){
		System.out.print(i);
		System.out.print(" ");
		System.out.print(i * i);
		System.out.print(" ");
		System.out.print(i * i * i);
		System.out.println(" ");
		p++;
		
		}
		
	}
}
