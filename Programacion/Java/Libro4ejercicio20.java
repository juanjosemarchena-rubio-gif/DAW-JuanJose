/* realiza un programa que diga si un número entero positivo introducido por
teclado es capicúa. se permiten números de hasta 5 cifras.*/
import java.util.*;
public class libro4ejercicio20{
	public static void main(string [] args){
	scanner s = new scanner(system.in);
	int numero = 0;
	int c1 = 0;
	int c2 = 0;
	int c3 = 0;
	int c4 = 0;
	system.out.println("introduce un número entero de hasta 5 cifras positivo");
	numero = s.nextint();
	
		if(numero >=0 && numero <10){
			system.out.println("el número es capicúa");
		}else if(numero >=10 && numero <100 ){
			c1 = numero / 10;
			c4 = numero % 10;
			if(c1 == c4){
				system.out.println("el número es capicúa");
			}else{
				system.out.println("el número no es capicúa");
			}
		}else if(numero >=100 && numero <1000){
			c1 = numero / 100;
			c4 = numero % 10;
			if(c1 == c4){
				system.out.println("el número es capicúa");
			}else{
				system.out.println("el número no es capicúa");
			}
			 if(numero >=1000 && numero <10000){
			c1 = (numero / 1000) %10;
			c2 = (numero / 100) %10;
			c3 = (numero / 10) %10;
			c4 = numero % 10;
			if(c1 == c4){
				system.out.println("el número es capicúa");
			}else{
				system.out.println("el número no es capicúa");
			}
		}
			
		}			
				
	}
}
