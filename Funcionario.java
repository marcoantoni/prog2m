class Funcionario {
	// declarando os atributos, conforme solicitado no enunciado
	String nome;
	String cargo;
	float salario;
	String cpf;

	// Crie um método para mostrar os atributos da classe 
	// (nome, cargo, salario e cpf).
	public void mostrar() {
		System.out.printf("Exibindo o funcionário \n");
	
		// validando se o nome foi preenchido
		// anteriormente essa validação era importante, pois o atributo
		// poderia não ter sido inicializado e permanecer com valor null.
		// Porém, agora o construtor sempre atribui um valor ao atributo nome,
		// mesmo quando o valor informado é inválido.
		// Assim, na prática, essa condição nunca será falsa.
		if (nome != null)
			System.out.printf("Nome: %s \n", nome);
		else
			System.out.printf("Nome: Não foi informado corretamente \n");
			
		// exibindo o cargo do funcionário
		System.out.printf("Cargo: %s \n", cargo);

		// exibindo cpf e salário formatado com duas casas decimais
		System.out.printf("CPF: %s      Salário: R$ %.2f \n",
			cpf, salario);
	}
	
	// criando o método construtor da classe
	// é necessário receber todos os parametros, pois eles são obrigatório
	public Funcionario (String nome, String cargo, float salario, String cpf) {

		// validando o nome
		// trim() remove espaços em branco no início e no final da String
		// length() retorna a quantidade de caracteres
		if (nome.trim().length() >=5 ){

			// this.nome representa o atributo da classe
			// nome representa o parâmetro recebido no construtor
			this.nome = nome; 	// inicializa o atributo nome

		} else {

			// exibindo mensagem de erro caso o nome seja inválido
			System.out.printf("Nome inválido \n");

			// inicializando o atributo com um valor padrão
			this.nome = "Não informado - inicializado no método construtor";
		}
		
		// validando o cargo
		if (cargo.trim().length() >=5) {

			// inicializando o cargo com o valor recebido
			this.cargo = cargo;

		} else {

			// caso o cargo seja inválido
			System.out.printf("Cargo inválido \n");

			// definindo um valor padrão
			this.cargo = "Assistente em administração";
		}
		
		// validando o salário
		if (salario >= 1621f){

			// armazenando o salário informado
			this.salario = salario;

		} else {

			// caso o salário seja menor que o valor mínimo
			System.out.printf("Salário inválido. Definindo ele como R$ 1621,00 \n");

			// atribuindo o salário mínimo
			this.salario = 1621f;
		}
		
		// cpf não tem nenhuma validação
		// apenas armazenando o valor recebido
		this.cpf = cpf;		
	}
	
	// criando o método main para testar o código desenvolvido
	// (criar novos funcionários)

	public static void main (String args[]) {
		
		// criando um objeto da classe Funcionario
		Funcionario f1 = new Funcionario("Miguel", "Jogador de e-sports", 500f, "122.345.556-69"); 
	
		// exibindo os dados cadastrais
		f1.mostrar();
		
		// criando outro funcionário com alguns dados inválidos
		Funcionario f2 = new Funcionario("Zé", "adm", 3435.76f, "098.123.564-45");

		// exibindo os dados do segundo funcionário
		f2.mostrar();
	
	}

}
