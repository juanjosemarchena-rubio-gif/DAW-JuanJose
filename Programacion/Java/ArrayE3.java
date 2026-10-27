/*Pide al usuario 10 números enteros, guárdalos en un array y, cuando haya terminado de introducirlos, muéstralos todos en una sola línea separados por espacios. */
import java.util.*;
public class ArrayE3{
	
		public static void main(String[] args){
		Scanner s = new Scanner(System.in);	
		int[] vector = new int[10];	
		
		for(int i=0; i < vector.length; i++){
			System.out.println("Introduce un número");
			vector[i] = s.nextInt();
			}
			for(int i=0; i <vector.length; i++){
				System.out.print(vector[i]);
				System.out.print(" ");
				}
		}
	}
