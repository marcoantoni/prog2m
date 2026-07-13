// criação de uma classe para representar os alunos do IFRS
class Aluno {

	// declarando os atributos da classe (características do aluno)
	String nome;
	
	/*
	 * CONCEITO DE COMPOSIÇÃO ("Tem Um")
	 * * Em vez de usar um tipo primitivo ou uma String comum para a data de nascimento,
	 * usamos um objeto de outra classe ("Data"). Isso significa que a classe Aluno 
	 * é COMPOSTA por um objeto da classe Data. 
	 * * Dizemos que: "Todo Aluno TEM UMA Data de nascimento".
	 * Isso permite reutilizar a lógica da classe Data (como o método escreverPorExtenso())
	 * dentro da classe Aluno.
	 */
	Data dataNascimento; 
	
	int curso;	// 1 = Técnico em informática, 2 = ADM, 3 = Agropecuária
	String cpf;
	
	/*
	 * MÉTODO CONSTRUTOR
	 * * O construtor é um método especial da classe, responsável por inicializar
	 * os objetos no momento em que são criados.
	 * * Ele possui algumas características importantes:
	 * - Tem o MESMO NOME da classe (Aluno)
	 * - Não possui tipo de retorno (nem void)
	 * - É executado automaticamente ao usar o operador "new"
	 * * Ou seja, toda vez que um objeto da classe Aluno é criado, esse método
	 * é chamado para definir os valores iniciais dos atributos.
	 */
	public Aluno (String nome, Data dtNasc, int curso, String cpf) {
		
		/*
		 * USO DO THIS
		 * * Aqui ele é usado para diferenciar:
		 * - atributo da classe (this.nome)
		 * - parâmetro do método (nome)
		 * * Sem o "this", haveria ambiguidade, pois ambos têm o mesmo nome.
		 */
		this.nome = nome;	// armazenando o parâmetro no atributo
		
		// COMPOSIÇÃO NO CONSTRUTOR:
		// Recebemos a referência de um objeto Data (dtNasc) criado fora da classe
		// e a atribuímos ao nosso atributo interno dataNascimento.
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
		
		/*
		 * DELEGAÇÃO DE COMPORTAMENTO
		 * * Como 'dataNascimento' é um objeto da classe Data, a classe Aluno não precisa
		 * saber como formatar uma data por extenso. Ela simplesmente delega essa tarefa
		 * para o método 'escreverPorExtenso()' que pertence ao objeto Data.
		 */
		System.out.printf("Data de nascimento: %s \n", dataNascimento.escreverPorExtenso() );
		
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
		 * * IMPORTANTE:
		 * Ao criar um construtor com parâmetros, o construtor padrão (sem parâmetros)
		 * deixa de existir. Ou seja, não é mais possível fazer:
		 * * Aluno a = new Aluno();
		 * * sem definir manualmente um construtor vazio.
		 */
		 
		/*
		 * INSTANCIAÇÃO COM COMPOSIÇÃO (Abordagem 1):
		 * Primeiro criamos o objeto "Data" de forma independente na memória.
		 * Depois, passamos a referência desse objeto (dtAl01) como argumento 
		 * para o construtor do Aluno.
		 */
		Data dtAl01 = new Data(15, 9, 2009); 
		
		// criando um objeto (aluno) chamado al01
		Aluno al01 = new Aluno("Fernando", dtAl01, 1, "123.456.789-11");
		
		/*
		 * Antes do uso do construtor, seria necessário fazer:
		 * * al01.nome = "Fernando";
		 * al01.dataNascimento = "15/09/2009"; // Antes era apenas um texto solto
		 * al01.curso = 1;
		 * al01.cpf = "123.456.789-11";
		 * * Agora, além do construtor agrupar tudo em uma linha, a composição garante 
		 * que a data de nascimento seja um tipo de dado robusto e validado pela classe Data.
		 */
		
		/*
		 * INSTANCIAÇÃO COM COMPOSIÇÃO (Abordagem 2 - Objeto Anônimo):
		 * Criamos o objeto Data diretamente dentro dos parâmetros do construtor de Aluno
		 * usando `new Data(...)`. 
		 * * Essa forma é muito comum na composição quando o ciclo de vida do objeto interno 
		 * (Data) está fortemente ligado ao objeto principal (Aluno).
		 */
		Aluno al02 = new Aluno("Vinicius", new Data(15, 11, 2010), 2, "989.653.544-12");
		
		// chamando o método para mostrar os dados do aluno al01
		al01.mostrarAluno();
		
		// chamando o método para mostrar os
