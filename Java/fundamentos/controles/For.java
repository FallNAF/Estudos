package fundamentos.controles;

public class For {

	public static void main(String[] args) {
	
		int contador = 0;
		
		while (contador <= 5) {
			System.out.printf("contador = %d\n", contador);
			contador++;
		}
		
		/*for(a; b; c){}
		a : criação da variável
		b : "faça até", informa o fim do loop
		c : adiciona a quantidade da variável
		*/
		for(int contador2 = 0; contador2 <= 5; contador2++) {
			System.out.printf("contador2 = %d\n", contador2);
		}
		
	}
}
