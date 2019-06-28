package br.com.util;

public class Questao12 {

	public static void main(String[] args) {
		
		
		for(int l = 1; l <= 10; l++){
		    for(int c = 1; c <= 10; c++){
		      
		    	if(c < 10) {
		    		
		    		if (l >= c) {
		    			System.out.print("X-X  ");
		    		}
		    		
		    		else {
		    			System.out.print(l + "-" + c + "  ");
		    		}
		    	}
		    	if (c == 10) {
		    		System.out.println(l + "-" + c +"");
		    	}
	}

}
}
	}