package br.com.util;

public class Questao13 {

	public static void main(String[] args) {
		
		int numero;
		
		numero = Teclado.lerInt("Digite um numero");
		
		for(int i = 1; i <= numero; i++) {
			System.out.println(i + " polegadas = " + (i*2.54) + " cm ");
		}

	}

}
