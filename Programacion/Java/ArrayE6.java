/*Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array.
*/
import java.util.*;
public class ArrayE6{
	
		public static void main(String[] args){
			//Creo array
			int[] num= new int[15];
			
			Scanner s = new Scanner(System.in);
			
			//Relleno array
			for(int i=0; i <num.length; i++){
				System.out.println("Introduce un número");
				num[i] = s.nextInt();
				
				
				}
				
				System.out.println(Arrays.toString(num));
				//cambio valores
				int aux =num[14];
				for(int i =num.length -1; i>0; i--){
					num[i] = num[i-1];
					}
					num[0] =aux;
					System.out.println(Arrays.toString(num));
				
		}
	}		
