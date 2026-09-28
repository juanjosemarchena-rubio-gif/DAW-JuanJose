//Declara dos variables: peso (en kg) y altura (en metros). 
//Calcula el IMC con la fórmula IMC = peso / (altura * altura). 
//■ Si IMC < 18.5: "Bajo peso". 
//■ Si IMC está entre 18.5 y 24.9: "Peso normal". 
//■ Si IMC está entre 25 y 29.9: "Sobrepeso". 
//■ Si IMC >= 30: "Obesidad".
import java.util.*;
public class Ejercicio8{
		public static void main (String[] args){
			
			float peso = 0;
			float altura = 0;
			float imc = 0;
			Scanner s = new Scanner (System.in);
			System.out.println("Introduce tu peso");
			peso = s.nextFloat();
			System.out.println("Introduce tu altura");
			altura = s.nextFloat();
			imc = peso / (altura * altura);
			System.out.println("Tu IMC es" + imc);
			
			if (imc < 18.5){
			System.out.println("Peso bajo");
		}else if (imc >=30){
			System.out.println("Obesidad");
		}else if (imc >= 18.5 && imc < 24.9){
			System.out.println("Peso normal");
			}else if (imc >= 25 && imc < 29.9){
			System.out.println("Sobrepeso");
			

			
			
		}
	}
}
