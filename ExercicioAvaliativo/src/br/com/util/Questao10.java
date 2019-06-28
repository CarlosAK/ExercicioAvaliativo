package br.com.util;

public class Questao10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		numero = Teclado.lerInt("Digite um numero");
		int soma = numero;
		
		for(int i = numero -1; i > 0; i --) {
			soma *= i;
			
			
		}
		System.out.println("o fatorial de " + numero + " é: " + soma);

	}

}
