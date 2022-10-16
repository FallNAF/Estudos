package fundamentos.classesEMetodos;

public class BProduto2 {
	
	public static void main(String[] args) {
		/*Nesse caso, dentro do Main, foi instanciado a classe produto criada anteriormente
		 * da mesma  que o Scanner
		 * nesse caso, a classe se torna um molde a ser preenchido
		 */
		BProduto p1 = new BProduto();
		
		//usando o . você acessa os membros da classe criada anteriormente
		p1.nome = "Notebook";
		p1.preco = 1000;

		//Ao usar o () no final, você chama um metodo, sem parenteses, um atributo
		double precofinal = p1.precoComDesconto();
		
		System.out.println(precofinal);
		
		/*Caso o vendedor queira adicionar o desconto manualmente,
		 * .precoComDesconto(); porém, informando a porcentagem do desconto
		 * como dar 30% de desconto, o padrão é 25%
		 */
		System.out.println(p1.precoComDesconto(30));
		
	}

}
