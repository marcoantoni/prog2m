// definição da classe Coordenada
class Coordenada {

	// atributos da classe (representam a posição do ponto no plano cartesiano)
	int x; // valor no eixo X (horizontal)
	int y; // valor no eixo Y (vertical)
	
	// método responsável por identificar em qual quadrante o ponto está
	public void determinarQuadrante(){
		
		// 1º quadrante: x positivo e y positivo
		if (x > 0 && y > 0) {
			System.out.printf("1º quadrante\n");
		
		// 2º quadrante: x negativo e y positivo
		} else if (x < 0 && y > 0){
			System.out.printf("2º quadrante \n");
		
		// 3º quadrante: x negativo e y negativo
		} else if (x < 0 && y < 0){
			System.out.printf("3º quadrante \n");
		
		// 4º quadrante: x positivo e y negativo
		} else if (x > 0 && y < 0){
			System.out.printf("4º quadrante \n");
		
		// caso especial: quando o ponto está na origem (0,0)
		// ou sobre um dos eixos (x = 0 ou y = 0)
		} else {
			System.out.printf("O ponto está na origem ou sobre um dos eixos\n");
		}
	}
	
	// método principal (ponto de entrada do programa)
	public static void main(String[] args) {
		
		// criando o primeiro objeto da classe Coordenada
		Coordenada c1 = new Coordenada();
		
		// atribuindo valores ao ponto c1
		c1.x = 0;
		c1.y = -5;
		
		// chamando o método para verificar o quadrante
		c1.determinarQuadrante();
		
		// criando um segundo objeto da classe Coordenada
		Coordenada c2 = new Coordenada();
		
		// atribuindo valores ao ponto c2
		c2.x = -5;
		c2.y = 12;
		
		// chamando o método novamente para o segundo ponto
		c2.determinarQuadrante();
	}
}
