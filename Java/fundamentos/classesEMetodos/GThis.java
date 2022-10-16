package fundamentos.classesEMetodos;

public class GThis {
	//Criando uma cópia do Exercício de Data, podemos testar o this. e this()
	int dia;
	int mes;
	int ano;
		
	GThis(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		//só é possível chamar um construtor dentro de outro construtor como um método
		this(1, 1, 1970);
	}
	
	GThis(int dia,int mes,int ano){
		
		//Nesse caso, ao usar o this. ele referencia o dia/mes/ano atual
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
	}
	

		
		//Metódo comum
	String DataFormatada(){
		
		//Exemplo de Variável local, onde é criado e utilizado apenas no decorrer o próprio método
		String formato = "%d%d/%d";
		return String.format(formato, dia,mes,ano);
	}
}
