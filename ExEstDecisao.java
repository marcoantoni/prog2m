class ExEstDecisao{
	
	public static void main (String args[]) {
		
		// Criação de uma variável inteira chamada idade
		// Ela recebe o valor 19
		int idade = 19;
		
		// Estrutura de decisão simples
		// O if verifica se uma condição é verdadeira ou falsa
		// Estrutura: if (condição) { comandos }
		// A condição é formada por:
		// variável + operador de comparação + valor de referência
		
		if (idade >= 18){  // verifica se idade é maior ou igual a 18
			System.out.printf("É maior de idade \n"); // executa se a condição for verdadeira
		} else {
			System.out.printf("É menor de idade \n"); // executa se a condição for falsa
		}
		
		
		// Exemplo de estrutura de decisão encadeada (if / else if / else)
		// Usamos quando uma variável pode assumir vários valores diferentes
		
		// Criando uma variável inteira chamada num
		int num = 5;
		
		if (num == 0) {  // verifica se num é igual a 0
			System.out.printf("ZERO");
			
		} else if (num == 1){  // se não for 0, verifica se é 1
			System.out.printf("UM");
			
		} else if (num == 2){  // se não for 1, verifica se é 2
			System.out.printf("DOIS");
			
		} else {  
			// executa quando nenhuma das condições anteriores é verdadeira
			System.out.printf("Não sei escrever esse numero \n");
		}
		
		
		// Exemplo de uso de operadores lógicos
		// Vamos verificar se uma pessoa pode iniciar as aulas para tirar a carteira
		
		// Para isso duas condições precisam ser verdadeiras:
		// 1 - ser maior de idade
		// 2 - ter passado no teste psicológico
		
		boolean passouNoTeste = true;	// true = passou / false = reprovou
		
		// O operador lógico && significa "E"
		// Ou seja, as duas condições precisam ser verdadeiras
		
		if (idade >= 18 && passouNoTeste == true){
			System.out.printf("Apto para fazer as aulas teóricas \n");
		} else {
			System.out.printf("Não apto a fazer as aulas! \n");
		}
		
		
		// Exemplo utilizando a estrutura de decisão switch
		// O switch é útil quando queremos comparar uma variável
		// com vários valores possíveis
		
		// A variável avaliada é "num"
		switch (num) {
			
			case 0:  // se num for 0
				System.out.printf("ZERO \n");
				break;  // encerra o switch
			
			case 1:  // se num for 1
				System.out.printf("UM \n");
				break;
			
			case 2:  // se num for 2
				System.out.printf("DOIS \n");
				break;
			
			case 3:  // se num for 3
				System.out.printf("TRÊS \n");
				break;
			
			// default funciona como o último else do if
			// executa quando nenhum case é verdadeiro
			default:
				System.out.printf("Não sei escrever esse numero \n");
				// aqui não é necessário usar break
		}
		
		
	}	
}
