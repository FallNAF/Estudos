package fundamentos.classesEMetodos;

public class DMembroDeClasseEInstancia {
	
	/* Nesse caso, por colocar static, o valor da variavel/atributo
	 * está associado a classe em si, sendo fixo
	 */
	final static double pi = 3.14;
	//Para tornar a variável uma constante, precisa colocar o final
	
	
	
	/* Não tornando a variavel estática, cada valor pertence a cada instancia que for criada
	 * como:
	 * MembroDeClasseEInstancia instancia1 = new MembroDeClasseEInstancia();
	 * nessa caso, vai criar-se um espaço para essas variáveis raio e area, podendo ser acessado com ponto
	 * 
	 * contudo, para o static o valor do atributo/variável é fixo pela classe.
	 */
	double raio;
	
	double area() {
		
		return pi*(raio*raio);
	}

}
