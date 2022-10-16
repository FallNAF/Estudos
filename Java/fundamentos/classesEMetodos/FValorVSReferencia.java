package fundamentos.classesEMetodos;

public class FValorVSReferencia {
	
	public static void main(String[] args) {
		
	int a = 2;
	int b = a;
	/* Nesse caso,a atribuição é por valor(primitivo),
	 * onde o b cria uma cópia do a, e trabalha independetemente
	 */
	b++;
	a--;
	System.out.println("A:"+ a);
	System.out.println("B:"+ b);
	//Como pode ser visto, as variáveis são unicas, separadas
	
	BProduto p1 = new BProduto();
	BProduto p2 = p1;
	/* Nesse caso, a atribuição é por referencia, 
	 * onde os 2 objetos acessam o mesmo caminho/referencia
	 * e compartilham os mesmo dados, onde ao alterar um
	 * o outro vai ser alterado também
	 */
	p1.nome = "Monza";
	System.out.println(p1.nome);
	System.out.println(p2.nome);
	
	p2.nome = "Fusca";
	System.out.println(p1.nome);
	System.out.println(p2.nome+"\n");
	
	System.out.println(p1.preco );
	System.out.println(p2.desconto+"\n");
	
	p2.preco = 100;
	p1.desconto = 30;
	System.out.println(p1.preco);
	System.out.println(p2.desconto);
	}
}
