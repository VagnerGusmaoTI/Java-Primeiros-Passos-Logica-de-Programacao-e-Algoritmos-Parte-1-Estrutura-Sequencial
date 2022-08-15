package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL
		
		//Diferen�as:
		//System.out.println(); = com ln quebra a linha
		//System.out.print(); 	= sem ln n�o quebra a linha
		//Uso do \n = quebra de linha
		
		System.out.println("Hello World!");
		System.out.println("Bom dia!");
		System.out.println();
		
		System.out.print("Testando impress�o ");
		System.out.print("||| sem quebra de linha \n");
		System.out.println();
		
		//Escrever e imprimir vari�vel
		int y = 32;
		
		System.out.println(y + "\n");
		
		//Escrever e exibir vari�vel de ponto flutuante
		
		double x = 10.35784;
		
		System.out.println(x);
		
		//Imprimir com formata��o = f para 2 casas decimais / %f = ponto flutuante
		//O printf usa o separador padr�o de cada pa�s, no Brasil � , (v�rgula)
		//Uso do %n = quebra de linha

		System.out.printf("%.2f%n", x);
		
		//Imprimir com formata��o = f para 4 casas decimais
		
		System.out.printf("%.4f%n", x);
		
		//Uso do locale para impress�o do separador . (ponto)
		//Necess�rio fazer o import.java.util.Locale acima da classe
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n%n", x);
		
		//Concatena��o com println 
		
		System.out.println("O resultado �: " + x + "\n");
		
		//Concatena��o com printf / %f = ponto flutuante
		
		System.out.printf("O resultado �: %.2f metros.%n%n", x);
		
		//Marcadores: 
		//%f = ponto flutuante
		//%d = inteiro
		//%s = texto
		//%n = quebra de linha
		
		String nome 	= "Maria";
		int idade 		= 31;
		double renda 	= 4000.0;
		
		System.out.printf("%s tem %d anos e ganha R$%.2f reais.%n", nome, idade, renda);
		
	}

}
