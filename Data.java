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
		
		// escrevando a validação do dia usando array
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
	
	// criando um método para escrever abreviado
	public void escreverAbreviado() {
		System.out.printf("%d/%d/%d", dia, mes, ano);
	}
	
	// =========================
	// MÉTODO MAIN (TESTE)
	// =========================
	public static void main(String args[]){

		// Criando um objeto com um dia inválido (-18)
		// Isso serve para testar a validação do construtor
		Data dtAvaliacao = new Data(-18, 15, 2026);

		System.out.print("A avaliação será no dia ");

		// Chamando o método para exibir a data formatada
		dtAvaliacao.escreverAbreviado();
	}
}
