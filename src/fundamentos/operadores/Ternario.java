package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		//O unico ternário é uma condicional
		//? informação   . vai atribui essa informação para quando a resposta por true
		//: informação   . vai atribui essa informação para quando a resposta por false
		
		double media = 5.6;
		
		//Uma espécie de Se/if, onde se a condição(media >= 5.0) for verdadeira, vai retornar o ?, senão vai retornar o :
		
		String resultadoParc = media >= 5.0 ? "Em recuperação" : "Reprovado";
		
		String resultado = media >= 7.0 ? "Aprovado" : resultadoParc;
		
		System.out.println(resultado);
	}
	
}
