package fundamentos.controles;

import javax.swing.JOptionPane;

public class Ex14AnoBissexto {

	public static void main(String[] args) {
		
		String entrada = JOptionPane.showInputDialog("Informe um ano Depois de Cristo:");
		Integer ano = Integer.parseInt(entrada);
		boolean bissexto = ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0);
		
		if(bissexto) JOptionPane.showMessageDialog(null, "É Bissexto");
		
		else JOptionPane.showMessageDialog(null,"Não é Bissexto");
		

		}
		
	}

