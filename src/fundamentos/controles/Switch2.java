package fundamentos.controles;

import javax.swing.JOptionPane;

public class Switch2 {
	
	public static void main(String[] args) {
		 String entrada = JOptionPane.showInputDialog("Informe a Nota:");
		 int nota = Integer.parseInt(entrada);
		 switch(nota) {
		 case 10: case 9:
			 JOptionPane.showMessageDialog(null, "Nota: A");
			 break;
		 case 8: case 7:
			 JOptionPane.showMessageDialog(null, "Nota: B");
			 break;
		 case 6:
			 JOptionPane.showMessageDialog(null, "Nota: C");
			 break;
		 case 5: case 4: case 3: case 2: case 1: case 0:
			 JOptionPane.showMessageDialog(null, "Não Aprovado");
			 break;
		 default:
			 JOptionPane.showMessageDialog(null, "Nota Inválida");		 
		 }
	}

}
