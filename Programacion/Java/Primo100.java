import java.util.*;
public class Primo100{
	public static void main(String [] args){
		for(int j =2; j <=100; j++){
			boolean primo = true;
			for(int i =2; i <=j/2; i++){
				if(j %i ==0 ){
					primo = false;
				
					}
				}
			if(primo){
				System.out.println(j);
			
			}
		}
	}
}
