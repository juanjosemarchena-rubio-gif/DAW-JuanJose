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