public class ArrayBidimensional {
    public static void main (String[] args){
    // creacion de arrays
    int [][]enteros = new int [2][3];
    enteros [0][0]= 1;
    enteros [0][1]= 8;
    enteros [0][2]= -4;
    enteros [1][0]= 6;
    enteros [1][1]= -1;
    enteros [1][2]= 9;
    
    for(int i:enteros)
        System.out.println(Arrays.toString(enteros));
    }
}
