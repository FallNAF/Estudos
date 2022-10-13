package fundamentos.controles;

import javax.swing.JOptionPane;

public class Ex13AnaliseNumero {

	public static void main(String[] args) {
		
		String entrada = JOptionPane.showInputDialog("Informe um número:");
		int num = Integer.parseInt(entrada);
		if (num >= 0 || num <= 10) {
			JOptionPane.showMessageDialog(null, "Numero válido entre 0 e 10");

			switch (num % 2) {
			case 0:
				JOptionPane.showMessageDialog(null,"Par");
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "Impar");
			}
			
		}
	}
}
