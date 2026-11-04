public class BucleExtendido{
	
		public static void main(String[] args){
		/*	int[] vEnteros={1,2,3,4,5,6,7,8,9,10};
			
			//for each
			for(int i:vEnteros){
				System.out.print(i + " ");
				}
				*/
			int[] vEnteros2 = new int[10];	
			String[] vCadena = new String[10];
			
			
			vEnteros2[3]= 6;	
			vEnteros2[8]= 3;
			
			vCadena[2]= "Hola";
			vCadena[3]= "Adios";
			
			for(int elem:vEnteros2){
				System.out.print(elem + " ");
				}
			System.out.println();
			
			for(String elem:vCadena){
				System.out.print(elem + " ");
				}
			System.out.println();
 		}
	}
