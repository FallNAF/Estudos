package fundamentos.controles;

import javax.swing.JOptionPane;

public class DoWhile {

	public static void main(String[] args) {
		
		String entrada = "";
		//Faça {} até (condição)
		//do {} while (condição)
		do {			
		entrada = JOptionPane.showInputDialog("Informe qualquer informação:").toLowerCase();
		
		JOptionPane.showMessageDialog(null, "Você disse: " + entrada);
		} while(!entrada.equals("sair"));
		
		System.out.println("você saiu");
	}
}
