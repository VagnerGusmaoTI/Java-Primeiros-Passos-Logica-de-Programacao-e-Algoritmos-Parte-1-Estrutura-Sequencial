package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Teste_RaioAPotencia {

	public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double n, raio;
		
		n = 3.14159;
		raio = sc.nextDouble();
		
		System.out.println("O cáculo da área é raio a potência vezes pi, ou seja, = " + Math.pow(raio, raio) * n);
		
		sc.close();

	}

}
