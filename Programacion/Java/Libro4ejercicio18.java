/*Escribe un programa que diga cuál es la primera cifra de un número entero
introducido por teclado. Se permiten números de hasta 5 cifras.*/
import java.util.*;
public class Libro4ejercicio18{
	public static void main(String [] args){
	Scanner s = new Scanner(System.in);
	int numero = 0;
	System.out.println("Introduce un número entero de hasta 5 cifras");
	numero = s.nextInt();
	
		if((numero >=0) && (numero <=9)){
			System.out.println("La primera cifra es " + numero);
		}else if((numero >=10) && (numero <=99)){
			System.out.println("La primera cifra es " + numero / 10);
			}else if((numero >=100) && (numero <=999)){
			System.out.println("La primera cifra es " + numero / 100);
			}else if((numero >=1000) && (numero <=9999)){
			System.out.println("La primera cifra es " + numero / 1000);
			}else if((numero >=10000) && (numero <=99999)){
			System.out.println("La primera cifra es " + numero / 10000);
		
		}
	}
}
