package fundamentos.operadores;

public class Ex4OperadoresLogi {

	public static void main(String[] args) {
		/*Se 2 forem true = TV 50pl + sorvete
		  Se 1 for true = TV 32pl + sorvete
		  Se 2 forem false = sem nada/shopping
		*/
		boolean tr1 = false;
		boolean tr2 = false;
		
		if (tr1 || tr2) {
			System.out.println("Tomou sorvete");
			
		if (tr1 && tr2) {
			System.out.println("Comprou TV 50pl");  }
		
		else if (tr1 ^ tr2) {
			System.out.println("Comprou TV 32pl");  }
		
		}
		
		else{
			System.out.println("Sem TV e sorvete");  }
		
	}
}
