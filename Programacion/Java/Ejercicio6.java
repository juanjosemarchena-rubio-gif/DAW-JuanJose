// Guarda el monto total de una compra en una variable. Si el monto 
//supera los 100€, aplica un 15% de descuento e imprime el precio final; si no, 
//muestra el precio original sin descuento.
import java.util.*;
public class Ejercicio6{
		public static void main (String[] args){
		Scanner scanner = new Scanner (System.in);
		System.out.println("Introduce una compra decimal");
		double compra = scanner.nextDouble();
		double total = 0;
		
		if (compra > 100){
			double descuento = (compra * 0.15);
			 total = compra - descuento;
		}else{
			total = compra;
		}
		System.out.println("El total es:" + total);
		
	}
}
