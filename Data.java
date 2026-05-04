class Data {

	// =========================
	// ATRIBUTOS DA CLASSE
	// =========================
	// Cada objeto do tipo Data terá seu próprio dia, mês e ano
	int dia;
	int mes;
	int ano;
	
	
	// =========================
	// MÉTODO CONSTRUTOR
	// =========================
	// O construtor é chamado automaticamente quando usamos "new Data(...)"
	// Ele serve para inicializar os atributos e validar os dados recebidos
	public Data(int dia, int mes, int ano){

		// =========================
		// VALIDAÇÃO DO DIA
		// =========================
		// Neste exemplo simplificado, todos os meses terão 30 dias
		if (dia >= 1 && dia <= 30){
			// "this.dia" refere-se ao atributo da classe
			// "dia" é o parâmetro recebido no construtor
			this.dia = dia;
		} else {
			System.out.println("Dia inválido!");
			
			// Define um valor padrão para evitar ficar com 0
			this.dia = 1;
		}

		
		// =========================
		// VALIDAÇÃO DO MÊS
		// =========================
		if (mes >= 1 && mes <= 12){
			this.mes = mes;
		} else {
			System.out.println("Mês inválido!");
			this.mes = 1;
		}

		
		// =========================
		// VALIDAÇÃO DO ANO
		// =========================
		// Consideramos válidos apenas anos a partir de 1900
		if (ano >= 1900){
			this.ano = ano;
		} else {
			System.out.println("Ano inválido!");
			this.ano = 2000;
		}
	}
	
	
	// =========================
	// MÉTODO PARA EXIBIR A DATA POR EXTENSO
	// =========================
	public void escreverPorExtenso(){

		// Array: estrutura que armazena vários valores do mesmo tipo em uma única variável.
		// Aqui o array já é criado e inicializado com os nomes dos meses.
		// Cada valor é acessado por um índice (posição), que no Java começa em 0.
		// O índice 0 foi deixado como "" (vazio) de propósito,
		// para que o número do mês corresponda diretamente ao índice:
		// meses[1] = "janeiro", meses[2] = "fevereiro", ..., meses[12] = "dezembro".
		String meses[] = {
			"", "janeiro", "fevereiro", "março",
			"abril", "maio", "junho", "julho",
			"agosto", "setembro", "outubro",
			"novembro", "dezembro"
		};

		// Exibe a data no formato: "dia de mês de ano"
		// Exemplo: 10 de maio de 2026
		System.out.printf("%d de %s de %d\n", dia, meses[mes], ano);
	}
	
	
	// =========================
	// MÉTODO MAIN (TESTE)
	// =========================
	public static void main(String args[]){

		// Criando um objeto com um dia inválido (-18)
		// Isso serve para testar a validação do construtor
		Data dtAvaliacao = new Data(-18, 5, 2026);

		System.out.print("A avaliação será no dia ");

		// Chamando o método para exibir a data formatada
		dtAvaliacao.escreverPorExtenso();
	}
}
