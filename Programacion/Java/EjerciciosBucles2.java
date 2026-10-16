     import java.util.*;
public class EjerciciosBucles2{
		public static void main(String [] args){
				Random r = new Random();
				Scanner s = new Scanner(System.in);
				double precio =0;
				double suma =0;
				double total =0;
				double descuento =0;
				for(double i = 0; precio != -1; precio = i + precio){
				System.out.println("Introduce el precio del producto");
				precio = s.nextDouble();
			}
					if( >100){
					int opcion = r.nextInt(4);
						switch(opcion){
						case 0 -> descuento = i * 0.05;	
						case 1 -> descuento = i * 0.10;
						case 2 -> descuento = i * 0.20;
						default -> descuento = 5;
						}
						System.out.println("El precio total es: " + (i - descuento));	
						}else{
							System.out.println("El precio total es: " + i);	
							}
				
			
		}				
}
