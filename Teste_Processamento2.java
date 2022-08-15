package curso_programacao;

import java.util.Scanner;

public class Teste_Processamento2 {
	
		public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL
		
		//ENTRADA DE DADOS COM STRING
		
		//Para fazer entrada de dados criar um objeto do tipo "Scanner"
		//O scanner associa a entrada de dados no console no modo/via teclado
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		//O comando next usado em string permite que se digite uma palavra e ela seja armazenada na variável
		x = sc.next();
		
		//Atalho: sysout + ctrl + espaço
		
		System.out.println("Imprimindo o que você digitou: " + x);
		
		//Usar sc.close(); para fechar o objeto (sc, no caso, devido ao nome atribuido ao objeto)
		sc.close();
		
	}
	
}
