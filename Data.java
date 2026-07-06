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
	
	// =========================
	// MÉTODO MAIN (TESTE)
	// =========================
	public static void main(String args[]){

		// Criando um objeto com um dia inválido (-18)
		// Isso serve para testar a validação do construtor
		Data dtAvaliacao = new Data(31, 14, 2026);

		System.out.print("A avaliação será no dia ");

		// Chamando o método para exibir a data formatada
		dtAvaliacao.escreverAbreviado();
	}
}
