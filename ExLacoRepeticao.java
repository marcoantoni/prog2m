import java.util.Scanner;	// import para fazer a leitura do teclado

class ExLacoRepeticao{
	
	public static void main (String args[]) {
		
		// =========================
		// EXEMPLO DE LAÇO FOR
		// =========================
		// O laço for é utilizado quando sabemos exatamente
		// quantas vezes queremos repetir uma ação.
		
		// Estrutura do for:
		// 1) Inicialização da variável de controle (int i = 0)
		// 2) Condição de execução (i < 10)
		// 3) Incremento (i++) - ao fazer i=i+2, estamos pulando de 2 em 2
		for (int i=0; i<10; i++){
			System.out.printf("Executando o laço for pela %d vez \n", i);
		}
		
		// =========================
		// EXEMPLO DE LAÇO WHILE
		// =========================
		// O laço while é utilizado quando NÃO sabemos exatamente
		// quantas vezes a repetição irá acontecer.
		
		boolean deveExecutar = false;	// variavel para controlar o laço
		
		while (deveExecutar == true) {
			System.out.printf("Executando o laço while \n");
		}
		
		// =========================
		// MENU COM ENTRADA DO USUÁRIO
		// =========================
		// Exemplo de laço que continua executando até o usuário escolher sair (0)
		
		int opcao = 1;	// variavel para ler a entrada do usuário
		
		Scanner sc = new Scanner(System.in);	// criando a variavel necessário para ler do teclado
		
		// O laço continua enquanto a opção escolhida for diferente de 0
		while (opcao != 0){
			System.out.printf("----------- MENU -----------\n");
			System.out.printf("1 - Adicionar aluno \n");
			System.out.printf("2 - Editar aluno \n");
			System.out.printf("3 - Excluir aluno \n");
			System.out.printf("0 - SAIR \n");
			System.out.printf("Qual opção você deseja? ");
			
			// lendo a opção do teclado
			opcao = sc.nextInt();
			
		}
		
		sc.nextLine();	// necessário limpar o buffer do teclado após ler um inteiro, para não
		// pular a leitura de uma string
		
		// Criando um laço de repetição que lê uma string (nome), e continua executando até que o usuário
		// escreva "sair"
		
		String nome = "";	// criando a variavel que armazenará a leitura do teclado
		
		// Enquanto o valor digitado for diferente de "sair", o laço continua
		// A linha abaixo poderia ser escrita assim: while (!nome.equals("sair") )
		while (nome.equals("sair") != true){
			System.out.printf("Informe seu nome ou escreva sair para parar a leitura \n");
			
			nome = sc.nextLine();	// lendo a string do teclado
		
		}
	}
}
