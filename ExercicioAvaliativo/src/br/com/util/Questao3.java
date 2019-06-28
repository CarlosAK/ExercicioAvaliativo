package br.com.util;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		numero = Teclado.lerInt("Digite um numero");
		
		for (int i = 1; i <= 10; i++) {
		
		System.out.println(numero + " x " + i + " = " + (numero*i));
		}
	}

}
