/*Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado.
 *A priori, el programa no sabe cuántos números se introducirán. 
 El usuario indicará que ha terminado de introducir los datos cuando meta un número negativo.*/
 
 import java.util.*;
public class Libro5ejercicio10{
		public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int cuantos = 0;
		System.out.println("Introduce un número");
		int n = s.nextInt();
		int suma =0;
		while(n >0){
		System.out.println("Introduce un número");
		suma = n + suma;
		cuantos = cuantos + 1;
		n = s.nextInt();
		
			}
			double media = suma / cuantos;
			System.out.println("La media es " + media);
	}	
}		
