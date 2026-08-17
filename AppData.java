class AppData {
	
	// classe apenas para fins de testar a classe Data com
	// os atributos encapsulados (private)
	
	// =========================
	// MÉTODO MAIN (TESTE)
	// Foi movido de Data.java para cá
	// =========================
	public static void main(String args[]){

		// Criando um objeto da classe Data.
		Data dtFerias = new Data(15, 11, 2026);

	
		// O que acontece ao alterar a data depois de criar ela?
		// dtFerias.dia = 15;
		
		// alterando o mes
		// dtFerias.mes = 15;
		
		// depois de colocar os atributos como private
		// tentar executar as duas linhas acima causam
		// erro de compilação

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
		
		
		// depois de encapsular os atributos, se for
		// necessário alterar algum valor, usamos
		// os métodos setters. Por exemplo: 
		// as férias iniciam em dezembro e não novembro
		
		dtFerias.setMes(12);
		
		System.out.printf("As férias de verão começãm em %s",
			dtFerias.escreverPorExtenso()
		);
	}


}
