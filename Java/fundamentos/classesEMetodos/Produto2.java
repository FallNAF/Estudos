package fundamentos.classesEMetodos;

public class Produto2 {
	
	public static void main(String[] args) {
		/*Nesse caso, dentro do Main, foi instanciado a classe produto criada anteriormente
		 * da mesma  que o Scanner
		 * nesse caso, a classe se torna um molde a ser preenchido
		 */
		Produto p1 = new Produto();
		
		//usando o . você acessa os membros da classe criada anteriormente
		p1.nome = "Notebook";
		p1.preco = 1000;
		p1.desconto = 10;
		
		//Ao usar o () no final, você chama um metodo, sem parenteses, um atributo
		double precofinal = p1.precoComDesconto();
		
		System.out.println(precofinal);
		
	}

}
