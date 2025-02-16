package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_resolvido_01 {

	public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL
		
		//Exerc�cio proposto com: entrada de dados + processamento de dados + sa�da de dados 
		
		// Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma casa decimal, 
		//bem como o valor do metro quadrado do terreno com duas casas decimais. 
		//Em seguida, o programa deve mostrar o valor da �rea do terreno, bem como o valor do pre�o do terreno, ambos com duas casas decimais. 
		//Exemplo entrada: largura = 10.0 comrpimento = 30.0 metro quadrado 200.00
		//Exemplo sa�da: area (largura x comprimento) = 300.00 preco (area x metro quadrado) = 60000.00
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		sc.close();

	}

}
