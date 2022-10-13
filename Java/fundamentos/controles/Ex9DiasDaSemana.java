package fundamentos.controles;

import javax.swing.JOptionPane;

public class Ex9DiasDaSemana {

	public static void main(String[] args) {
	
		String dia = JOptionPane.showInputDialog("Informe um dia da semana").toLowerCase();
		
		if ("domingo".equals(dia)) {
			System.out.println("1");
		}
		else if ("segunda".equals(dia)) {
			System.out.println("2");
		}
		else if ("terça".equals(dia) || "terca".equals(dia)) {
			System.out.println("3");
		}
		else if ("quarta".equals(dia)) {
			System.out.println("4");
		}
		else if ("quinta".equals(dia)) {
			System.out.println("5");
		}
		else if ("sexta".equals(dia)) {
			System.out.println("6");
		}
		else if ("sabado".equals(dia) || "sábado".equals(dia)) {
			System.out.println("7");
		}
		else {
			System.out.println("Invalido");
		}
		
		
	}
}
