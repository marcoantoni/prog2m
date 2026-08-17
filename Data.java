class Data {

	// =========================
	// ATRIBUTOS DA CLASSE
	// =========================
	// Cada objeto do tipo Data terá seu próprio dia, mês e ano
	// Os atributos foram encapsulados com private (17 de agosto)
	private int dia;
	private int mes;
	private int ano;
	
	
	// =========================
	// MÉTODO CONSTRUTOR
	// =========================
	// O construtor é chamado automaticamente quando usamos "new Data(...)"
	// Ele serve para inicializar os atributos e validar os dados recebidos
	public Data(int dia, int mes, int ano){
		
		// como foi criado o método setMes, agora está sendo chamado esse
		// método, pois ele faz essa validação. A ideia com isso é acabar com a repetição
		// de código
		setMes(mes);
		
		// chamando o método setDia que é reposável por validar esse atributo
		// com isso, eliminamos a repetição de código e criamos um meio que 
		// permita alterar esse dado quando necessáio
		setDia(dia);
	
		// TAREFA: Crie os métodos setters para os atributos mes e ano
		
		setAno(ano);
		
	}
	
	// criando os métodos setters da classe
	public void setDia(int dia) {
		// regras de negócio para validar o atributo
		// foram movidas do método construtor para cá
		
		// criando um array para armazenar a quantidade de dias de cada mes
		// o array será utilizado para validar qual é o ultimo dia de cada mes
		int diasMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// como resolver o erro
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 12
		// at Data.<init>(Data.java:25)
		// at Data.main(Data.java:63)

		if (dia >=1 && dia <= diasMes[this.mes-1]){
			this.dia = dia;
		} else {
			System.out.printf("O dia informado é inválido \n");
			this.dia = 1; // definindo um valor padrão, para garatir que o dia nunca fique
			// 0 - que é o valor padrão para o tipo int
		}
		
	}
	
	public void setMes(int mes){
				
		if (mes >=1 && mes <= 12){
			this.mes = mes;
		} else {
			System.out.printf("O mês informado é inválido \n");
			this.mes = 1;
		}
		
	}

	public void setAno(int ano){
		// criando uma regra que impede anos anteriores a 1900
		// datas como 20/09/1845 não poderão ser representadas
		if (ano >= 1900) {
			this.ano = ano;
		} else {
			System.out.printf("O ano informado é inválido \n");
			this.ano = 2000;
		}
	}


	// criando um método para escrever abreviado
	public void escreverAbreviado() {
		System.out.printf("%d/%d/%d", dia, mes, ano);
	}
	
	// Método que retorna a data no formato "dia de mês de ano",
	// por exemplo: "15 de março de 2026".
	public String escreverPorExtenso(){

		// Inicia a String com o dia da data.
		String saida = dia + " de ";

		// Vetor contendo o nome de todos os meses do ano.
		// A posição 0 representa janeiro, a posição 1 fevereiro, e assim por diante.
		String meses[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho",
			"julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

		// Como os meses são armazenados a partir da posição 0 do vetor,
		// utilizamos (mes - 1) para acessar o nome correto do mês.
		saida = saida + meses[mes - 1] + " de " + ano;

		// Retorna a data formatada por extenso.
		return saida;
	}
	
	
}
