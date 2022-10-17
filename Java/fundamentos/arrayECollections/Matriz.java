package fundamentos.arrayECollections;

import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe quantos alunos: ");
		int x = entrada.nextInt();
		System.out.println("Informe quantas notas irá adicionar: ");
		int y = entrada.nextInt();
		double notasDaTurma[][]= new double[x][y];
		double total=0;
		
		for(int a =0; a < notasDaTurma.length; a++) {
			
			for(int n=0; a < notasDaTurma[a].length; n++) {
			System.out.println("Informe a Nota "+(1+n)+": ");
			notasDaTurma[a][n] = entrada.nextDouble();
			total += notasDaTurma[a][n];
			}
		}
		System.out.println("A média da turma é:"+ (total/(x*y)));
			
		
		entrada.close();
	}

}
