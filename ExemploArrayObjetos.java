class ExemploArrayObjetos {

	public static void main(String args[]) {

		// Cria um array com capacidade para armazenar até 5 objetos do tipo Aluno.
		// Neste momento, todas as posições do array possuem o valor null,
		// pois nenhum objeto foi criado ou associado a elas ainda.
		Aluno turma[] = new Aluno[5];

		// Cria um objeto Data que será utilizado como data de nascimento
		// do primeiro aluno.
		Data dtAl01 = new Data(15, 9, 2009);

		// Cria um objeto do tipo Aluno e armazena sua referência
		// na variável aluno01.
		Aluno aluno01 = new Aluno("Fernando", dtAl01, 1, "123.456.789-11");

		// Também é possível criar outros objetos normalmente,
		// armazenando cada um em uma variável.
		Aluno aluno02 = new Aluno("Manuela", new Data(8, 10, 2009), 1, "012.345.540-59");

		Aluno aluno03 = new Aluno("Rael", new Data(5, 1, 2010), 1, "989.653.544-12");

		// Armazena as referências dos objetos Aluno dentro do array.
		// O array não copia os objetos; ele apenas guarda a referência ("link")
		// para cada objeto criado.
		turma[0] = aluno01;
		turma[1] = aluno02;
		turma[2] = aluno03;

		// Também é possível criar o objeto diretamente na posição do array,
		// sem utilizar uma variável intermediária.
		turma[3] = new Aluno("Arthur", new Data(12, 8, 2008), 1, "213.123.659-69");

		// Acessando o objeto armazenado na posição 0 do array e exibindo
		// o valor do atributo nome.
		System.out.printf("O aluno que está na posição 0 do array é: %s \n",
				turma[0].nome);

		// Percorre todas as posições do array utilizando o atributo length,
		// que informa automaticamente o tamanho do vetor.
		for (int i = 0; i < turma.length; i++) {

			// Como o array possui 5 posições, mas apenas 4 receberam objetos,
			// algumas posições continuam com o valor null.
			//
			// Antes de acessar um atributo ou método de um objeto,
			// é necessário verificar se a posição realmente contém uma
			// referência válida. Caso contrário, ocorrerá um
			// NullPointerException.
			if (turma[i] != null) {

				// Acessa o atributo nome do objeto armazenado na posição i.
				System.out.printf("Nome: %s \n", turma[i].nome);

				// Exemplo de decisão baseada no valor do atributo curso.
				if (turma[i].curso == 1) {
					System.out.printf("Curso: Técnico em Informática \n");
				} else {
					System.out.printf("Curso: Outro \n");
				}
			}
		}
	}
}
