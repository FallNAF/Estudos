package fundamentos.conversoes;

import javax.swing.JOptionPane;

public class ConversoesStringENumeros {

	public static void main(String[] args) {
		
		//Para conversão de Numero para String, é usado o .toString , sendo só aceito em um Integer
		
		Integer a = 123;
		System.out.println(a.toString().length());
		
		int b = 1456;
		System.out.println(Integer.toString(b).length()); //exemplo de conversão diretamente no System

		/*para conversão de String para Numeros, porém é variável de acordo com o que deseja
		Double.parseDouble(variável a ser alterada)  para mudar para Double
		Integer.parseInt
		*/
		
		String valor1 = JOptionPane.showInputDialog("Digite o Primeiro número");
	
		String valor2 = JOptionPane.showInputDialog("Digite o Segundo número");
		
		System.out.println(valor1 + valor2); //Nesse caso, por ser 2 String, ele vai concatenar, unir
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double soma = numero1 + numero2;
		
		System.out.println("A soma é:" + soma);
		
		System.out.println("A média é" + soma / 2);
		
	}
	
}
