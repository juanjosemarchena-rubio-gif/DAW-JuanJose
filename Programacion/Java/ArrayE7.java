/*Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces
por teclado dos valores y a continuación cambiará todas las ocurrencias del
primer valor por el segundo en la lista generada anteriormente. Los números
que se han cambiado hay que decir las posiciones que se han cambiado.
*/

import java.util.*;
public class ArrayE7{	
	
		public static void main(String[] args){
			Random r = new Random();
			Scanner s = new Scanner(System.in);
			int[] arrayCien= new int[100];
			
			
			for(int i =0; i <arrayCien.length; i++){
				
				int aleatorio = r.nextInt(0, 21);
				arrayCien[i]= aleatorio;
				}
			System.out.println(Arrays.toString(arrayCien));
			
			
			
			
			
			
		}
	}	
