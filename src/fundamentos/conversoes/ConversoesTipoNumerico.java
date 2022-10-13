package fundamentos.conversoes;

public class ConversoesTipoNumerico {

	public static void main(String[] args) {
		
		double a = 1; //Nesse caso a variável é Double por padrão
		System.out.println(a);
		
		//float b = 1.0;
		//mesmo colocando float, ele se mantém double, por natureza
		//sendo necessário colocar de forma explicita a conversão de double para Float
		float c = 2.0F; //Exemplo de conversão explicita
		float d = (float) 1.1241253142523; //Exemplo de conversão explicita
		System.out.println(c);
		System.out.println(d);
		
		double e = 1.7;
		int f = (int) e;
		System.out.println(f);
	}
	
}
