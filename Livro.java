class Livro {
	
	// atributos da classe
	String titulo;
	
	/*
	 * COMPOSIÇÃO
	 * Um livro possui um autor. Em vez de armazenar apenas o nome do autor
	 * em uma String, utilizamos um objeto da classe Autor.
	 * Dessa forma, um objeto Livro passa a ser composto por outro objeto,
	 * reaproveitando todos os atributos (nome e biografia) e métodos da classe Autor (mostrar).
	 */
	Autor autor;
	
	int nPaginas;
	String genero;
	
	/*
	 * Método construtor da classe.
	 * Além de inicializar os atributos, também realiza validações
	 * para garantir que os dados informados sejam válidos.
	 */
	public Livro(String titulo, Autor autor, int nPaginas, String genero) {
		
		// verifica se o título possui mais de 5 caracteres
		if (titulo.trim().length() > 5){
			this.titulo = titulo.trim();
		} else {
			System.out.printf("O titulo é inválido\n");
			this.titulo = "Não informado";
		}
		
		/*
		 * Recebe um objeto da classe Autor e o associa ao livro.
		 * Observe que não criamos um novo autor aqui.
		 * Apenas armazenamos a referência para o objeto recebido.
		 */
		this.autor = autor;
		
		// verifica se o número de páginas é válido
		if (nPaginas > 0){
			this.nPaginas = nPaginas;
		} else {
			System.out.printf("Número de página é inválido\n");
		}
		
		// verifica se o gênero possui mais de 5 caracteres
		if (genero.trim().length() > 5){
			this.genero = genero.trim();
		} else {
			System.out.printf("O gênero é inválido\n");
			this.genero = "Não informado";
		}
		
	}
	
	/*
	 * Retorna uma String contendo todas as informações do livro.
	 *
	 * Como o atributo autor é um objeto da classe Autor, podemos
	 * reutilizar os métodos dessa classe normalmente.
	 *
	 * Ao executar autor.mostrar(), estamos chamando o método mostrar()
	 * do objeto Autor armazenado dentro do Livro.
	 * Assim, não é necessário escrever novamente o código responsável
	 * por exibir os dados do autor, evitando duplicação e promovendo
	 * o reaproveitamento de código.
	 */
	public String mostrarLivro() {
		
		return "Título: " + titulo +
			   "\nGênero: " + genero +
			   "\nNúmero de páginas: " + nPaginas +
			   "\n" + autor.mostrar() +
			   "\n-----------";
		
	}
	
	public static void main(String args[]) {
		
		/*
		 * Criação de um objeto Autor.
		 * Esse objeto poderá ser utilizado por um ou mais livros.
		 */
		Autor a1 = new Autor(
			"George R. Martin",
			"George R.R. Martin (nascido em 1948 em Nova Jersey) é um autor e roteirista norte-americano. Mundialmente famoso pela série de livros épicos As Crônicas de Gelo e Fogo, que deu origem à aclamada adaptação televisiva Game of Thrones da HBO. Seu sucesso revolucionou a literatura de fantasia sombria e realista."
		);
		
		/*
		 * Ao criar o livro, passamos o objeto Autor como parâmetro.
		 * Isso caracteriza a composição: o objeto Livro passa a possuir
		 * um objeto Autor em sua estrutura.
		 */
		Livro livro1 = new Livro("As Crônicas de Gelo e Fogo", a1,	763, "Ficção/Fantasia");
		
		// exibe todas as informações do livro e do autor
		System.out.printf("%s", livro1.mostrarLivro());
		
	}
}
