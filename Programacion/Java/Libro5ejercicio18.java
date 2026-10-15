/*Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por teclado y validados como distintos,
 *  el programa debe empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
 */
 
    import java.util.*;
public class Libro5ejercicio18{
		public static void main(String [] args){
			Scanner s = new Scanner(System.in);
			System.out.println("Introduce un número");
			int n1 = s.nextInt(); 
			System.out.println("Introduce otro número");
			int n2 = s.nextInt();
			while(n1 != n2){
				if(n1 - n2 <0){
					for(int i =7; i == n1; i = i +7){
						System.out.println(n2 + i);
						} 
					}
				}
		}
}		
