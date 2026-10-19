
class CalculadoraArea {
	
	// Sobrecarga de métodos: permite criar vários métodos com
	// o mesmo nome, desde que tenham parâmetros diferentes.
	
	public void calcularArea(int lado){
		System.out.printf("O quadrado tem área de %d m²\n", 
			lado * lado);
	}
	
	// Mesmo nome, mas com dois parâmetros do tipo int.
	public void calcularArea(int base, int altura){
		System.out.printf("O triângulo de área de %d m² \n", 
			(base * altura) / 2
		);
	}
	
	// Mesmo nome e quantidade de parâmetros, mas com tipo
	// diferente (float em vez de int).
	public void calcularArea(float b, float a){
		System.out.printf("O triângulo de área de %f cm² \n", 
			(b * a) / 2
		);
	}
	
	public static void main (String args[]) {
		CalculadoraArea calc = new CalculadoraArea();
		
		// O Java seleciona o método adequado conforme os
		// tipos e a quantidade de argumentos informados.
		calc.calcularArea(0.3f, 0.2f);
		
	}
	
}
