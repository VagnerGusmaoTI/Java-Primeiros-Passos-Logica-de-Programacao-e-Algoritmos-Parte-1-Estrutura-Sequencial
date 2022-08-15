package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Teste_Processamento7 {
	
	public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL
		
		//ENTRADA DE DADOS COM DIVERSOS TIPOS
		
		//Para fazer entrada de dados criar um objeto do tipo "Scanner"
		//O scanner associa a entrada de dados no console no modo/via teclado
				
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		String x;
		int y;
		double z; 
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
				
		System.out.println("Imprimindo o que você digitou: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();

	}

}
