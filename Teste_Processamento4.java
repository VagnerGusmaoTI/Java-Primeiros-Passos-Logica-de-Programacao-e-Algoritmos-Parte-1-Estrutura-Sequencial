package curso_programacao;

import java.util.Scanner;

public class Teste_Processamento4 {
	
		public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL
		
		//ENTRADA DE DADOS COM N�MERO INTEIRO INT

				//Para fazer entrada de dados criar um objeto do tipo "Scanner"
				//O scanner associa a entrada de dados no console no modo/via teclado
						
				Scanner sc = new Scanner(System.in);
						
				int x;
				//O comando nextInt usado em n�mero inteiro permite que se digite um n�mero e ele seja armazenado na vari�vel
				x = sc.nextInt();
						
				//Atalho: sysout + ctrl + espa�o
						
				System.out.println("Imprimindo o que voc� digitou: " + x);
						
				//Usar sc.close(); para fechar o objeto (sc, no caso, devido ao nome atribuido ao objeto)
				sc.close();

	}

}
