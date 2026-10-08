import java.util.*;
public class Adivinanumero{
	public static void main(String [] args){
		Random r = new Random();
		int aleatorio = r.nextInt(1,100);
		Scanner s = new Scanner(System.in);
		System.out.println("¡Adivina en que número del 1 al 100 estoy pensando!");
		int num = s.nextInt();
	
		while(num != aleatorio){
			if(num < (aleatorio - 80)){
				System.out.println("¡Demasiado lejos, sube!");
				}else if(num > (aleatorio + 80)){
					System.out.println("¡Demasiado lejos, baja!");
				}else if(num < (aleatorio - 60)){
				System.out.println("¡Muy lejos, sube!");
				}else if(num > (aleatorio + 60)){
					System.out.println("¡Muy lejos, baja!");
				}else if(num < (aleatorio - 40)){
				System.out.println("¡Te estás acercando, sube un poco!");
				}else if(num > (aleatorio + 40)){
					System.out.println("¡Te estás acercando, baja un poco!");
				}else if(num < aleatorio){
				System.out.println("¡Estás muy cerca, sube un poco!");
				}else if(num > aleatorio){
					System.out.println("¡Estás muy cerca, baja un poco!");
			
					}
			 
				num = s.nextInt();
		}	
		if(num == aleatorio){
			System.out.println("¡BINGO, acertaste pitonis@!");
		}
	}
}
