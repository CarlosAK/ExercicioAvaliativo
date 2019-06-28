package br.com.util;

public class Questao9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		numero = Teclado.lerInt("Digite um numero");
		
		for (int i = 1; i <= numero; i++) {
		if (i% 3 == 0 && i%5 ==0) {
		
			System.out.println(i);
			
		}

	}
	}
}
