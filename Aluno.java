// criação de uma classe para representar os alunos do IFRS
class Aluno {

	// declarando os atributos da classe (características do aluno)
	String nome;
	String dataNascimento;
	int curso;	// 1 = Técnico em informática, 2 = ADM, 3 = Agropecuária
	String cpf;
	
	/*
	 * MÉTODO CONSTRUTOR
	 * 
	 * O construtor é um método especial da classe, responsável por inicializar
	 * os objetos no momento em que são criados.
	 * 
	 * Ele possui algumas características importantes:
	 * - Tem o MESMO NOME da classe (Aluno)
	 * - Não possui tipo de retorno (nem void)
	 * - É executado automaticamente ao usar o operador "new"
	 * 
	 * Ou seja, toda vez que um objeto da classe Aluno é criado, esse método
	 * é chamado para definir os valores iniciais dos atributos.
	 */
	public Aluno (String nome, String dtNasc, int curso, String cpf) {
		
		/*
		 * USO DO THIS
		 * 
		 * 
		 * Aqui ele é usado para diferenciar:
		 * - atributo da classe (this.nome)
		 * - parâmetro do método (nome)
		 * 
		 * Sem o "this", haveria ambiguidade, pois ambos têm o mesmo nome.
		 */
		this.nome = nome;	// armazenando o parâmetro no atributo
		
		// mesmo não sendo obrigatório aqui (nomes diferentes),
		// é uma boa prática manter o padrão usando "this"
		this.dataNascimento = dtNasc;
		
		// fazendo uma validação do curso
		// só permitirá cursos com código entre 1 e 4
		// 1 - informática 2 - administração 3 - agropecuária 4 - Administração (EJA)
		if (curso >= 1 && curso <= 4){
			this.curso = curso;
		} else {
			System.out.printf("O curso é inválido \n");
		}
		
		this.cpf = cpf;
		
	}
	
	// método responsável por exibir os dados do aluno
	public void mostrarAluno(){
		
		// imprimindo o nome do aluno
		System.out.printf("Nome: %s \n", nome);
		
		// imprimindo a data de nascimento
		System.out.printf("Data de nascimento: %s \n", dataNascimento);
		
		// estrutura de decisão para verificar o curso
		if (curso == 1){
			// se o curso for 1, mostra técnico em informática
			System.out.printf("Curso: Técnico em informática \n");
		} else {
			// caso contrário, mostra outros cursos
			System.out.printf("Curso: outros \n");
		}
		
		// exibindo o CPF do aluno
		System.out.printf("CPF: %s \n", cpf);
		System.out.printf("------------------\n");
	}
	
	// método principal: ponto de entrada do programa
	public static void main(String args[]) {
		
		/*
		 * Ao criar um objeto com "new", o construtor é chamado automaticamente.
		 * 
		 * IMPORTANTE:
		 * Ao criar um construtor com parâmetros, o construtor padrão (sem parâmetros)
		 * deixa de existir. Ou seja, não é mais possível fazer:
		 * 
		 * Aluno a = new Aluno();
		 * 
		 * sem definir manualmente um construtor vazio.
		 */
		
		// criando um objeto (aluno) chamado al01
		Aluno al01 = new Aluno("Fernando", "15/09/2009", 1, "123.456.789-11");
		
		/*
		 * Antes do uso do construtor, seria necessário fazer:
		 * 
		 * al01.nome = "Fernando";
		 * al01.dataNascimento = "15/09/2009";
		 * al01.curso = 1;
		 * al01.cpf = "123.456.789-11";
		 * 
		 * Agora isso não é mais necessário, pois o construtor já faz tudo em UMA LINHA.
		 * 
		 * VANTAGEM PRÁTICA:
		 * Se tivermos 100 alunos, precisaríamos:
		 * - 400 linhas (4 atributos por aluno) sem construtor
		 * - apenas 100 linhas usando construtor
		 * 
		 * Isso reduz código, evita erros e melhora a organização.
		 */
		
		// criando um segundo objeto aluno
		Aluno al02 = new Aluno("Vinicius", "15/11/2010", 2, "989.653.544-12");
		
		// chamando o método para mostrar os dados do aluno al01
		al01.mostrarAluno();
		
		// chamando o método para mostrar os dados do aluno al02
		al02.mostrarAluno();
	}
}
