/*Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
el programa mostrará el array y preguntará si el usuario quiere destacar el
máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
el número destacado entre dobles asteriscos.
*/
import java.util.*;
public class ArrayE13{
	public static void main(String[] args){
		
		int[] arrayNumeros = new int[100];
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int min =500;
		int max =0;
		int destacar;

		for(int i=0; i <arrayNumeros.length; i++){
		 
			arrayNumeros[i] = r.nextInt(0, 501);

			if(arrayNumeros[i] <min){
				min = arrayNumeros[i];
			}else if(arrayNumeros[i] >max){
				max = arrayNumeros[i];
			}
		}
			
		System.out.print(Arrays.toString(arrayNumeros));
		System.out.println("¿Qué quiere destacar? (1 – mínimo, 2 – máximo):");
		destacar= s.nextInt();
		int busca;
		if(destacar == 1){
			busca = min;
			}else{
			busca = min;	
				}
		for(int i=0; i <arrayNumeros.length; i++){
			if(arrayNumeros[i] == (busca)){
				System.out.println("**"+ arrayNumeros[i] + "** ");
				}else{
					System.out.println("**"+ arrayNumeros[i] + "** ");
					} 
			}
		
		
		
			


	}
}
