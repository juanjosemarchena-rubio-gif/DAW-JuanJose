     import java.util.*;
public class EjerciciosBucles2{
		public static void main(String [] args){
				Random r = new Random();
				Scanner s = new Scanner(System.in);
				double precio =0;
				double suma =0;
				double total =0;
				double descuento =0;
				for(double i = 0; precio != -1; i= i + precio){
				System.out.println("Introduce el precio del producto");
				precio = s.nextDouble();
				suma= precio + i;
				
			}
					if(suma >= 100){
					int opcion = r.nextInt(4);
						switch(opcion){
						case 0 -> descuento = suma * 0.05;	
						case 1 -> descuento = suma * 0.10;
						case 2 -> descuento = suma * 0.20;
						default -> descuento = 5;
						}
						total = suma - descuento;
						System.out.println("El precio total es: " + total);	
						}else{
							System.out.println("El precio total es: " + suma);	
							}
				
			
		}				
}
