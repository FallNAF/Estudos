package fundamentos.controles;

import java.util.Scanner;

public class Ex16NumPrimoSwitch {

	public static void main(String[] args) {
		int cont = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um número:");
		int num = entrada.nextInt();
		for (int i = 2;i < num; i++) {
			System.out.println("a "+ num % i);
			
			if(num % i == 0) {
				System.out.println("b "+ num % i);
				cont++;
			}
			
			}
		switch(cont){
		case (0): 
			System.out.println("É Primo");
			break;
		default: System.out.println("Não é primo");

			
		}
		
		
		entrada.close();
	}
}
