package fundamentos.oo.relacionamentoUmParaN;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compras compra1 = new Compras();
		compra1.cliente = "Bruno";
		compra1.itens.add(new Item("Fone", 1, 39.99));
		compra1.itens.add(new Item("Capa", 2, 80));
		compra1.itens.add(new Item("Pelicula", 1, 49.99));
		
		System.out.println(compra1.itens.size());
		
		System.out.println(compra1.Total());
	}
}
