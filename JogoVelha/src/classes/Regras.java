package classes;

import principal.RunTictactoe;

public class Regras {
  
	
	public void marcar(String numero) {
		
		char charlinha = numero.charAt(0); 
		char charcoluna = numero.charAt(1);  
		
		//convertendo para char para int 
		
		int intlinha = Integer.parseInt(String.valueOf(charlinha));
		int intcoluna = Integer.parseInt(String.valueOf(charcoluna));
		
		
		RunTictactoe obj = new RunTictactoe();
		
		obj.getTabuleiro().setTabuleiro(intlinha, intcoluna);
		
		
		obj.getTabuleiro().mostrarTabuleiro();
		
	}
	
	
}
