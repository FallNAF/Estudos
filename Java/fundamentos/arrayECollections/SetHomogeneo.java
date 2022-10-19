package fundamentos.arrayECollections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetHomogeneo {
	
	/* Pode ser Heterogeneo(dados de tipos diferentes), 
	 * embora seja aconselhado realizar de forma Homogenea(dados do mesmo tipo)
	 * Não aceita Objetos Duplicados/Repetição
	 * Pode ser Ordenado
	 * Não é indexado
	 */
	
	public static void main(String[] args) {
		
		//Será apresentado Conjunto de dados Homogeneos agora
		
		Set<String> lista = new HashSet<>(); 
		//Usando o <TipoDeDado>, só vai ser aceito no Conjunto esse tipo de dado
		
		lista.add("Bruno");
		lista.add("Lucas");
		lista.add("Pedro");
		//lista.add(2); Dessa forma, não irá aceitar objetos além de String(nesse caso, Integer)
		lista.add("Ana");
		lista.add("Carlos");
		
		for(String candidato: lista) {
			System.out.println(candidato);
			//Como pode ser visto, a lista não segue a ordem de inserção
		}
		
		System.out.println("-".repeat(30));
		
		SortedSet<String> CandidatosAprovados = new TreeSet<>();  
		//Nesse caso, por ser uma TreeSet, ela é Ordenada, garante a ordem Alfabética.
		//Para garantir a ordem de Inserção, é usado o LinkedHashSet
		
		CandidatosAprovados.add("Bruno");
		CandidatosAprovados.add("Lucas");
		CandidatosAprovados.add("Carlos");
		CandidatosAprovados.add("Pedro");
		CandidatosAprovados.add("Ana");
		
		for(String candidato: CandidatosAprovados) {
			System.out.println(candidato);
		}
		
	}
}
