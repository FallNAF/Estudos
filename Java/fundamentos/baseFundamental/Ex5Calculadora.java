package fundamentos.baseFundamental;

import javax.swing.JOptionPane;

public class Ex5Calculadora {
	
public static void main(String[] args) {
	
	
	String a = JOptionPane.showInputDialog("Digite o primeiro número:").replace(",", ".");
	
	String b = JOptionPane.showInputDialog("Digite o segundo número:").replace(",", ".");
	
	String op = JOptionPane.showInputDialog("Digite o Operador: + - * / % ").trim();

	Double num1 = Double.parseDouble(a);
	Double num2 = Double.parseDouble(b);
	
	double res = "%".equals(op) ? num1 % num2 : 0;
	res = "-".equals(op) ? num1 - num2 : res;
	res = "+".equals(op) ? num1 + num2 : res;
	res = "*".equals(op) ? num1 * num2 : res;
	res = "/".equals(op) ? num1 / num2 : res;
	
	JOptionPane.showMessageDialog(null, "O resultado da operação é: " + res);
	
}

}
