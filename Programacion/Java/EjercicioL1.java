/*Escribe un programa en el que se declaren las variables enteras xey.Asignales
los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
el valor de cada variable, la suma, la resta, la división y la multiplicación.*/


public class EjercicioL1 {
public static void main(String[] args) {
int x = 144;
int y = 999;
System.out.println("El valor de x es" + x);
System.out.println("El valor de y es" + y);
int sum = x + y;
System.out.println("La suma de mis variables es " + sum);
int mul = x * y;
System.out.println("La multiplicación de mis variables es " + mul);
int res = y - x;
System.out.println("La resta de mis variables es " + res);
double div = (double) y / x;
System.out.println("La división de mis variables es " + div);
}
}

