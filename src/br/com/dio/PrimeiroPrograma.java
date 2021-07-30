package br.com.dio;
import br.com.dio.model.Gato;

public class PrimeiroPrograma {
	
	public static void main(String[] args) {
		
		Gato gat = new Gato();
		
		gat.setNome("Alfredo");
		gat.setCor("Branco");
		gat.setIdade(1);
		
		System.out.println("Hello Word!! pra quebrar a maldição");
		System.out.println("\n");
		System.out.println("Meu Gato se chama " + gat.getNome() + 
				" ele é " + gat.getCor() + " e tem " + gat.getIdade() 
				+ " ano de idade.");

	}

}
