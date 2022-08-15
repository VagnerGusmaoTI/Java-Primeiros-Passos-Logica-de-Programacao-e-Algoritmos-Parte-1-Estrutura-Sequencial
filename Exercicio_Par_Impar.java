package curso_programacao;

public class Exercicio_Par_Impar {

	public static void main(String[] args) {
		
		//ESTRUTURA CONDICIONAL
		
		//Exercício de Lógica de par/ímpar por Rodrigo Gameiro
		//Par 	= quando resto do número dividido por 2 = 0
		//Ímpar = quando resto do número dividido por 2 = 1
				
			int x = 927;
				
			if (x%2 == 0) {
				System.out.printf("O número %d é par.", x);
			} else { 
				System.out.printf("O número %d é ímpar.", x);
			}
	}

}
