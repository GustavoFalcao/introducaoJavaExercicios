package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
	int a = 3;
	int b = a;
	int c = a + b;
	
	c += b;			// c = c + b;
	c -= b;			// c = c - b;
	c *= b;			// c = c * b;
	c /= b;			// c = c / b;

	c++;			// c = c + 1;
	
	System.out.println(c);	
	c %= b;			// c = c % b;  0 - Par ou 1 - Ímpar
	System.out.println(c);
	}
}
