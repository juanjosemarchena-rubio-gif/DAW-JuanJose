//Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.

import java.util.*;
public class Libro5ejercicio9{
		public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un número");
		int n = s.nextInt();
		int ncifras = 1;
		while(n / 10 > 0){
		ncifras = ncifras + 1;
		n = n /10;	
				}
			System.out.println("El número tiene " + ncifras + " cifras");
			}
	}

