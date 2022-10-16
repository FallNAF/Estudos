package fundamentos.classesEMetodos;

public class BProduto {
	//Nesse caso, foi adicionado diretamente na classe, sem o método main

	String nome;
	double preco;
	static double desconto = 25;
	double precoComDesconto() {
		return preco * (1 - (desconto/100));
	}
	double precoComDesconto(double desconto) {
		return preco * (1 - (desconto/100));
	}
}
