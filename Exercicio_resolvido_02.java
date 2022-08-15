package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_resolvido_02 {

	public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL
		
		//Exerc�cio resolvido: estrutura sequencial
		//� Fun��es matem�ticas
		//� sqrt
		//� pow
		//� Preced�ncia de operadores e uso de par�ntesis
		
		//Fazer um programa para ler as medidas da base e altura de um ret�ngulo. 
		//Em seguida,mostrar o valor da �rea, per�metro e diagonal deste ret�ngulo, com quatro casas decimais
		
		//�rea = base x altura
		//perimetro = 2x base + 2x altura
		//diagonal= raiz quadrada de base pot�ncia 2 + altura pot�ncia 2
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		double area, perimetro, diagonal, base, altura;
		
		base = sc.nextDouble();
		altura = sc.nextDouble();
		
		area = base*altura;
		perimetro = (base*2.0)+(altura*2.0);
		diagonal = Math.sqrt(Math.pow(base,2.0)+Math.pow(altura,2.0));
				
		System.out.printf("�rea = %.4f%n", area);
		System.out.printf("Per�metro = %.4f%n", perimetro);
		System.out.printf("Diagonal = %.4f%n", diagonal);
		
		sc.close();
	}

}
