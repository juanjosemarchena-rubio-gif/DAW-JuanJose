import java.util.*;
public class Primo{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int n =0;
		boolean primo = true;
		System.out.println("Introduce un número");
		n = s.nextInt();
		for(int i =2; i <=n/2; i++){
			if(n %i ==0 ){
				primo = false;
			
					}
			}
			if(primo){	
			System.out.println("El numero " + n + " es primo");
			}else{
				System.out.println("El numero " + n + " no es primo");
				}
		
		}
	
}
