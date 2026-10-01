/*Escribe un programa que diga cuál es la última cifra de un número entero
introducido por teclado.
*/

import java.util.*;
public class Libro4ejercicio17{
	public static void main(String [] args){
	Scanner s = new Scanner(System.in);
	int numero = 0;
	System.out.println("Introduce un número ");
	numero = s.nextInt();
	System.out.println("La útima cifra de tu número es " + numero %10);
	}
}
 
