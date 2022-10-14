package fundamentos.controles;

import java.util.Random;
import java.util.Scanner;

public class Ex17AdvinhaNum {
	/**
	 * 17. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene
	 * um número aleatório em uma variável. O Jogador tem 10 tentativas para
	 * adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade
	 * de tentativas restantes, e imprima se o número inserido é maior ou menor do
	 * que o número armazenado.
	 */
	public static void main(String[] args) {
	
	Random random= new Random();
	int num = random.nextInt(100);
	System.out.println(num);
	Scanner entrada = new Scanner(System.in);
	int numusuario = 0;
	//Declaração de variáveis até aqui
	
	
	for(int cont = 10; cont>0 ;cont--) {
	numusuario = 0;
	System.out.println("Advinhe um número, você tem "+ cont +" tentativas:");
	numusuario = entrada.nextInt();	
		if(num > numusuario) {
		System.out.println("Você erro, o numero aleatório é maior");
		}
		else if(num == numusuario) {
			System.out.printf("Você Advinhou! você informou %d e o numero aleatório era %d", num, numusuario);
			cont = -1;
			//pode ser feito um break do for, referenciando o for um nome"externo: for(){}" 
		}
		else System.out.println("Você errou, o numero aleatório é menor");
	
	if(cont > 0) {
		System.out.printf("Acabou as tentativas!o numero aleatório era %d", num);
	}
	}
	entrada.close();
	}
}
