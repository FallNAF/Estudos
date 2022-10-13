package fundamentos.baseFundamental;

import java.util.Scanner;

public class Ex8bhaskara {

	public static void main(String[] args) {

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor de a: ");
		Double a = entrada.nextDouble();
		
		System.out.println("Informe o valor de b: ");
		Double b = entrada.nextDouble();
		
		System.out.println("Informe o valor de c: ");
		Double c = entrada.nextDouble();
		
		double delta = (b*2) - 4 * a * c;
		
		System.out.println(delta);
		
		double x = (-b + (Math.sqrt(delta))) / (2*a);
		double y = (-b - (Math.sqrt(delta))) / (2*a);
		
		System.out.println(x);
		System.out.println(y);

		
		
		//x = (a *(x * 2)) + (b * x) + c;
		
		entrada.close();
	}
}
