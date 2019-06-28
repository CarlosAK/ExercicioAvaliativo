package br.com.util;

public class Questao11 {

	public static void main(String[] args) {

		
				
		
		for(int l = 1; l <= 10; l++){
		    for(int c = 1; c <= 10; c++){
		      
		    	if(l < 10) {
		    		
		    		if (c < 10) {
		    			System.out.print(l + "-" + c +"   ");
		    		}
		    		
		    		else {
		    			System.out.println(l + "-" + c + "");
		    		}
		    	}
		    	
		        
		    	else{
		    		if (c <10) {
		    			System.out.print(l + "-" + c +"  ");
		    			
		    		}
		    		else {
		    		System.out.println(l + "-" + c + "");
		    		
		            }
		    }
		    
		
		    
		
		    }
		}
		
	}
}
	
	
	
