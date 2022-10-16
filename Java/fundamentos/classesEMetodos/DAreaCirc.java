package fundamentos.classesEMetodos;

import java.util.Scanner;

public class DAreaCirc {
	
	public static void main(String[] args) {
		DMembroDeClasseEInstancia t1 = new DMembroDeClasseEInstancia();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o raio da circunferência: ");
		t1.raio = entrada.nextDouble();
		
		System.out.printf("A área do Circulo é: %.2f", t1.area());
	
		entrada.close();
	}

}
