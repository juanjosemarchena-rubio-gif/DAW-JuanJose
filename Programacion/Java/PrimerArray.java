public class PrimerArray{
	
		public static void main(String[] args){
			
			int[] vector = new int[5];
			
			/*
			vector[0] = 1;
			vector[1] = 2;
			vector[2] = 3;
			vector[3] = 4;
			vector[4] = 5;
			
			System.out.println("El valor de la posición 1 es: " + vector[0]);
			*/
			int[] vector = {1,2,3,4,5};
			
			char[] vectorCaracter;
			vectorCaracter = new char[10];
			
				for(int i=0; i<5; i++){
					vector[i] = i +1;
					System.out.println("El valor de la posición " + i + " es: " + vector[i]);
					} 
			
			
			}
}
