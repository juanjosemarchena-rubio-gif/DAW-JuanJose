/*Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por teclado y validados como distintos,
 *  el programa debe empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
 */
 
    import java.util.*;
public class Libro5ejercicio18{
		public static void main(String [] args){
			Scanner s = new Scanner(System.in);
			int n1 =0;
			int n2 =0;
			do{
			System.out.println("Introduce un número");
			n1 = s.nextInt(); 
			System.out.println("Introduce otro número distinto");
			n2 = s.nextInt();
				if(n1 - n2 ==0){
								System.out.println("Los números deben ser distintos");
					}
			}while(n1 == n2);
				if(n1 - n2 <0){
					for(int i = n1; i <= n2; i = i +7){
						System.out.println(i);
						}
				}else{
			for(int i = n2; i <= n1; i = i +7){
						System.out.println(i);
					}
			}
		}
}		
