package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_resolvido_03 {

	public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL

		//• Aplicamos:
		//• String
		//• Casting
		
		//Fazer um programa para ler o nome (apenas uma palavra) e idade de duas pessoas.
		//Ao final mostrar uma mensagem com os nomes e a idade média entre essas pessoas,
		//com uma casa decimal
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String pessoa1, pessoa2;
		double idade1, idade2, mediaIdade;
		
		pessoa1 = sc.next();
		idade1 = sc.nextDouble();
		
		pessoa2 = sc.next();
		idade2 = sc.nextDouble();
		
		mediaIdade = (idade1+idade2) / 2.0;
		
		System.out.printf("A idade média entre %s e %s é de %.1f anos %n", pessoa1, pessoa2, mediaIdade);
		
		sc.close();
		

	}

}
