package fundamentos.classesEMetodos;

public class Ex23Final {
	
	public static void main(String[] args) {
		/*Vai ser feito com o construtor padrão para facilitar e simplificar,
		 * visto que pode ser usar o scanner ou JOptionPane para fazer as inserções, facilitando
		 */
		
		Ex23Comida c1 = new Ex23Comida();
		c1.nome = "Arroz";
		c1.peso = 0.5;
		
		Ex23Comida c2 = new Ex23Comida();
		c2.nome = "Carne";
		c2.peso = 1;
		
		Ex23Pessoa p = new Ex23Pessoa();
		p.nome = "Fall";
		p.peso = 70;
		System.out.println(p.Comer(c1));
		System.out.println(p.Comer(c2));
	}

}
