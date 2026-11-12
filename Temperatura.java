import java.util.*;
public class Media{
public static void main(String [] args){
Random r= new Random();
int[] num= new int[10];
int suma= 0;
for(int i =0; i <num.length; i++){
num[i]= r.nextInt(0,101);
suma += num[i];
}
double media= (double)suma / num.length;
int cuantos =0;
System.out.println(Arrays.toString(num));
System.out.println(media);
for(int i =0; i <num.length; i++){
if(num[i] >media){
cuantos++;

}
}
System.out.println(cuantos + " números son mas altos que la media");
}
}
