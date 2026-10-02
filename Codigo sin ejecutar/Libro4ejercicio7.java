/*Realiza un programa que calcule la media de tres notas.*/
import java.util.*;
public class Libro4Ejercicio7{
    public static void main(String [] args){
    
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce la primera nota");
    double nota1 = s.nextDouble();
    System.out.println("Introduce la segunda nota");
    double nota2 = s.nextDouble();
    System.out.println("Introduce la tercera nota");
    double nota3 = s.nextDouble();
    double media = (nota1 + nota2 + nota3) / 3;
        if(media <5){
        System.out.println("La media de tus 3 notas es " + media + " insuficiente");
        }else if((media >=5) && (media <7)){
            System.out.println("La media de tus 3 notas es " + media + " aprobado");
        }else if((media >=7) && (media <9)){
            System.out.println("La media de tus 3 notas es " + media + " notable");
        }else if(media >=9){
            System.out.println("La media de tus 3 notas es " + media + " sobresaliente");
        }
    
    }
}
