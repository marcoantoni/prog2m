class Autor {
	
	String nome;
	String bio;
	

	public Autor(String nome, String bio) {
		
		/*
		 * Remove os espaços em branco do início e do fim do texto
		 * utilizando o método trim().
		 * Em seguida, verifica se o nome possui mais de 5 caracteres.
		 * Caso seja válido, o nome é armazenado no atributo.
		 * Caso contrário, é exibida uma mensagem de erro e um valor
		 * padrão é atribuído ao atributo.
		 */
		if (nome.trim().length() > 5){
			this.nome = nome.trim();
		} else {
			System.out.printf("O nome é inválido\n");
			this.nome = "Não informado";
		}
		
		/*
		 * A biografia também passa por uma validação.
		 * Após remover os espaços em branco das extremidades,
		 * verifica-se se ela possui mais de 30 caracteres.
		 * Se atender ao critério, o texto é armazenado.
		 * Caso contrário, é exibida uma mensagem de erro e
		 * o atributo recebe o valor "Não informado".
		 */
		if (bio.trim().length() > 30){
			this.bio = bio.trim();
		} else {
			System.out.printf("A biografia é inválida\n");
			this.bio = "Não informado";
		}
		
	}
	
	/*
	 * Método responsável por retornar uma String contendo
	 * as informações do autor.
	 * Observe que ele não imprime os dados na tela.
	 * Em vez disso, monta e devolve uma String para que
	 * outro trecho do programa decida como utilizá-la
	 * (por exemplo, exibindo-a com System.out.println()).
	 */
	public String mostrar() {
		
		return "Autor: " + nome + "\nBiografia: " + bio;
		
	}
	
}
