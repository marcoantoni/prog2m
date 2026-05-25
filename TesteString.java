import java.util.Scanner;

class TesteString{
	
	public static void main (String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe seu nome \n");
		String nome = sc.nextLine();
		
		System.out.printf("Informe sua senha \n");
		String senha = sc.nextLine();
		
		// forma errada de testar strings
		//if (nome == "marco" && senha == "1234") 
		
		// o operador == compara referências de memória dos objetos,
		// e não o conteúdo armazenado dentro da String.
		// Assim, mesmo digitando os valores corretos,
		// a comparação pode resultar em false.

		
		// a forma correte é usar o método equals(), que compara o conteúdo das 
		// Strings verificando se os textos são iguais.
		// equalsIgnoreCase testa se diferenciar maiúsculas de minúsculas	
		

		if (nome.equals("marco") && senha.equals("1234") ) {
			System.out.printf("Login ok \n");
		} else {
			System.out.printf("Usuario ou senha estão errados");
		}
		
	}
	
}
