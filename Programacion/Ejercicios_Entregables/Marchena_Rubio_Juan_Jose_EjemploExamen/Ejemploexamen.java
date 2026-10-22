import java.util.*;
public class Ejemploexamen{
		public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int N =0;
		int espacios=0;
		
		do{
			System.out.println("Introduce un número mayor que 6 para determinar la altura de la flecha");
			N = s.nextInt();
			if(N <6){
			System.out.println("Error: El número introducido debe ser mayor que 6");	
				}
			}while(N <6);
		for(int i =0; i < N; i++){
			
			if(i< N/2){
				for(int j =0; j < i; j++){
					System.out.print(" ");
				}
				}else{
					for(int j =0; j <N-i -1; j++){
						System.out.print(" ");
						}
					}
			System.out.println("*");
			
			
			}
			
		
			
			
		}
}
