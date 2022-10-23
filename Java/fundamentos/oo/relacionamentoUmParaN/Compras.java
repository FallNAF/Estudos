package fundamentos.oo.relacionamentoUmParaN;

import java.util.ArrayList;

public class Compras {
	
	
	String cliente;
	ArrayList<Item> itens = new ArrayList<>();
	//Nesse exemplo, seria a relação um para N, uma compra possui varios itens
	
	double Total() {
		double soma=0;
		for(Item item: itens) {
			soma += item.quantidade * item.preco;
		}
		return soma;
	}
	
	
}
