package curso_programacao;

import java.util.Scanner;

public class Quebra_De_Linha_Pendente {

	public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL

		// Para ler um texto ATÉ A QUEBRA DE LINHA = nextLine (apenas next lê uma palavra, nextLine lê toda a linha)
		
		//Atentar a quebra de linha pendente quando se insere uma variável de tipo diferente
		//Acrescentar mais um nextline

		Scanner sc = new Scanner(System.in);

		int x;
		String s1, s2, s3;

		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Você digitou:\n");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();

	}

}
