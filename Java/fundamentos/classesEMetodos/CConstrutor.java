package fundamentos.classesEMetodos;

public class CConstrutor {
	/*Construtor é um método especial para criar instancias
	 * O construtor padrão vem naturalmente como "nomeDaClasse()"
	 * Ex: Contrutor p1 = new Construtor();
	 * ao criar um novo construtor, o padrão é perdido
	 * o Construtor por padrão, não retorna nada, diferente do método comum, que pode retornar
	 */
	String nome;
	int preco;
	int desconto;
	//Esse é um construtor novo criado, que solicita uma variável ao ser acionado no comando
	CConstrutor(String nomeInicial, int precoInicial,int descontoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	//Ao criar um novo dessa forma, você cria de forma explicita o construtor padrão, o qual havia sido perdido
	CConstrutor(){
		
	}
}
