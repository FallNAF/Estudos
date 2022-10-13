package fundamentos.baseFundamental;

public class Wrappers {

	public static void main(String[] args) {
		/*Wrappers é uma classe/objeto que permite alterações e manipulações,
		 substituindo os tipos primitivos(int,byte,long,short,char, etc...)
		 possuindo seus equivalentes com a primeira letra Maiuscula: Integer, Boolean, Short, Long, Byte, Character, Double, Float
		*/
		Integer a = 13; //Integer ou int(precisa de maiusculo na primeira letra
		Short b = 1000;
		Long c = 1000000L;
		Byte d = 100;
			
		Float e = 123.60F;
		Double f = 142523.1445;
		
		System.out.println(a);
		
		System.out.println(++a);
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
	}
}
