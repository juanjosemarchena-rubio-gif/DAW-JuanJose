/*Solicita al usuario una clave de acceso usando un bucle `do-while`.
 *  La clave solo será aceptada cuando cumpla dos reglas: 
 * tener una longitud mínima de 8 caracteres y no contener espacios en blanco
 */
 
import java.util.*;
public class Ejercicio_bucles1{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        String contrasenia;

        do{
            System.out.println("Introduce la contraseña");
            contrasenia = s.nextLine();
        }while(contrasenia.length() < 8 || contrasenia.contains (" "));

        System.out.println("Contraseña aceptada");
    }
}
