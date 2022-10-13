package fundamentos.baseFundamental;

public class NotacaoPonto {

	public static void main(String[] args) {
		//Notação ponto influencia e altera a variável/dado de acordo com seu ponto
		
		String a = "Bom dia X";
		
		a = a.toUpperCase(); //.toUpperCase Coloca toda a variável em maiúscula. .toLowerCase é o inverso, em minusculo
		System.out.println(a);
		
		a = a.replace("X", "Senhor"); //.replace Substitui algo na variável
		System.out.println(a);
		
		a = a.concat("!!!"); //.concat Une o texto ao final da variável
		System.out.println(a);
		
		System.out.println(a.length()); //.length informa a quantidade de caracteres na variável
		
		System.out.println("exemplo".toUpperCase());
		
		//para comparar Strings, utiliza-de .equals
	}
}
