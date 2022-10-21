package fundamentos.arrayECollections;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Carro> carros = new HashSet<>();
		
		carros.add(new Carro("Ana"));
		carros.add(new Carro("Carlos"));
		carros.add(new Carro("Guilherme"));
		
		System.out.println(carros.contains(new Carro("Guilherme")));
	}
}
