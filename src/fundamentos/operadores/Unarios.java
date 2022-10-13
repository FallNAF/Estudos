package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		//Unários Somente necessita de uma variável, porém possui vários operadores
		
		int a = 1;
		int b = 2;
		
		//Pos fixado
		a++; //a = a + 1
		a--; //a = a - 1
		
		//Pré fixado. na tabela de precedencia, é feito antes das comparações
		++b; //b = b + 1
		--b; //b = b - 1
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(++a == b--);
		
		System.out.println(a);
		System.out.println(b);
	}
	
}
