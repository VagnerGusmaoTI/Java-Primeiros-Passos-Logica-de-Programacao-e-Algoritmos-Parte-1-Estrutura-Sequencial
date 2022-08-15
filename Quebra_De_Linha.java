package curso_programacao;

import java.util.Scanner;

public class Quebra_De_Linha {

	public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL

		// Para ler um texto ATÉ A QUEBRA DE LINHA = nextLine (apenas next lê uma palavra, nextLine lê toda a linha)

		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Você digitou:\n");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();

	}

}
