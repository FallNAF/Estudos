package fundamentos.arrayECollections;

import java.util.Arrays;

public class Array {
	/* Um array é Estático, não é possível adicionar ou remover o tamanho dele após criá-lo
	 * embora seja possível criar um novo Array maior e passar as variáveis para o novo Array
	 * 
	 * Array é Homogeneo, onde ao informar o tipo dele(int, double, etc),
	 * todos os valores precisam ser do mesmo tipo
	 */
	public static void main(String[] args) {
		
		//o primeiro [] define que de fato, é um array, no segundo colchetes, é informado o tamanho
		double notas[] = new double[3];
		System.out.println(Arrays.toString(notas));
		
		notas[0] = 5.7; 
		notas[1] = 8; 
		notas[2] = 7.8;
		
		System.out.println(notas[1]);
		
		System.out.println(Arrays.toString(notas));
		System.out.println(notas.length);

	}

}
