package fundamentos.classesEMetodos;

public class Produto {
	//Nesse caso, foi adicionado diretamente na classe, sem o método main

	String nome;
	double preco;
	double desconto;
	double precoComDesconto() {
		return preco * (1 - (desconto/100));
	}
}
