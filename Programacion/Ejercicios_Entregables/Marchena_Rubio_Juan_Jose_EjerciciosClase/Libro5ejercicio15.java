/*Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente),
 *  saque por pantalla todas las potencias con base el numero dado yexponentes entre uno y el exponente introducido.
 *  No se deben utilizar funciones de exponenciación.
 *  Por ejemplo, si introducimos el 2 y el 5, se deberán mostrar 21, 22, 23, 24 y 25.
 */
 
  import java.util.*;
public class Libro5ejercicio15{
		public static void main(String [] args){
			Scanner s = new Scanner(System.in);
			int b;
			int ex;
			System.out.println("Introduce un número entero que representará la base");
			b = s.nextInt();
			System.out.println("Introduce un número entero que representará el exponente");
			ex = s.nextInt();
			for(int i =1; i <=ex; i++){
			System.out.print(b + "^" + i);
			System.out.print(" ");
		}
	}
}
