package fundamentos.baseFundamental;

import java.util.Scanner;

public class Scann {

	public static void main(String[] args) {
		// É necessário importar o Scanner

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite seu nome:");
		String nome = entrada.nextLine();

		System.out.println("Digite seu sobrenome:");
		String sobrenome = entrada.nextLine();

		System.out.println("Seu nome é:" + nome + " " + sobrenome);

		System.out.println("Digite sua idade:");
		int idade = entrada.nextInt();

		System.out.println("Sua idade é: " + idade);

		entrada.close();
	}

}
