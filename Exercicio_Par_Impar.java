package curso_programacao;

public class Exercicio_Par_Impar {

	public static void main(String[] args) {
		
		//ESTRUTURA CONDICIONAL
		
		//Exerc�cio de L�gica de par/�mpar por Rodrigo Gameiro
		//Par 	= quando resto do n�mero dividido por 2 = 0
		//�mpar = quando resto do n�mero dividido por 2 = 1
				
			int x = 927;
				
			if (x%2 == 0) {
				System.out.printf("O n�mero %d � par.", x);
			} else { 
				System.out.printf("O n�mero %d � �mpar.", x);
			}
	}

}
