package fundamentos.controles;

import java.util.Scanner;

public class Ex19DestrinchandoLetra {
	/*19.Criar um programa que receba uma palavra
	 *  e imprime no console letra por letra.
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numpalavra = 0;
		
			System.out.println("Informe uma Palavra:");
			String palavra = entrada.next();
			//System.out.println("abcde".substring(numpalavra));
			//System.out.println("abcde".indexOf(1));
			while(numpalavra != palavra.length()){
				System.out.println(palavra.substring(numpalavra, numpalavra+1));
				numpalavra++;
			}
			
			
			
		//} while (numpalavra == num.lenght())
		
		
		entrada.close();
	}
}
