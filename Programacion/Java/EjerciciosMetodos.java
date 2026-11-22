/*
 * EjerciciosMetodos.java
 * 
 
 * 
 * 
 */

import java.util.*;
public class EjerciciosMetodos {
	
	public static void main (String[] args) {
	int[] notas ={1,3,6,8};
	System.out.println("Suma de las notas: " + sumaVector(notas));
	System.out.println("Nota máxima: " + maximoVector(notas));
	System.out.println("Nota media: " + media(notas));
	System.out.println("Notas pares: " + contarPares(notas));
	System.out.print("Notas: ");
	mostrar(notas);
	System.out.println();
	
	System.out.println("------------------------------------------");
	System.out.println("EJERCICIO 4");
	System.out.println("------------------------------------------");	
	
	int[] datos = new int[20]; 
	rellenarAleatorio(datos, 1, 100); 
	System.out.print("Datos: ");
	mostrar(datos);
	System.out.println();	
	
	System.out.println("------------------------------------------");
	System.out.println("EJERCICIO 5");
	System.out.println("------------------------------------------");
	
	int[] alReves = invertir(datos);
	System.out.print("Array original: ");
    mostrar(datos);
	System.out.println();
    System.out.print("Array invertido: ");
    mostrar(alReves);
    
    System.out.println();
    System.out.println("------------------------------------------");
	System.out.println("EJERCICIO 6");
	System.out.println("------------------------------------------");
	System.out.println();
	
	int[] ordenado = {1, 3, 3, 7};
	int[] desordenado = {5, 8, 3, 9, 6};
	int[] unElemento = {4};
	int[] casiOrdenado = {2, 4, 6, 5};
	System.out.println(estaOrdenado(ordenado));
	System.out.println(estaOrdenado(desordenado));
	System.out.println(estaOrdenado(unElemento));
	System.out.println(estaOrdenado(casiOrdenado));
	
	
	System.out.println();
    System.out.println("------------------------------------------");
	System.out.println("EJERCICIOS BÚSQUEDAS");
	System.out.println("------------------------------------------");
	System.out.println();
	
	System.out.println();
    System.out.println("------------------------------------------");
	System.out.println("EJERCICIO 1");
	System.out.println("------------------------------------------");
	System.out.println();
	
	int[] arrayEnteros = new int[10];
	rellenarAleatorio(arrayEnteros, 1, 20);
	System.out.print("Array generado: ");
	mostrar(arrayEnteros);
	Scanner sc = new Scanner(System.in);
	int numero;

	do {
		System.out.print("¿Qué número del 1 al 20 quieres buscar? (0 para salir): ");
		numero = sc.nextInt();
		if (numero != 0) {
			int posicion = busquedaLineal(arrayEnteros, numero);
			if (posicion != -1) {
				System.out.println("El número " + numero + " está en la posición " + posicion);
			} else {
				System.out.println("El número " + numero + " no está en el array.");
				}
			}

		} while (numero != 0);
		
	System.out.println();
    System.out.println("------------------------------------------");
	System.out.println("EJERCICIO 2");
	System.out.println("------------------------------------------");
	System.out.println();
	
	int[] numeros = {7, 3, 9, 4, 6};
	System.out.print("Array:");
	mostrar(numeros);
	System.out.println();
	int resultado = contarMayoresQue(numeros, 5);
	System.out.println("Elementos mayores que 5: " + resultado);
	
	
	System.out.println();
    System.out.println("------------------------------------------");
	System.out.println("EJERCICIO 3");
	System.out.println("------------------------------------------");
	System.out.println();
	
	int[] ganadora = new int[6];
	rellenarAleatorio(ganadora, 1, 49);
	int[] apuesta = new int[6];
	
	System.out.println("Introduce tus 6 números:");
	
	for (int i = 0; i < apuesta.length; i++) {
		System.out.print("Número " + (i + 1) + ": ");
		do {
			System.out.print("Número " + (i + 1) + ": ");
			apuesta[i] = sc.nextInt();

			if (apuesta[i] < 1 || apuesta[i] > 49) {
				System.out.println("Número no válido. Introduce uno entre 1 y 49.");
				}
			}while (apuesta[i] < 1 || apuesta[i] > 49);
		}
	int aciertos =0;	
	for (int i = 0; i < apuesta.length; i++) {
		if (esta(ganadora, apuesta[i]) == true) {
			aciertos++;
			}
		}		
	System.out.print("Combinación ganadora: ");
	mostrar(ganadora);
	System.out.println();
	System.out.print("Tu apuesta: ");
	mostrar(apuesta);
	System.out.println();
	System.out.println("Has acertado " + aciertos + " números.");
	
	System.out.println();
    System.out.println("------------------------------------------");
	System.out.println("EJERCICIO 4");
	System.out.println("------------------------------------------");
	System.out.println();
	
	int[] num = {4, 7, 3, 7, 9, 7};

	System.out.println(ultimaAparicion(num, 7)); 
	System.out.println(ultimaAparicion(num, 3)); 
	System.out.println(ultimaAparicion(num, 8));
	
	System.out.println();
    System.out.println("------------------------------------------");
	System.out.println("EJERCICIO 5");
	System.out.println("------------------------------------------");
	System.out.println(); 
	
	int[] posiciones = todasLasPosiciones(num, 7);

	System.out.print("Posiciones donde aparece el 7: ");
	mostrar(posiciones);
	
	System.out.println();
    System.out.println("------------------------------------------");
	System.out.println("EJERCICIO 6");
	System.out.println("------------------------------------------");
	System.out.println();
	
	String[] nombres = {"Ana", "Juan", "Pedro", "Lucía", "Marta", "Carlos", "Elena", "David"};

	System.out.print("Introduce un nombre para buscar: ");
	String nombreBuscado = sc.next();

	int posicionNombre = buscarNombre(nombres, nombreBuscado);

	if (posicionNombre != -1) {
		System.out.println("El nombre " + nombreBuscado + " está en la posición " + posicionNombre);
		} else {
			System.out.println("El nombre " + nombreBuscado + " no está en el grupo.");
		}
	
	System.out.println();
    System.out.println("------------------------------------------");
	System.out.println("EJERCICIO 7");
	System.out.println("------------------------------------------");
	System.out.println();
	
	double[] notasClase = {7.5, 8.2, 4.3, 6.7, 3.5, 9.0};
	int primerSuspenso = primerSuspenso(notasClase);
	if (primerSuspenso != -1) {
		System.out.println("El primer suspenso está en el número de lista: " + (primerSuspenso + 1));
		} else {
			System.out.println("Todos los alumnos han aprobado.");
		}
		
	System.out.println();
    System.out.println("------------------------------------------");
	System.out.println("EJERCICIO 8");
	System.out.println("------------------------------------------");
	System.out.println();
	
	int[] vector10 = new int[10];
	int[] vector1000 = new int[1000];
	int[] vector100000 = new int[100000];

	rellenarAleatorio(vector10, 1, 1000000);
	rellenarAleatorio(vector1000, 1, 1000000);
	rellenarAleatorio(vector100000, 1, 1000000);

	int comparaciones10 = comparacionesLineal(vector10, -1);
	int comparaciones1000 = comparacionesLineal(vector1000, -1);
	int comparaciones100000 = comparacionesLineal(vector100000, -1);

	System.out.println("Comparaciones para 10 elementos: " + comparaciones10);
	System.out.println("Comparaciones para 1.000 elementos: " + comparaciones1000);
	System.out.println("Comparaciones para 100.000 elementos: " + comparaciones100000);
	
	
	System.out.println();
    System.out.println("------------------------------------------");
	System.out.println("EJERCICIO 9");
	System.out.println("------------------------------------------");
	System.out.println();
	
	int[] sinRepetir = new int[10];
	rellenarSinRepetir(sinRepetir, 1, 20);
	System.out.print("Array sin repetidos: ");
	mostrar(sinRepetir);
	
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
				}
			}
			return maximo;
		}
	public static double media(int[] v){
		int suma=0;
		for(int i=0; i<v.length; i++){
			suma= v[i] + suma;
			}
		double media= (double)suma / v.length;
		return media;
		}
	public static int contarPares(int[] v){
		int contador=0;
		for(int i=0; i<v.length; i++){
			if(v[i] %2 ==0)
			contador++;
			}
			return contador;
		}
	public static void mostrar(int[] v){
		 for(int i=0; i<v.length; i++){
			 if (i == (v.length -1)){
				 System.out.print(v[i]);
				 }else{
					System.out.print(v[i] + " - ");
				}
			 }	
		 }
	public static void rellenarAleatorio(int[] v, int min, int max){
		Random r = new Random();
		for(int i=0; i <v.length; i++){
			v[i]= r.nextInt(min,(max+1));
			}
		}	 
	public static int[] invertir(int[] v){
	int[] resultado = new int[v.length];
		for (int i = 0; i < v.length; i++) {
			resultado[i] = v[v.length - 1 - i];
			}
			return resultado;	
		}
	public static boolean estaOrdenado(int[] v) {
    for (int i = 0; i < v.length - 1; i++) {
        if (v[i] > v[i + 1]) {
            return false;
			}
		}

		return true;
		}
	public static int busquedaLineal(int[] v, int numero) {

    for (int i = 0; i < v.length; i++) {

        if (v[i] == numero) {
            return i;
			}
		}
		return -1;
	}	
	public static int contarMayoresQue(int[] v, int x) {
    int contador = 0;
    for (int i = 0; i < v.length; i++) {
        if (v[i] > x) {
            contador++;
			}
		}
		return contador;
	}
	
	public static boolean esta(int[] v, int numero) {

		for (int i = 0; i < v.length; i++) {

			if (v[i] == numero) {
				return true;
			}
		}

		return false;
	}
	
	public static int ultimaAparicion(int[] v, int x) {
		for (int i = v.length - 1; i >= 0; i--) {
			if (v[i] == x) {
				return i;
			}
		}

		return -1;
	}
	
	public static int contarApariciones(int[] v, int x) {
		int contador = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] == x) {
				contador++;
			}
		}
		return contador;
	}
	
	public static int[] todasLasPosiciones(int[] v, int x) {
		int cantidad = contarApariciones(v, x);
		int[] resultado = new int[cantidad];
		int j = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] == x) {
				resultado[j] = i;
				j++;
			}
		}

		return resultado;
	}
	public static int buscarNombre(String[] nombres, String nombre) {
		for (int i = 0; i < nombres.length; i++) {
			if (nombres[i].equals(nombre)) {
				return i;
			}
		}

		return -1;
	}	
	
	public static int primerSuspenso(double[] notas) {
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] < 5) {
				return i;
			}
		}

		return -1;
	}
	
	public static int comparacionesLineal(int[] v, int x) {
		int contador = 0;
		for (int i = 0; i < v.length; i++) {
			contador++;
			if (v[i] == x) {
				return contador;
			}
		}
		return contador;
	}
	public static void rellenarSinRepetir(int[] v, int min, int max) {
		Random r = new Random();
		for (int i = 0; i < v.length; i++) {
			int numero;
			do {
				numero = r.nextInt(min, max + 1);
			} while (repetido(v, numero, i));

			v[i] = numero;
		}
	}
	
	public static boolean repetido(int[] v, int numero, int posicion) {

		for (int i = 0; i < posicion; i++) {

			if (v[i] == numero) {
				return true;
			}
		}
		return false;
	}
}

