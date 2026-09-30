/*Realiza un programa que resuelva una ecuación de primer grado (del tipo ax + b = 0)*/
import java.util.*;
public class Libro4ejercicio5{
    public static void main (String [] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce un número como valor del coeficiente");
    int a = s.nextInt();
    System.out.println("Introduce un número como valor del término independiente");
    int b = s.nextInt();
    if(a == 0){
        System.out.println("La ecuación no tiene solución única");
        }else{
        System.out.println("Resolvamos la ecuación: " + a + "x + " + b + " = 0");
        System.out.println("x = -" + b + " / " + a);
        int ecua = -b / a;
        System.out.println("x = " + ecua);
        }
    
    }
}