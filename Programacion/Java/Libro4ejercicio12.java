/*Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
que se imparten en el curso. Cada pregunta acertada sumará un punto. El
programa mostrará al final la calificación obtenida. Pásale el minicuestionario
a tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos en las diferentes asignaturas del curso.
*/
import java.util.*;
public class Libro4ejercicio12{
	public static void main(String [] args){
	Scanner s = new Scanner(System.in);
	int nota = 0;
	System.out.println("¿Con que variable nombramos un número entero en Java?");
	String respuesta = s.next();
	 if(respuesta.equals ("int") || respuesta.equals ("Int")){
		 System.out.println("Respuesta correcta");
		 nota++;
		  
		 }else{
		System.out.println("Respuesta icorrecta");
	}
	System.out.println("¿Como se llama el profesor de Programación?");
	respuesta = s.next();
	if(respuesta.equals ("jairo") || respuesta.equals ("Jairo")){
		 System.out.println("Respuesta correcta");
		 nota++;
		  
		 }else{
		System.out.println("Respuesta incorrecta");
	
	}
	System.out.println("¿Con que teorema podemos pasar un número de cualquier base a decimal?");
	respuesta = s.next();
	switch(respuesta){
		case "teorema fundamental de numeracion", "Teorema fundamental de numeracion" ->{
		 System.out.println("Respuesta correcta");
		 nota++;
	 }
		 default -> System.out.println("Respuesta incorrecta");
		 
	 }
	 System.out.println("Tu nota es  " + nota);
		}

			 
			 
	
}
	
