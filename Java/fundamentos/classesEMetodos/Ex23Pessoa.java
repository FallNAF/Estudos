package fundamentos.classesEMetodos;

public class Ex23Pessoa {
	
	String nome;
	double peso;
	
	String Comer(Ex23Comida comida) {
		
		String a = "Peso antes de comer: " + this.peso + "\n Peso atual: " + (this.peso += comida.peso);
		return a;

	}
}
