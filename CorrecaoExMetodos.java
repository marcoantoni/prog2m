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
	
	// Exercicio : Crie um método chamada toFahrenheit, que recebe uma temperatura em graus Celsius, 
	// transforma em Fahrenheit e retorna esse dado. Utilize a fórmula: (°C * 9/5) + 32
	
	public float toFahrenheit(float celsius) {
		
		return (celsius * 9/5) + 32;
		
	}
	
	// Exercicio 3: Crie um método chamado calcularMedia, que recebe dois 
	// parâmetros (uma distância percorrida em km por um veículo) e a quantidade 
	// consumida de combustível, ambos do tipo double. O consumo é calculado 
	// dividindo a distância percorrida pela quantidade de combustível. 
	// O método deve retornar esse valor.
	// a média representa quantos km o veiculo faz com 1 litro de combustível
	public double calcularMedia(double distancia, double consumo) {
		
		return distancia / consumo;
	}
	

	// Método principal do programa.
	// É o ponto de entrada da aplicação e será utilizado para testar o método criado.
	public static void main(String args[]) {
		
		// Cria um objeto da classe CorrecaoExMetodos para permitir
		// a chamada do método metrosToKM.
		CorrecaoExMetodos ex = new CorrecaoExMetodos();
		
		// Chama o método passando o valor 8870 metros como argumento.
		ex.metrosToKM(8870);
		
		// no dia 22 de junho às 10:18 a temperatura está 	11,9º
		// testando o método toFahrenheit 
		
		float temperaturaConvertida = ex.toFahrenheit(11.9f);
		System.out.printf("%.2f graus celsius equivalem a %.2f graus fahrenheit \n", 
			11.9, temperaturaConvertida); 
			
		
		// testando a correção do exercício 3
		// criando variaveis auxiliares para mostrar os valores atualizados dentro do print
		double distancia = 100;
		double consumo = 11;
		
		// o método calcularMedia está sendo chamado diretamente dentro do print
		System.out.printf("O carro percorreu %.2f km com %.2f litros de combustivel e seu consumo foi %.2f \n",
			distancia, consumo, ex.calcularMedia(distancia, consumo) );
			
		
	}
}

