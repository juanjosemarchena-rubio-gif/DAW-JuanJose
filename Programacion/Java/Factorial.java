import java.util.*;
public class Factorial{
	public static void main(String [] args){
	Scanner s = new Scanner(System.in);
	int n =0;
	int fac =1;
	System.out.println("Introduce un número del 1 al 9 para allar su factorial");
	n = s.nextInt();
		for( int i =1; i<= n; i++){
		fac = fac *i;
		
		
		
		}
	
		System.out.println(fac);
	}
}
