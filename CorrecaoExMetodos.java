class CorrecaoExMetodos {
	
	// Exercicio 1: Crie um método chamado metrosToKM, que recebe um número 
	//inteiro representando uma distância em metros, a transforma em km e 
	// escreva na tela esse valor. 
	
	public void metrosToKM(int metros) {
		
		// Realiza a conversão de metros para quilômetros.
		// O uso de 1000f garante que a divisão seja feita com ponto flutuante.
		// Isso garantira que 8870 / 1000 seja "8.87" e não "8"
		float distanciaEmKm = metros / 1000f;
		
		// Exibe na tela a distância original em metros e o valor convertido
		// para quilômetros com duas casas decimais.
		System.out.printf("%d metros equivale a %.2f KM \n", metros, distanciaEmKm);
	}

	// Método principal do programa.
	// É o ponto de entrada da aplicação e será utilizado para testar o método criado.
	public static void main(String args[]) {
		
		// Cria um objeto da classe CorrecaoExMetodos para permitir
		// a chamada do método metrosToKM.
		CorrecaoExMetodos ex = new CorrecaoExMetodos();
		
		// Chama o método passando o valor 8870 metros como argumento.
		ex.metrosToKM(8870);
	}
}

class CorrecaoExMetodos {
 

	public void metrosToKM(int metros) {
		float distanciaEmKm = metros / 1000f;
		
		System.out.printf("%d metros equivale a %.2f KM \n", metros, distanciaEmKm);
	}

	// criando o método main para testar
	public static void main (String args[]) {
		
		CorrecaoExMetodos ex = new CorrecaoExMetodos();
		
		// chamando o método metrosToKM
		ex.metrosToKM(8870); 
		
	}
}
