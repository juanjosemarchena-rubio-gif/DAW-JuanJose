/*Calcula la nota de un trimestre de la asignatura Programación. El programa
pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
Si la media de los dos controles da un número mayor o igual a 5, el alumno
está aprobado y se mostrará la media. En caso de que la media sea un número
menor que 5, el alumno habrá tenido que hacer el examen de recuperación
que se califica como apto o no apto, por tanto se debe preguntar al usuario
¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
resultado de la recuperación es apto, la nota será un 5; en caso contrario, se
mantiene la nota media anterior.*/

import java.util.*;
public class Libro4ejercicio21{
    public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    double n1 = 0;
    double n2 = 0;
    
    System.out.println("Introduce la primera nota");
    n1 = s.nextDouble();
    System.out.println("Introduce la segunda nota");
    n2 = s.nextDouble();
    s.nextLine();
    int media = (n1 + n2) / 2;
        if(media <5){
        System.out.println("¿Cual ha sido la nota de recuperación?(apto/no apto");
        String recu = s.nextLine();
            switch(recu){
            case "apto" -> System.out.println("Tu media en programación es 5, apto");
            case "no apto" -> System.out.println("Tu media en programación es " +media+ " no apto");
            default -> System.out.println("La nota introducida es incorrecta");
            }
        }else{
        System.out.println("Tu media en programación es " +media+ " apto");
        }
    }
}