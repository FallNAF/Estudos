package fundamentos.controles;

import javax.swing.JOptionPane;

public class Ex20ExibeNumeroMaior {
	/*20. Crie um programa que recebe 10 valores
	 *  e ao final imprima o maior número.
	 */
	
	public static void main(String[] args) {
		
		String entrada;
		int num=0;
		int numnovo=0;
		JOptionPane.showMessageDialog(null, "Você vai informar 10 números, e, no final, vai ser exibido o maior numero dos que informou.");
		for(int i=10;i>0;i--) {
			entrada = JOptionPane.showInputDialog("Informe Um número,você pode adicionar mais "+i+" numeros:");
			numnovo = Integer.parseInt(entrada);
			if(numnovo > num) {
				num=numnovo;
			}
			numnovo = 0;
		}
		JOptionPane.showMessageDialog(null, "O maior número digitado foi o: "+ num);
		
	}
}
