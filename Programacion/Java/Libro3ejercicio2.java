/*Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado*/

import java.util.Scanner;
public class Libro3ejercicio2{
		
	public static void main(String [] args){
			Scanner s = new Scanner(System.in);
			System.out.println("Introduce un valor en euros");
			double euro = s.nextDouble();
			double pts = euro * 166.386;
			System.out.println(euro + "euros son" + pts + "pesetas");
			
	}
}
