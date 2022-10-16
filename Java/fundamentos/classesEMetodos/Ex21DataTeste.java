package fundamentos.classesEMetodos;

import java.util.Scanner;

public class Ex21DataTeste {
	
	public static void main(String[] args) {
		Ex21Data data0 = new Ex21Data();
		System.out.println("Data padrão do sistema: "+ data0.DataFormatada());
		
		
		
		
			Ex21Data data1 = new Ex21Data(1,9,2001);
			System.out.printf("Data inserida via construtor: %s \n", data1.DataFormatada());
		
			
			
			
				Ex21Data data2 = new Ex21Data();
				Scanner entrada = new Scanner(System.in);
				System.out.println("Informe um dia: ");
				data2.dia = entrada.nextInt();
				System.out.println("Informe um mês em número: ");
				data2.mes = entrada.nextInt();
				System.out.println("Informe um ano: ");
				data2.ano = entrada.nextInt();
				System.out.printf("A data que você inseriu foi : %s", data2.DataFormatada());
		
		
		entrada.close();
	}

}
