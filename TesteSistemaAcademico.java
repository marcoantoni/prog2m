class TesteSistemaAcademico {
	
	public static void main (String args[]) {
		
		Professor p1 = new Professor("Marco Antoni", new Data(17, 4, 1993), 
				"marco.antoni@rolante.ifrs.edu.br", "123.456.432-69", 
				12401.89f, 12345);
				
		System.out.printf( p1.mostrar2() );
		
	}
	
}
