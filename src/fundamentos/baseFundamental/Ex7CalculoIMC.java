package fundamentos.baseFundamental;

import javax.swing.JOptionPane;

import java.text.DecimalFormat; 

public class Ex7CalculoIMC {
	
	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("Informe seu peso").replace(",", ".");

		String b = JOptionPane.showInputDialog("Informe sua altura").replace(",", ".");
		
		Double pes = Double.parseDouble(a);
		Double alt = Double.parseDouble(b);
		
		Double imc = pes / (alt * 2);
		
		JOptionPane.showMessageDialog(null,
				"O seu IMC é: " + new DecimalFormat("#,##0.00").format(imc) +
				"\n MENOR QUE 18,5 : MAGREZA" +
				"\n ENTRE 18,5 E 24,9 : NORMAL" +
				"\n ENTRE 25,0 E 29,9 : SOBREPESO" +
				"\n ENTRE 30,0 E 39,9 : OBESIDADE" +
				"\n MAIOR QUE 40,0 : OBESIDADE GRAVE" );
		
	}

}
