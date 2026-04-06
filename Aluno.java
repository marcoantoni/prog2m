// criação de uma classe para representar os alunos do IFRS
class Aluno {

	// declarando os atributos da classe (características do aluno)
	String nome;
	String dataNascimento;
	int curso;	// 1 = Técnico em informática, 2 = ADM, 3 = Agropecuária
	String cpf;
	
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
		
		// criando um objeto (aluno) chamado al01
		// o operador "new" instancia (cria) um novo objeto
		Aluno al01 = new Aluno();
		
		// atribuindo valores aos atributos do aluno al01
		al01.nome = "Fernando";
		al01.dataNascimento = "15/09/2009";
		al01.curso = 1;
		al01.cpf = "123.456.789-11";
		
		
		// criando um segundo objeto aluno
		Aluno al02 = new Aluno();
		
		// atribuindo valores ao segundo aluno
		al02.nome = "Vinicius";
		al02.dataNascimento = "15/11/2010";
		al02.curso = 2;
		al02.cpf = "989.653.544-12";
		
		// chamando o método para mostrar os dados do aluno al01
		al01.mostrarAluno();
		
		// chamando o método para mostrar os dados do aluno al02
		al02.mostrarAluno();
	}
}
