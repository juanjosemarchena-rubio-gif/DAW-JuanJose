/*
 * Metodos.java
 *
  
 * 
 */


public class Metodos {
	
	public static void main (String[] args) {
		
		int[] vectorEnteros ={23,4,6,8,12,34};
		int[] vectorEnteros2 ={1,-3,6,8};
		int[] vectorEnteros3 ={100,150,3000,10};
		int suma=0;
		int sumav1 = sumaVector(vectorEnteros);
		int sumav2 = sumaVector(vectorEnteros2);
		int sumav3 = sumaVector(vectorEnteros3);
		int sumaTotal = sumav1+ sumav2 +sumav3;
		System.out.println("La suma de vectorEnteros es= " + sumaVector(vectorEnteros));
		System.out.println("La suma de vectorEnteros2 es= " + sumaVector(vectorEnteros2));
		System.out.println("La suma de vectorEnteros3 es= " + sumaVector(vectorEnteros3));
		System.out.println("La suma de los vectores es= " + sumaTotal);
		
		System.out.println("El máximo de vectorEnteros es= " + maximoVector(vectorEnteros));
		System.out.println("El máximo de vectorEnteros2 es= " + maximoVector(vectorEnteros2));
		System.out.println("El máximo de vectorEnteros3 es= " + maximoVector(vectorEnteros3));
		
		incrementa(vectorEnteros);
		
		
		
	}
	
	public static int sumaVector (int[] vector){
		int suma =0;
		for(int i=0; i <vector.length; i++){
			suma= suma + vector[i];
			}		
		
		return suma;
		}
	public static int maximoVector (int[] vector){
		int maximo =vector[0];
		for(int i=0; i < vector.length ; i++){
			if(maximo < vector[i]){
				maximo = vector[i];
				
				return maximo;
			
				}
			}
		}
		
	}	



