package fundamentos.operadores;

public class Ex3OperadoresArit {
	
	public static void main(String[] args) {
		
		int a = (6 * (3+2));
		
		int b = (int) Math.pow(a, 2);
		
		int c = b / (3*2);
		
		int x = (int) Math.pow(((1-5)*(2-7)/2), 2);
		
		int y = (int) Math.pow((c - x), 3);
		
		int z = (int) Math.pow(10, 3);
		
		System.out.println(y / z);
		
		
		
	}

}
