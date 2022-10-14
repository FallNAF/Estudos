package fundamentos.controles;

import java.util.Scanner;

public class Ex18DoWhile {
	/*18. Criar um programa que enquanto estiver recebendo números positivos, 
	 * imprime no console a soma dos números inseridos, caso receba um número
	 * negativo,encerre o programa. Tente utilizar a estrutura do while.
	 */
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int num=0;
		int numnovo=0;
		do {
			num += numnovo;
			System.out.println("Valor do numero atual é: "+ num);
			System.out.println("Informe um número a ser somado, para sair, digite qualquer número negativo: ");
			numnovo = entrada.nextInt();
		} while(numnovo > 0);
		System.out.println("Programa Finalizado. O numero Final é: "+ num);
			
		
		
		entrada.close();
	}
}
