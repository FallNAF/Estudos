package fundamentos.arrayECollections;

import java.util.HashSet;
import java.util.Set;

public class SetHeterogeneo {
	
	/* Pode ser Heterogeneo(dados de tipos diferentes), 
	 * embora seja aconselhado realizar de forma Homogenea(dados do mesmo tipo)
	 * Não aceita Objetos Duplicados/Repetição
	 * Pode ser Ordenado
	 * Não é indexado
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" }) //Adiciona "Exceções", silenciando as Advertências
	public static void main(String[] args) {
		
		//Será apresentado Conjunto de dados Heterogeneos agora
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(2); //int >> Integer
		conjunto.add(5.4); //double >> Double
		conjunto.add(true); //boolean >> Boolean
		conjunto.add("alo"); //String
		
		System.out.println(conjunto.size()); 
		//para medir o tamanho do conjunto, é usado o size, não lenght
		
		conjunto.add("alo");
		System.out.println(conjunto.size()); 
		//mesmo adicionando, o tamanho é o mesmo, pois não é aceito objetos duplicado
		
		System.out.println(conjunto.remove("alo")); 
		//para remover um objeo, é usado o remove, retornando true ou false, se for true, ele irá remover
		System.out.println(conjunto.size());
		
		System.out.println(conjunto);
		
		System.out.println("-".repeat(30));
		Set nums = new HashSet();
		
		nums.add("aa");
		nums.add(23);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		conjunto.addAll(nums); // União entre 2 conjuntos
		System.out.println(conjunto);
		//conjunto.retainAll(nums); //Irá comparar e manter apenas os valores que possuem em ambos os conjuntos
		conjunto.clear();
		System.out.println(conjunto);
		
	}

}
