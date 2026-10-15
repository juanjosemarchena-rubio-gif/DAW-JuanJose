
import java.util.*;
public class AdivinaN{
	public static void main(String [] args){
		Random r = new Random();
		int aleatorio = r.nextInt(1,100);
		
		Scanner s = new Scanner(System.in);
		int num;
		boolean bingo = false;
		
		while(!bingo){
			System.out.println("¡Adivina en que número del 1 al 100 estoy pensando!");
			num = s.nextInt();
			
			if (num == aleatorio){
				bingo = true;
				System.out.println("¡BINGO, acertaste pitonis@!");
				}else if ((aleatorio - num) <20 && aleatorio - num <=0){
					System.out.println("¡Estás muy cerca, sube un poco!");
					}else if (aleatorio - num >-20 && aleatorio - num >0){
					System.out.println("¡Estás muy cerca, baja un poco!");
					}else if (aleatorio - num >20){
					System.out.println("¡Muy lejos, sube!");
					}else if ((aleatorio - num) <-20){
					System.out.println("¡Muy lejos, baja!");
					}
			}
	}
}
