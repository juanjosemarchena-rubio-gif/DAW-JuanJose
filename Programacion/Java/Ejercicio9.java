//Define dos variables con el usuario y la contraseña guardados en 
//el sistema, y otras dos variables con el intento de ingreso. Muestra "Inicio de 
//sesión exitoso" únicamente si ambos coinciden. En caso contrario, indica si 
//falló el usuario o la contraseña. 
import java.util.*;
public class Ejercicio9{
		public static void main (String[] args){
		
	String usuario = "user";
	int contrasenya = 1234;
	
	
	Scanner s = new Scanner (System.in);
			System.out.println("Introduce el usuario");
			String intentoUsuario = s.nextLine();
			System.out.println("Introduce la contraseña");
			int intentoContrasenya = s.nextInt();
			if (usuario.equals (intentoUsuario)){
			System.out.println("Los usuarios coinciden");
		}else{
			System.out.println("usuario incorrecto");
		}
		if (intentoContrasenya == contrasenya){
			System.out.println("Las contraseñas coinciden");
		}else{
			System.out.println("Contraseña incorrecta");
		}
	
	
		
		}
}
