package fundamentos.arrayECollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuario = new HashMap<>();
		
		usuario.put(1, "Carlos"); //.put é usado para adicionar, diferente de .add
		usuario.put(1, "Bruno"); //Nesse exemplo, ele está alterando
		System.out.println(usuario);
		
		usuario.put(2, "Ana");
		usuario.put(3, "Fall");
		usuario.put(20, "João");
		
		System.out.println(usuario.keySet());
		System.out.println(usuario.containsKey(20)); //Agora possui filtro para o ID/chave
		System.out.println(usuario.containsValue("Ana")); //Semelhante, verificando pelo dado
		
		System.out.println(usuario.get(1));
		
		System.out.println("-".repeat(30));
		
		for(int id: usuario.keySet()) {
			System.out.println(id);	
		}
			
		for (String valor: usuario.values()) {
			System.out.println(valor);
		}
		
		System.out.println("-".repeat(30));
		
		for(Entry<Integer, String> registro: usuario.entrySet()) {//Esse procedimento realiza o mesmo dos 2 for acima
			System.out.print(registro.getKey() + " ==> ");
			System.out.println(registro.getValue());
		}
		
	}
}
