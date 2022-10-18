package fundamentos.arrayECollections;

public class Usuario {

	String nome;
	String email;
	
	//Nesse caso, vamos definir os critérios para comparar 2 objetos
	public boolean equals(Object objeto) {
		if(objeto instanceof Usuario) { //verifica se a classe faz parte da classe Usuário
		Usuario outro = (Usuario) objeto;
		boolean nomeigual = outro.nome.equals(this.nome);
		boolean emailigual = outro.email.equals(this.email);
		return nomeigual && emailigual;
		} else return false;
	}
	//O hashCode seria um filtro mais rápido que retorna numeros inteiros a partir dos critérios que forem criados
}
