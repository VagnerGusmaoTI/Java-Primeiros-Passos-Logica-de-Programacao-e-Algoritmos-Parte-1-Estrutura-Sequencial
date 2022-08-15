package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Teste_Processamento5 {
	
	public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL
		
		//ENTRADA DE DADOS COM NÚMERO FLUTUANTE DOUBLE

		//Para fazer entrada de dados criar um objeto do tipo "Scanner"
		//O scanner associa a entrada de dados no console no modo/via teclado
		//Uso do locale para padronizar o .(ponto) no padrão americano
				
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		double x;
		//O comando nextDouble usado em número flutuante permite que se digite um número e ele seja armazenado na variável
		x = sc.nextDouble();
				
		//Atalho: sysout + ctrl + espaço
				
		System.out.println("Imprimindo o que você digitou: " + x);
				
		//Usar sc.close(); para fechar o objeto (sc, no caso, devido ao nome atribuido ao objeto)
		sc.close();

		
	}

}
