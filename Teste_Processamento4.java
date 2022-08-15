package curso_programacao;

import java.util.Scanner;

public class Teste_Processamento4 {
	
		public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL
		
		//ENTRADA DE DADOS COM NÚMERO INTEIRO INT

				//Para fazer entrada de dados criar um objeto do tipo "Scanner"
				//O scanner associa a entrada de dados no console no modo/via teclado
						
				Scanner sc = new Scanner(System.in);
						
				int x;
				//O comando nextInt usado em número inteiro permite que se digite um número e ele seja armazenado na variável
				x = sc.nextInt();
						
				//Atalho: sysout + ctrl + espaço
						
				System.out.println("Imprimindo o que você digitou: " + x);
						
				//Usar sc.close(); para fechar o objeto (sc, no caso, devido ao nome atribuido ao objeto)
				sc.close();

	}

}
