/*Escribe un programa que pida por teclado un día de la semana y que diga que asignatura toca ese a primera hora ese dia*/

import java.util.*;
public class Libro4ejercicio1{
public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce un día de la semana");
    String dia = s.next();
    switch (dia){
    case "lunes" -> System.out.println("El lunes a primera hora hay clase de base de datos");
    case "martes" -> System.out.println("El martes a primera hora hay clase de digitación");
    case "miercoles" -> System.out.println("El miercoles a primera hora hay clase de lenguaje de marcas");
    case "jueves" -> System.out.println("El jueves a primera hora hay clase de programación");
    case "viernes" -> System.out.println("El viernes a primera hora hay clase de entornos de desarrollo");
    default -> System.out.println("El día que has introducido no hay clases");
    }
    
}
}
//PENDIENTE DE EJECUTAR 