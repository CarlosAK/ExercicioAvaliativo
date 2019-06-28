package br.com.util;

public class Questao2 {

	public static void main(String[] args) {

		int soma = 0;
		int numero;
		
		numero = Teclado.lerInt("Digite um numero");
		
		for(int i = 0; i <= numero; i++) {
			soma +=i;
		}
		
		System.out.println("A soma é: " + soma);
		
	}

}
