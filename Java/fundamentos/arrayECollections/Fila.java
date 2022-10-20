package fundamentos.arrayECollections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.offer("Carlos"); //Para casos onde a fila tem limite, ele retorna False se não conseguir adicionar
		fila.add("Ana"); // para casos de fila de limite pré definido, se não conseguir adicionar, ele retorna erro. lança uma exceção
		fila.offer("Bruno");
		
		System.out.println(fila.peek()); //Lê o próximo elemento da fila, porém não altera ou remove
		System.out.println(fila.element()); //Semelhante ao peek, porém se a fila estiver vazia, esse vai retornar erro. lança uma exceção
	
		System.out.println(fila.size()); //Informa o tamanho da fila
		
		System.out.println(fila.poll()); //Irá informar o próximo elemento da fila, e após isso, remove-o
		System.out.println(fila.remove()); //Semelhante ao peek, porém se a fila estiver vazia, esse vai retornar erro. lança uma exceção
		
		fila.clear(); //Limpa a fila
		System.out.println(fila);
		fila.isEmpty(); //Retorna true ou false se a fila está vazia
	}

}
