
import java.util.*;
public class Notas{
		public static void main (String[] args){
		//Declaración de variables
		int a=0;
		
		Scanner scanner = new Scanner(System.in);
		
		//Petición de datos
		System.out.println("Introduce la nota:");
		a = scanner.nextInt();
		
		switch (a){
			case 1:
			case 2:
			case 3:
			case 4:
			System.out.println("suspenso");
			break;
			case 5:
			case 6:
			System.out.println("aprobado");
			break;
			case 7:
			case 8:
			System.out.println("notable");
			break;
			case 9:
			case 10:
			System.out.println("sobresaliente");
			break;
			default :
			System.out.println("Has introducido una nota no válida");
			
			}
			//después
			switch (a){
				case 1,2,3,4-> System.out.println("suspenso");
				case 5,6-> System.out.println("aprobado");
				case 7,8-> System.out.println("notable");
				case 9,10-> System.out.println("sobresaliente");
				default-> System.out.println("Has introducido una nota no válida");
				}
			
		}
	}
