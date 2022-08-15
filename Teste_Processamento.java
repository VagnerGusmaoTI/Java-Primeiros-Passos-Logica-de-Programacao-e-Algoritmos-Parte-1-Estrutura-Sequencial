package curso_programacao;

public class Teste_Processamento {
	
		public static void main(String[] args) {
			
		//ESTRUTURA SEQUENCIAL
			
		//SA�DA DE DADOS
		
		//Atribui��o de valor a vari�veis, operador = (igual a)
		//C�lculo b�sico com n�meros inteiros
		
		int x, y;
		x = 4;
		y = 7 * x;
		
		System.out.println(x);
		System.out.println(y + "\n");
		
		//C�lculo b�sico com n�mero flutuante

		int t;
		double u;
		t = 3;
		u = 9 * t;
		System.out.println(t);
		System.out.println(u + "\n");
		
		//C�lculo da �rea de um trap�zio (com double)
		//Boa pr�tica: no double colocar o .0 (ponto zero nas vari�veis mesmo sabendo que � double)
		
		double b, B, h, area;
		
		b = 5.0;
		B = 3.0;
		h = 8.0;
		
		area = (b + B) / 2 * h;
		
		System.out.println(area + "\n");
		
		
		//C�lculo da �rea de um trap�zio (com float)
		
		float a, A, alt, area2;
				
		a = 10f;
		A = 2f;
		alt = 3f;
				
		area2 = (a + A) / 2f * alt;
				
		System.out.println(area2 + "\n");
		
		//Casting convers�o expl�cita dos valores (de um tipo para outro)
		
		//Exemplo sem casting
		
		int c, d;
		double resultado;
		c = 9;
		d = 7;
		resultado = c / d;
		System.out.println(resultado);
		
		//Exemplo com casting
		
		int e, f;
		double resultado2;
		e = 9;
		f = 7;
		resultado2 = (double) e / f;
		System.out.println(resultado2 + "\n");
		
		//Exemplo de convers�o com casting
		
		double g;
		int h3;
		g = 14.0;
		h3 = (int) g;
		System.out.println(h3 + "\n");

		
		
				
	}

}
