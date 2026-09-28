//Realiza un conversor de Kb a Mb.

import java.util.Scanner;
public class Libro3ejercicio11{
public static void main(String [] args){
	Scanner s = new Scanner(System.in);
	System.out.println("Introduce un valor en Kb");
	double kb = s.nextDouble();
	double mb = kb / 1024;
	System.out.println(kb + "Kb son " + mb + "Mb");
	}
	}

