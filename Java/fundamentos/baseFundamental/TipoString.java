package fundamentos.baseFundamental;

public class TipoString {
	
	public static void main(String[] args) {
	
	String a = "Boa tarde";
	System.out.println(a.concat("!!!"));
	
	String nome = "Bruno";
	String sobrenome = "Damasceno";
	int idade = 20;
	double salario = 998.34;
	//printf: %s substitui strings; %d substitui inteiros; %f substitui float
	System.out.printf("X %s %s, possuindo %d anos, ganha um salario de R$ %.2f Reais", nome, sobrenome, idade, salario);
	}
	
}
