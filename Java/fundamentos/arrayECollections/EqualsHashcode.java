package fundamentos.arrayECollections;

public class EqualsHashcode {
	public static void main(String[] args) {
		Usuario a1 = new Usuario(); 
		a1.nome = "Bruno";
		a1.email = "bruno@gmail.com";
		
		Usuario a2 = new Usuario(); 
		a2.nome = "Bruno";
		a2.email = "bruno@gmail.com";
		
		System.out.println(a1 == a2);
		/* No exemplo acima, irá retornar falso por comparar 2 objetivos
		 * distintos no quesito endereço na mémoria, mesmo o conteúdo de ambos ser o mesmo
		 */
		//System.out.println(a1.equals(a2)); Mesma comparação do print acima, porém para funcionar, precisa criar os critérios, indo na classe Usuário
		
	}

}
