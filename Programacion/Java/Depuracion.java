/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.depuracion;

/**
 *
 * @author Juan José Marchena
 */
import java.util.*;
public class Depuracion {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Introduce un número para determinar la altura delll triángulo");
        n = s.nextInt();
        for(int i =0; i <n; i++){
            for(int j =0; j <=i; j++){
             System.out.print("*");
            }
            System.out.println();
        }
    }
}
