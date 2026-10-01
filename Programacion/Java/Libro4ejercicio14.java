/*Realiza un programa que diga si un número introducido por teclado es par y/o
divisible entre 5*/
import java.util.*;
public class Libro4ejercicio14{
	public static void main(String [] args){
	
	Scanner s = new Scanner(System.in);
	int numero = 0;
	System.out.println("Introduce un número ");
	numero = s.nextInt();
	
	if((numero %2 == 0) && (numero %5 == 0)){
		System.out.println("El número " + numero + " es par y divisible entre 5");

		}else if(numero %2 == 0){
			System.out.println("El número " + numero + " es par");
			}else if(numero %5 == 0){
			System.out.println("El número " + numero + " divisible entre 5");
			}
	}
}
