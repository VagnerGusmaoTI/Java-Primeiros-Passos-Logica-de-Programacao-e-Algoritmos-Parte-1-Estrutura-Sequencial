package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_resolvido_02 {

	public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL
		
		//Exercício resolvido: estrutura sequencial
		//• Funções matemáticas
		//• sqrt
		//• pow
		//• Precedência de operadores e uso de parêntesis
		
		//Fazer um programa para ler as medidas da base e altura de um retângulo. 
		//Em seguida,mostrar o valor da área, perímetro e diagonal deste retângulo, com quatro casas decimais
		
		//área = base x altura
		//perimetro = 2x base + 2x altura
		//diagonal= raiz quadrada de base potência 2 + altura potência 2
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		double area, perimetro, diagonal, base, altura;
		
		base = sc.nextDouble();
		altura = sc.nextDouble();
		
		area = base*altura;
		perimetro = (base*2.0)+(altura*2.0);
		diagonal = Math.sqrt(Math.pow(base,2.0)+Math.pow(altura,2.0));
				
		System.out.printf("Área = %.4f%n", area);
		System.out.printf("Perímetro = %.4f%n", perimetro);
		System.out.printf("Diagonal = %.4f%n", diagonal);
		
		sc.close();
	}

}
