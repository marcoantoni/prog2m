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
		
		if (mes >=1 && mes <= 12){
			this.mes = mes;
		} else {
			System.out.printf("O mês informado é inválido \n");
			this.mes = 1;
		}
		
		// escrevando a validação do dia usando array
		
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
	
	// =========================
	// MÉTODO MAIN (TESTE)
	// =========================
	public static void main(String args[]){

		// Criando um objeto da classe Data.
		Data dtFerias = new Data(20, 7, 2026);

		// Nas linhas abaixo (comentadas), o método escreverAbreviado()
		// era chamado diretamente, pois ele é do tipo void, ou seja,
		// apenas exibe a informação na tela e não retorna nenhum valor.
		//
		// System.out.print("O inicio das férias será ");
		// dtFerias.escreverAbreviado();

		// Agora, como escreverPorExtenso() retorna uma String,
		// podemos utilizar o valor retornado em qualquer lugar onde
		// uma String é esperada. Neste exemplo, o retorno é passado
		// como argumento para o printf(), usando o marcador %s.
		System.out.printf("O inicio das férias será %s",
			dtFerias.escreverPorExtenso()
		);
	}
}
