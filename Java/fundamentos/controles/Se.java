package fundamentos.controles;

import java.util.Scanner;

public class Se {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média:");
		Double media = entrada.nextDouble();
		
		//Se/if = indica uma condição que se for true, irá realizar a chave {}
		if (media >= 7 && media <= 10) {
			System.out.println("Parabéns, você está aprovado");		
		}
		
		
		//E se/outro se/else if =  uma condição de outro Se, para evitar vários else { if{} }
		else if (media <7 && media >= 5) {
			System.out.println("Você está em recuperação");	
		}
		
		
		//senão/else = Indica quando nenhuma das condições/se forem true, ele irá rodar o else
		else {
			System.out.println("Você está reprovado");
		}
		
		
		entrada.close();
	}
}
