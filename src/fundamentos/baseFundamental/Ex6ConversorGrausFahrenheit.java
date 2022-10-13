package fundamentos.baseFundamental;

import java.util.Scanner;

public class Ex6ConversorGrausFahrenheit {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe qual Temperatura deseja fazer a conversão: Graus ou Fahrenheit");
		String op = entrada.nextLine().toLowerCase().trim();
		
		if ("fahrenheit".equals(op) || "fahrenheits".equals(op)) {
			
			System.out.println("Insira o valor em Fahrenheit:");
			String a = entrada.nextLine().replace(",", ".");
			
			Double tempF = Double.parseDouble(a);
			
			double tempC = (tempF - 32) * 5 / 9;
			
			System.out.printf("O valor de %.1fºF, convertido em Graus Celsius, fica %.1fºC", tempF, tempC);
		}
		
		if ("graus".equals(op) || "grau".equals(op)) {
			
			System.out.println("Insira o valor em Graus:");
			String a = entrada.nextLine().replace(",", ".");
			
			Double tempC = Double.parseDouble(a);
			
			double tempF = (tempC * 9 / 5 ) + 32;
			
			System.out.printf("O valor de %.1fºC, convertido em Fahrenheit, fica %.1fºF", tempC, tempF);
		}
		
		else {
			System.out.println("Não foi informado a opção correta");
		}
		
		entrada.close();
	}
}
