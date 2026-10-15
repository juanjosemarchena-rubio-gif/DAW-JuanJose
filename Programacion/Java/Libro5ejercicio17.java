/*Realiza un programa que sume los 100 números siguientes a un número entero y positivo introducido por teclado.
 *  Se debe comprobar que el dato introducido es correcto (que es un número positivo).
 */
 
   import java.util.*;
public class Libro5ejercicio17{
		public static void main(String [] args){
			Scanner s = new Scanner(System.in);
			System.out.println("Introduce un número");
			int n = s. nextInt();
			for(int i = n ; i <= n +100; i++){
				if(n >0){
					int suma = i + n;
					System.out.println(suma);
					}
				}
	
			System.out.println("El número debe ser positivo");
		}
}			
