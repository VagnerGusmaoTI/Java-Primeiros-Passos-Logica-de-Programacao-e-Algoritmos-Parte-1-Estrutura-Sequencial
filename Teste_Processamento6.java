package curso_programacao;

import java.util.Scanner;

public class Teste_Processamento6 {
	
		public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL
		
		//ENTRADA DE DADOS COM CARACTERE (CHAR)
		
		//Para fazer entrada de dados criar um objeto do tipo "Scanner"
		//O scanner associa a entrada de dados no console no modo/via teclado
				
		Scanner sc = new Scanner(System.in);
				
		char x;
		//O comando charAt(0) pega o primeiro caracter da string
		x = sc.next().charAt(0);
				
		//Atalho: sysout + ctrl + espaço
				
		System.out.println("Imprimindo o que você digitou: " + x);
				
		//Usar sc.close(); para fechar o objeto (sc, no caso, devido ao nome atribuido ao objeto)
		sc.close();

	}

}
