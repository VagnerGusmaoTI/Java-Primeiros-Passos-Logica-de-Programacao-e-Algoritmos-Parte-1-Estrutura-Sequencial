package curso_programacao;

import java.util.Locale;

public class Exercicio_SaidaDeDados {
	
	//ESTRUTURA SEQUENCIAL
	
	//Exerc�cio de fixa��o
	//Declara��o de vari�veis
	//Uso de marcadores %s, %f, %n
	//Impress�o e sa�da de dados com println e printf
	//Uso da classe/objeto locale para padr�o US de separador . (ponto)
	
	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age  	= 30;
		int code    = 5290;
		char gender = 'F';
		
		double price1  = 2100.0;
		double price2  = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n%n", product2, price2);
		
		System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender + "\n");
		
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		
	}
	

}
