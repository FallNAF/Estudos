package fundamentos.arrayECollections;

public class Foreach {
	
	public static void main(String[] args) {
		
		//double notas[] = { 6.7, 5.8, 9.3, 7.0, 6.5};
		double notas[] = new double[5];
		
		/*Essa é uma das formas comuns de acessar ou realizar
		 * o loop de exibição/preenchimento do Array, porém
		 * possui um método melhor para realizar esse procedimento
		 */
		for (int i = 0; i < notas.length;i++) {
			System.out.print(notas[i] + " ");
		}
		
		System.out.println();
		
		for(double nota: notas) {
			System.out.println(nota);
		}
		/*No exemplo acima, ele realiza o mesmo procedimento
		 * do for comum, porém simplificando
		 */
		
	}

}
