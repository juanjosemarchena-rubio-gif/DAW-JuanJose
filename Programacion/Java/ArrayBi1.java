/*Define un array de números enteros de 3 filas por 6 columnas con nombre num
y asigna los valores según la siguiente tabla. Muestra el contenido de todos
los elementos del array dispuestos en forma de tabla como se muestra en la
figura.
*/
import java.util.*;
public class ArrayBi1 {
    public static void main (String[] args){
	Integer[][] num= new Integer[3][6];
	
	num[0][0]=0;
	num[0][1]=30;
	num[0][2]=0;
	num[0][5]=0;
	num[1][0]=75;
	num[1][4]=0;
	num[2][2]=-2;
	num[2][3]=9;
	num[2][5]=11;
	
	for(Integer[] elem:num){
        System.out.println(Arrays.toString(elem));
	}
	
	}
}
