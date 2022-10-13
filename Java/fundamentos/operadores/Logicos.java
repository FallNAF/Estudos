package fundamentos.operadores;

public class Logicos {
	
	public static void main(String[] args) {
		
		boolean a = true;
		boolean b = 5 > 7;
		
		System.out.println(a && b);
		//&&(e/and) informa que todas as comparações precisam ser true, senão, irá retornar false
		
		
		System.out.println(a || b); 
		//||(ou/or) informa que pelo menos uma das comparações precisa ser true, senão, irá retornar false
		
		
		System.out.println(a ^ b); 
		//^ (somente um/xor) informa que somente uma das comparações precisa ser true,
		//se mais de uma comparação for true, ele irá retorna false, assim como se nenhuma for true, também será false		

		System.out.println(!a);
		System.out.println(!b);
		//! é a negação da condição, informa o contrário da váriável
		
		
	}

}
