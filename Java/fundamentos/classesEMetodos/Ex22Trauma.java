package fundamentos.classesEMetodos;

public class Ex22Trauma {

	int a = 3;
	static int b=2;
	
	/*Somente variáveis static consegue acessar métodos static, 
	 * a menos que se cria-se instancias dentro do método:
	 * 		Ex22Trauma p = new Ex22Trauma();
	 */
	public static void main(String[] args) {
		
		Ex22Trauma p = new Ex22Trauma();
		System.out.println(p.a);
		System.out.println(b);
	}
}
