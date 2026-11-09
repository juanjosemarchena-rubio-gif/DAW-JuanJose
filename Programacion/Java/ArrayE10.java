/*Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array.
* El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
es necesario*/
import java.util.*;
public class ArrayE10{	
	
		public static void main(String[] args){
			int[] arrayNumeros= new int[20];
			Random r = new Random();
			
			for(int i =0; i <arrayNumeros.length; i++){
				
				int aleatorio = r.nextInt(0, 21);
				arrayNumeros[i]= aleatorio;
				}
			System.out.println(Arrays.toString(arrayNumeros));
			
			int[] numPares= new int[19];
			int[] numImpares= new int[19];
			
			for(int e:arrayNumeros){
					if(e %2 ==0){
						numPares[e]= e; 
						}else{
							numImpares[e]= e;
							}
					}		
						System.out.print(Arrays.toString(numPares));
			
	
			
			
		}
	}	


