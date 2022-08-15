package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL
		
		//Diferenças:
		//System.out.println(); = com ln quebra a linha
		//System.out.print(); 	= sem ln não quebra a linha
		//Uso do \n = quebra de linha
		
		System.out.println("Hello World!");
		System.out.println("Bom dia!");
		System.out.println();
		
		System.out.print("Testando impressão ");
		System.out.print("||| sem quebra de linha \n");
		System.out.println();
		
		//Escrever e imprimir variável
		int y = 32;
		
		System.out.println(y + "\n");
		
		//Escrever e exibir variável de ponto flutuante
		
		double x = 10.35784;
		
		System.out.println(x);
		
		//Imprimir com formatação = f para 2 casas decimais / %f = ponto flutuante
		//O printf usa o separador padrão de cada país, no Brasil é , (vírgula)
		//Uso do %n = quebra de linha

		System.out.printf("%.2f%n", x);
		
		//Imprimir com formatação = f para 4 casas decimais
		
		System.out.printf("%.4f%n", x);
		
		//Uso do locale para impressão do separador . (ponto)
		//Necessário fazer o import.java.util.Locale acima da classe
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n%n", x);
		
		//Concatenação com println 
		
		System.out.println("O resultado é: " + x + "\n");
		
		//Concatenação com printf / %f = ponto flutuante
		
		System.out.printf("O resultado é: %.2f metros.%n%n", x);
		
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
