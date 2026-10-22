/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.depuracion;

/**
 *
 * @author Juan José Marchena
 */
import java.util.*;
public class Piramide {
    public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    int n;
    System.out.println("Escribe un número");
    n = s.nextInt();
    for(int i =0; i <n; i++){
         for(int j =n-1; j >i; j--){
             System.out.print(" ");
         }
         for(int j=0; j<2*i+1; j++){
             System.out.print("*");
         }
         for(int j =n-1; j >i; j--){
             System.out.print(" ");
         }
         System.out.println("");
                

    }

    }
    
}
