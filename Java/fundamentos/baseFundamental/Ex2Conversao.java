package fundamentos.baseFundamental;

import java.util.Scanner;

public class Ex2Conversao {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o Ultimo salário recebido:");
		String sal1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Insira o Penultimo salário recebido:");
		String sal2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Insira o Antepenultimo salário recebido:");
		String sal3 = entrada.nextLine().replace(",", ".");
		
		double salario1 = Double.parseDouble(sal1); 
		double salario2 = Double.parseDouble(sal2); 
		double salario3 = Double.parseDouble(sal3); 
		
		double soma = salario1 + salario2 + salario3;
		
		System.out.println("A soma dos salários nos 3 meses é:" + soma);
		
		System.out.println("A média dos salários é:" + soma / 3);
		
		entrada.close();
	}
	
}
