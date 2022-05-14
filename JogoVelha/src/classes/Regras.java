package classes;

import principal.RunTictactoe;

public class Regras {
  
	RunTictactoe obj = new RunTictactoe();
	
	
	public void marcar(String numero) {
		
		// separando os algarismos, exemplo: 21 em dois e um
		char charlinha = numero.charAt(0); 
		char charcoluna = numero.charAt(1);  
		
		//convertendo para char para int 
		
		int intlinha = Integer.parseInt(String.valueOf(charlinha));
		int intcoluna = Integer.parseInt(String.valueOf(charcoluna));
		
		obj.getTabuleiro().setTabuleiro(intlinha, intcoluna); // atribuindo às posições do tabuleiro
		
		
	}
	
	
	public boolean haVencedor() {
		
		for(int linhas = 0; linhas < 3; linhas++) {
			
			for(int colunas = 0; colunas < 3; colunas++) {

				String valorAtual = obj.getTabuleiro(linhas, colunas);
					
				//System.out.println("valor atual: " + valorAtual);
				
			}		
			
		}
		
		
		return false;
	}
	
	
	
	
	
}
