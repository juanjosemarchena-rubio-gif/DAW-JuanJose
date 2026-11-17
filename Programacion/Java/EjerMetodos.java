/*
 * EjerMetodos.java
 * MEDIA DE UN VECTOR (   media(int[] vector) devolverá un double con la media

 * CONTAR PARES
 * 
 * mostrarArray / pareciso al toString con el formato 5 - 4 - 2  
 */


public class EjerMetodos {
	
	public static void main (String[] args) {
		
		int[] vectorEnteros ={23,4,6,8,12,34};
		System.out.println("La media de vectorEnteros es= " + media(vectorEnteros));
	}
	
	public static double media(int[] vector){
		int suma =0;
		for(int i =0; i < vector.length; i++){
			suma =suma + vector[i];
			}
		double media= (double) suma / vector.length;
	}
}

