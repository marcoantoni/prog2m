// Código para fazer declaração de variaveis e leitura do teclado

class ExLeituraTeclado {
	
	/* Essa é a função principal do programa em Java
	 * Os comentários multi linha são abertos por "/" seguido por "*"
	 * A função main é necessário para que o código possa ser Executado
	 * Se ela não existir, o código poderá compilar, mas não poderá ser executado
	 * O caractere "*" seguido por "/" encerra o comentário
	 */
	public static void main (String args[]) {
		// declarando variaiveis
		String nome = "Augusto";	// variavel do tipo string
		int idade = 16;				// variavel do tipo int
		float altura = 1.76f;		// variavel do tipo float
		boolean doadorDeOrgaos = true;	// variavel do tipo boolean. true indica que é doador de órgãos e false que não é

		// imprimindo os dados na tela
		System.out.printf("Nome: %s \n", nome);
		System.out.printf("Idade: %d \n", idade);
		System.out.printf("Altura: %f \n", altura);
		System.out.printf("Doador de órgãos %s \n", doadorDeOrgaos);
		
	}

}
