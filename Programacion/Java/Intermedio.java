//Elaborar un programa que reciba 3 números enteros diferentes y entregue por pantalla el número
//intermedio.
import java.util.*;
public class Intermedio{
		public static void main (String[] args){
		//Declaración de variables
		int num1;
		int num2;
		int num3;
		Scanner scanner = new Scanner(System.in);
		
		//Petición de datos
		System.out.println("Introduce el primer número:");
		num1 = scanner.nextInt();
		System.out.println("Introduce el segundo número:");
		num2 = scanner.nextInt();
		System.out.println("Introduce el primer número:");
		num3 = scanner.nextInt();
		
		//Codificación
		//Comparo los 2 primeros números
		if(num1 > num2){
			//num1>num2
			if(num1 > num3){
			//A es el mas grande
			if(num2 > num3){
				//num1>num3>num2
				System.out.println("El mediano es" + num3);
			}else{
				//num1>num2>num3
				System.out.println("El mediano es" + num2);
			}
		}else{
			//num3>num1>num2
			System.out.println("El mediano es" + num1);
		}
		}else{
			//num2>num1
			if(num1 > num3){
				//num2>num1>num3
				System.out.println("El mediano es" + num1);
			}else{
				//num1 es el mas pequeño
				if(num2>num3){
					System.out.println("El mediano es" + num3);
				}else{
					System.out.println("El mediano es" + num2);
				}
			}
	
		}
	}
}
