// Código para fazer declaração de variaveis e leitura do teclado

// para fazer um input, é necessário a linha abaixo
import java.util.Scanner;

class ExLeituraTeclado {
	
	/* Essa é a função principal do programa em Java
	 * Os comentários multi linha são abertos por "/" seguido por "*"
	 * A função main é necessário para que o código possa ser Executado
	 * Se ela não existir, o código poderá compilar, mas não poderá ser executado
	 * O caractere "*" seguido por "/" encerra o comentário
	 */
	public static void main (String args[]) {
		
		// criando a variavel auxiliar para poder ler do teclado
		// essa variavel será do tipo Scanner e ela permitirá acessar a função
		// que permitirá ler os dados do teclado
		// a variavel terá o nome de "sc", pois é uma abreviação de "Scanner"
		
		Scanner sc = new Scanner(System.in); 
		
		// print para mostrar uma mensagem 
		System.out.printf("Diga seu nome \n");
		String nome = sc.nextLine();	// lendo uma string do teclado
		
		System.out.printf("Diga sua idade \n");
		int idade = sc.nextInt();	// lendo um int do teclado
		
		System.out.printf("Diga sua altura");
		float altura = sc.nextFloat();
		
		
		// declarando variaiveis
		//String nome = "Augusto";	// variavel do tipo string
		//int idade = 16;				// variavel do tipo int
		//float altura = 1.76f;		// variavel do tipo float
		boolean doadorDeOrgaos = true;	// variavel do tipo boolean. true indica que é doador de órgãos e false que não é

		// imprimindo os dados na tela
		System.out.printf("Nome: %s \n", nome);
		System.out.printf("Idade: %d \n", idade);
		System.out.printf("Altura: %f \n", altura);
		System.out.printf("Doador de órgãos %s \n", doadorDeOrgaos);
		
	}

}
