package fundamentos.controles;

import java.util.Scanner;

public class Ex15NumPrimo {
	
	public static void main(String[] args) {
		int cont=0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um número:");
		int num = entrada.nextInt();
		for (int i = 2;i < num; i++) {
			
		
		if(num % i == 0) cont++;
		
		}
		
		if(cont == 0) System.out.println("É Primo");
		else System.out.println("Não é Primo");
		
		
		
		
		
		entrada.close();
	}

}
