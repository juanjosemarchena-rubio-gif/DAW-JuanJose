/*Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
convertir debe ser introducida por teclado.*/

import java.util.Scanner;
public class Libro3ejercicio3{
		
	public static void main(String [] args){
			Scanner s = new Scanner(System.in);
			System.out.println("Introduce un valor en pesetas");
			double pts = s.nextDouble();
			double euro = pts / 166.386;
			System.out.println(pts + "pesetas son" + euro + "euros");
			
	}
}

