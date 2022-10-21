package fundamentos.arrayECollections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		
		livros.push("Neuromancer");//.add funciona como fila, para ser uma pilha, precisaria usar o push
		livros.push("Mindset"); // para casos de fila de limite pré definido, se não conseguir adicionar, ele retorna erro. lança uma exceção
		livros.push("O Hobbit");
		
		System.out.println(livros.peek()); //Lê o próximo elemento da fila, porém não altera ou remove
		
		System.out.println(livros.poll()); //Irá informar o próximo elemento da fila, e após isso, remove-o
		System.out.println(livros.pop()); //Semelhante ao poll, mas lança uma exceção
		
		
	}
}
