/*Un restaurante nos ha encargado una aplicación para colocar a los clientes en
sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
(mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
el programa no está preparado para colocar a grupos mayores a 4, por tanto,
si un cliente dice por ejemplo que son un grupo de 6, el programa dará el
mensaje “Lo siento, no admitimos grupos de 6, haga grupos de 4
personas como máximo e intente de nuevo”. Para el grupo que llega,
se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas
libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el
grupo es de dos personas, se podrá colocar donde haya una o dos personas.
Inicialmente, las mesas se cargan con valores aleatorios entre 0 y 4. Cada
vez que se sientan nuevos clientes se debe mostrar el estado de las mesas.
Los grupos no se pueden romper aunque haya huecos sueltos suficientes. El
funcionamiento del programa se ilustra a continuación:*/

import java.util.*;
public class ArrayE15{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    int[] mesas = new int[10];
    final int MAX =4;
    int comensales;
    
    for(int i=0; i <mesas.length; i++){
        mesas[i] = r.nextInt(0,5);
        }
    System.out.println(Arrays.toString(mesas));

    do{
        System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa)");
        comensales = sc.nextInt();
        for(int j:mesas){
            if(comensales >MAX){
                System.out.println("Lo siento, no admitimos grupos de " + comensales + ", haga grupos de 4 personas como máximo e intente de nuevo");
                }else if(comensales ==-1){
                    break;
                    }else if(mesas[j] ==0){
                        System.out.println("Bienvenidos, pueden sentarse en la mesa " + (j+1));
                        mesas[j] = comensales + mesas[j];
                        System.out.println(Arrays.toString(mesas));
                        }else if(mesas[j] + comensales < MAX){
                            System.out.println("Bienvenidos, pueden sentarse en la mesa " + (j+1));
                            mesas[j] = comensales + mesas[j];
                            System.out.println(Arrays.toString(mesas));
                            }else{
                                System.out.println("Lo siento, actualmente no tenemos sitio para grupos de " + comensales);
                            }
        }while(mesas[j] <= MAX);
        System.out.println("Lo siento, el restaurante está completo, vuelvan en otro momento");
    }
}