package fundamentos.classesEMetodos;

import java.util.Scanner;

public class Ex21DataTeste {
	
	public static void main(String[] args) {
		Ex21Data data1 = new Ex21Data();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um dia: ");
		data1.dia = entrada.nextInt();
		System.out.println("Informe um mês em número: ");
		data1.mes = entrada.nextInt();
		System.out.println("Informe um ano: ");
		data1.ano = entrada.nextInt();
		
		System.out.printf("A data que você inseriou foi : %s", data1.DataFormatada());
		
		
		entrada.close();
	}

}
