package fundamentos.arrayECollections;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	/* Pode ser Heterogeneo(dados de tipos diferentes), 
	 * embora seja aconselhado realizar de forma Homogenea(dados do mesmo tipo)
	 * Aceita Objetos Duplicados/Repetição
	 * É Ordenado
	 * É indexado
	 */
	public static void main(String[] args) {
		
	List<Carro> lista = new ArrayList<>();

	lista.add(new Carro("Monza"));
	lista.add(new Carro("Uno"));
	lista.add(new Carro("Onix"));
	lista.add(new Carro("Monza"));
	
	System.out.println(lista.get(2).nome);
	//Exemplo mostrando que a lista é indexada, podendo acessar de acordo com o indice
	
	System.out.println("-".repeat(30));
	for(Carro u: lista) {
		System.out.println(u.nome);
		//Segue a ordem de inserção por padrão
	}
	System.out.println("-".repeat(30));
	
	//lista.remove(new Usuario("Uno")); Remove por Objeto, podendo eliminar todos os duplicados junto
	lista.remove(1); //Elimina apenas pelo indice
	for(Carro u: lista) {
		System.out.println(u.nome);
	}

 
}
}