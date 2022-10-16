package fundamentos.classesEMetodos;

public class CConstrutor2 {
	
	public static void main(String[] args) {
		
		CConstrutor p1 = new CConstrutor("Monza",5000,10);
		/*Por exemplo, ao informa o valor/String nos parenteses,
		 * ele vai realizar o comando presente no método criado anteriormente
		 */
		System.out.printf("Nome: %s\n"
				+ "Preço: R$%d\n"
				+ "Desconto em Porcentagem:%d ",p1.nome,p1.preco,p1.desconto);
	}

}
