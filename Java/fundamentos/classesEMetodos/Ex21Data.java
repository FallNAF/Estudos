package fundamentos.classesEMetodos;

public class Ex21Data {
	int dia;
	int mes;
	int ano;
	
		//criado um novo Construtor, perdendo o padrão. Variáveis diferentes para não conflitar
		Ex21Data(int dianovo,int mesnovo,int anonovo){
			dia = dianovo;
			mes = mesnovo;
			ano = anonovo;
		}
	
		//Construtor padrão criado explicitamente
		Ex21Data(){
			dia = 1;
			mes = 1;
			ano = 1970;
		}
		
		//Metódo comum
	String DataFormatada(){
		
		//return String.format("%d%d/%d", dia,mes,ano);
		return dia+"/"+mes+"/"+ano;
	}

}
