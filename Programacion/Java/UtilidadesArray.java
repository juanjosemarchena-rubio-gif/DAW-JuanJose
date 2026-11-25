/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.utilidadesarray;

/**
 *
 * @author Juan José Marchena
 */
import java.util.*;
public class UtilidadesArray {
    
   
    public static void main(String[] args){
      
      String[] v ={"123456789z","098765432i", "567456326d","965849677j","234156784t"};
      int posicion= busquedaLineal(v,  "123456664z");
//      System.out.println(posicion);
       posicion= busquedaLineal( v, "123456789z");
//      System.out.println(posicion);
      
      int[] vectorNumeros ={1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1,2,3,4,5,6,78,8,9,0,5,4,2,3,5,8,9,4,3,2};
      int num = busquedaLineal( vectorNumeros ,3);
      
      int position = busquedaLineal2( vectorNumeros ,3);
      System.out.println(num);
      System.out.println(position);
      
       System.out.println("---------------------------------------");
       System.out.println("Ejer 1");
       System.out.println("---------------------------------------");
       
       /*Ejercicio 1 ★. ¿Dónde está?Rellena un array de 10 enteros con rellenarAleatorio(datos, 1, 20) y muéstralo.
Pide un número por teclado y, usando busquedaLineal, indica en qué posición está o que no está. Repite
la pregunta hasta que el usuario escriba 0.*/
       int[]arrayEnteros= new int[10];
       Random r= new Random();
       Scanner sc= new Scanner(System.in);
       for(int i=0; i <arrayEnteros.length; i++){
       
           
       
       }
       
       
       
    }
    
        /*public static int sumaVector (int[] vector){
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
        public static void incrementa (int[]vector, int incremento) {
		
		for(int i=0; i < vector.length ; i++){
			vector[i]= vector[i] * incremento;
			}
		
		}
	}	

        public static double media(int[] vector){
		int suma =0;
		for(int i =0; i < vector.length; i++){
			suma =suma + vector[i];
			}
		double media= (double) suma / vector.length;
	}
}
*/
        public static int busquedaLineal(String[] vectorCadenas, String s){

        for(int i=0; i < vectorCadenas.length; i++){
            if (s.equals(vectorCadenas[i])){
            
            return i;
        }
            
            } 
        
        return -1;
        } 
        
    public static int busquedaLineal(int[] vector, int n){
        int contador=0;
        for(int i=0; i < vector.length; i++){
            
            if (n == vector[i]){
                contador++;
                
            }
            
        } 
        return contador;
    } 
    public static int busquedaLineal2(int[] vector, int n){
        int pos=-1;
        for(int i=0; i < vector.length; i++){
            
            if (n == vector[i]){
                pos=i;
                
            }
            
        } 
        return pos;
    } 
}
