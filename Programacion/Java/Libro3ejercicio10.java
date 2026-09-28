//Realiza un conversor de Mb a Kb.

import java.util.Scanner;
public class Libro3ejercicio10{
public static void main(String [] args){
	Scanner s = new Scanner(System.in);
	System.out.println("Introduce un valor en Mb");
	double mb = s.nextDouble();
	double kb = mb * 1024;
	System.out.println(mb + "Mb son " + kb + "Kb");
	}
	}
