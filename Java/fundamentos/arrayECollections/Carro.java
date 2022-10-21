package fundamentos.arrayECollections;

import java.util.Objects;

public class Carro {
	
	String nome;
	
	Carro(String nome){
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(nome, other.nome);
	}


}
