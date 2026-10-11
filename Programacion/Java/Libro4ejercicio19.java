/*Realiza un programa que nos diga cuántos dígitos tiene un número entero que
puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
*/

import java.util.*;
public class Libro4ejercicio19{
	public static void main(String [] args){
	Scanner s = new Scanner(System.in);
int numero = 0;
	System.out.println("Introduce un número entero de hasta 5 cifras, puede ser positivo o negativo");
	numero = s.nextInt();
	
		if((numero >-10) && (numero <10)){
			System.out.println("El número " + numero + " tiene 1 cifra");
		}else if((numero >=10) && (numero <=99) || (numero <= -10) && (numero >=99)){
			System.out.println("El número " + numero + " tiene 2 cifras");
			}else if((numero >=100) && (numero <=999) || (numero <=-100) && (numero >=-999)){
			System.out.println("El número " + numero + " tiene 3 cifras");
			}else if((numero >=1000) && (numero <=9999) || (numero <=-1000) && (numero >=-9999)){
			System.out.println("El número " + numero + " tiene 4 cifras");
			}else if((numero >=10000) && (numero <=99999) || (numero <=-10000) && (numero >=-99999)){
			System.out.println("El número " + numero + " tiene 5 cifras");
		
		}
	}
}
