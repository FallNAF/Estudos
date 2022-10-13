package fundamentos.controles;

public class Switch1 {
	public static void main(String[] args) {
		/*
		 * if(bool){}
		 * for(;bool;;){}
		 * while(bool){}
		 * Todos os acimas necessitam de um retorno booleano, verdadeiro ou falso para acessar o módulo
		 * Para o Switch, ele recebe especificamente o valor
		 
		   Case será como um If, onde se o conteudo do case for true, ele irá acessar entrar
		 * case "conteudo da variável":
		 * 		seguimento do Case, se for true, ele irá reproduzir
		 */
		String a = "branco";
		//switch(Informar a variável a ser lida){}
		switch(a.toLowerCase()) {
		case "preto":
			System.out.println("Black");
			break;
		case "branco":
			System.out.println("White");
		case "cinza:":
			System.out.println("Gray");
		case "azul":
			System.out.println("Blue");
			
		//Para os cases, tudo o que estiver abaixo do case que acessou, ele vai executar todos os subsequentes
		//Para interromper esse procedimento, é usado o break
			
		default: //Padrão, se não for nenhum deles
			System.out.println("Incorreto");
		
		
		}
	}

}
