package fundamentos.arrayECollections;

import java.util.Scanner;

public class Ex24Notas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe quantas notas quer dar entrada: ");
		double notas[]= new double[entrada.nextInt()];
		double soma=0;
		
		for(int nota=0; nota < notas.length; nota++) {
		System.out.println("Informe a Nota "+(1+nota)+": ");
		notas[nota] = entrada.nextDouble();
		}
		
		for(double nota:notas) {
			soma += nota;
		}
		
		System.out.println("A média é:"+ soma / notas.length);
		
		entrada.close();
	}
}
