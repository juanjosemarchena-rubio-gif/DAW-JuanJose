<<<<<<< HEAD
/*Realiza un programa que diga si un número entero positivo introducido por
teclado es capicúa. Se permiten números de hasta 5 cifras*/

import java.util.*;
public class Libro4ejercicio20{
    public static void main (String [] args){
    Scanner s = new Scanner(System.in);
    int uni = 0;
    int dec = 0;
    int cen = 0;
    int umil = 0;
    int demil = 0;
    System.out.println("Introduce un número entero y positivo de hasta 5 cifras");
    int num = s.nextInt();
    
        if(num >=0 && num <10){
        System.out.println("El número " + num + " es capicúa");
        }else if(num >=10 && num <100){
            uni = num %10;
            dec = num / 10;
            if(dec == uni){
            System.out.println("El número " + num + " es capicúa");
            }else{
            System.out.println("El número " + num + " no es capicúa");
            }
        }else if(num >=100 && num <1000){
            uni = num %10;
            cen = num / 100;
            if(cen == uni){
            System.out.println("El número " + num + " es capicúa");
            }else{
            System.out.println("El número " + num + " no es capicúa");
            }
        }else if(num >=1000 && num <10000){
            uni = num %10;
            dec = (num / 10) %10;
            cen = (num / 100) %10;
            umil = (num / 1000) %10;
            if(uni == umil && dec == cen){
            System.out.println("El número " + num + " es capicúa");
            }else{
            System.out.println("El número " + num + " no es capicúa");
            }
        }else if(num >=10000 && num <100000){
            uni = num %10;
            dec = (num / 10) %10;
            cen = (num / 100) %10;
            umil = (num / 1000) %10;
            demil = (num / 10000) %10;
            if(uni == demil && dec == umil){
            System.out.println("El número " + num + " es capicúa");
            }else{
            System.out.println("El número " + num + " no es capicúa");
            }
        }else{
            System.out.println("El número introducido no es correcto");
        }

    }
}
=======
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
>>>>>>> 7668e11cb7e656085c4c692ebe057d773716b0d2
