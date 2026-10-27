//CREAR UN ARRAY DE STRING DE LOS DIAS DE LA SEMAN, Y MOSTRARLOS EN ORDEN INVERSO

public class ArrayE1{
	
		public static void main(String[] args){
		   
		String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		
		for(int i= dias.length-1; i >=0; i--){
			
			System.out.println("El valor de la posición " + i + " es: " + dias[i]);
			}
			
		}
		
	}
