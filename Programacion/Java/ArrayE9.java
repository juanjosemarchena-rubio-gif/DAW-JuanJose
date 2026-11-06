/*Realiza un programa que pida 8 números enteros y que luego muestre esos
números junto con la palabra “par” o “impar” según proceda.
*/

import java.util.*;
public class ArrayE9{	
	
		public static void main(String[] args){
			
			Scanner s = new Scanner(System.in);
			int[] num= new int[8];
			
			for(int i=0; i < num.length; i++){
				System.out.println("Introduce un número");
				num[i]= s.nextInt();			
				}
				for(int e:num){
					if(e %2 ==0){
						System.out.println(e + " par");
						}else{
							System.out.println(e + " impar");
							}
					}		
				}
	}	
