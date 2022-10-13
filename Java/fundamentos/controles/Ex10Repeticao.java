package fundamentos.controles;

import javax.swing.JOptionPane;

public class Ex10Repeticao {

	public static void main(String[] args) {
		
		String entrada = "";
		//Enquanto a condição entrada for Diferente de "sair"(!), irá realizar o procedimento
		while(!entrada.equals("sair")) {
			
		entrada = JOptionPane.showInputDialog("Informe qualquer informação:").toLowerCase();
		
		JOptionPane.showMessageDialog(null, "Você disse: " + entrada);
		}
		System.out.println("você saiu");
	}
}
