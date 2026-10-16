/*Solicita al usuario una clave de acceso usando un bucle `do-while`.
 *  La clave solo será aceptada cuando cumpla dos reglas:
 *  tener una longitud mínima de 8 caracteres y no contener espacios en blanco
 */
 
     import java.util.*;
public class EjerciciosBucles1{
		public static void main(String [] args){
				Scanner s = new Scanner(System.in);
				String clave;
				do{
					System.out.println("Introduce la clave de acceso");
					clave = s.next();
					if(clave.length() < 8 || clave.contains(" ")){
						System.out.println("La clave de acceso debe tener al menos 8 caracteres y no incluir espacios");
						System.out.println("");
						}
					}while(clave.length() < 8 || clave.contains(" "));
				System.out.println("Clave de acceso aceptada");
		}
}
