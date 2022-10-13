package fundamentos.controles;

import java.util.Scanner;

public class Ex11MediaNotas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double nota = -0;
		double total = 0;
		int mult = 0;
		double media = 0;
		
		while (nota != -99) {
			
			System.out.println("Informe a nota, para sair, insira '-99':");
			nota = entrada.nextDouble();

			if (nota >= 0.0 && nota <= 10.0) {
				System.out.println("Nota recebida");
				total += nota;
				nota = 0;
				mult++;
			}
			
			else if (nota == -99){
				media = total / mult;
				System.out.printf("A media do aluno é: %.2f" ,media);
			}
			
			else {
				System.out.println("Valor inválido");
				nota = 0;
			}
		}
		entrada.close();
	}
}
