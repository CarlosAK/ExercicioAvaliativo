package br.com.util;

public class Questao8 {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		String sexo;
		String[] listanomes = new String[4];
		
		for(int i = 0; i < listanomes.length; i++ ) {
			nome = Teclado.lerTexto("insira seu nome ");
			idade = Teclado.lerInt("insira sua idade ");
			sexo = Teclado.lerTexto("insira seu sexo ");
			
			if(sexo.equalsIgnoreCase("M") && idade >= 21) {
				
			}
		}
		
		for (int i = 0; i < listanomes.length; i++) {
			
			if (listanomes[i].equalsIgnoreCase("null")) {
				
			
		}
		
		else {
			System.out.println(listanomes[i]);
			
		}
	    }
	}

}
