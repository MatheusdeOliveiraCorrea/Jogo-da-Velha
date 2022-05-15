package classes;

import principal.RunTictactoe;

public class Regras {
  
	private RunTictactoe obj = new RunTictactoe();
	private int mult = 1; 
	
	public void marcar(String numero) {
		
		// separando os algarismos, exemplo: 21 em dois e um
		char charlinha = numero.charAt(0); 
		char charcoluna = numero.charAt(1);  
		
		//convertendo para char para int 
		
		int intlinha = Integer.parseInt(String.valueOf(charlinha));
		int intcoluna = Integer.parseInt(String.valueOf(charcoluna));
		
		obj.getTabuleiro().setTabuleiro(intlinha, intcoluna); // atribuindo às posições do tabuleiro
		
		
	}
	
	
	/*
	 * Passando por todas as casas e checkando quais estão marcadas com 
	 * X ou O. Para então salvar a posição das casas marcas com X e com O 
	 * e futuramente fazer uma verificação matemática com os valores 10,132
	 * 9240, 440, 1000, 231, 528, 1210. Representando o produto das casas 
	 * em suas posiçoes vertical, horizontal e diagonal. 
	 * Como exemplo: 
	 * se as casas 00 , 11 e 22 tiverem marcadas vamos fazer o produto: 
	 * 
	 *  00 * 11 * 22 = 0 
	 *  
	 *  Obviamente vai dar 0. Pois todo número multiplicado por 0 é zero 
	 *  então resolvi esse problema trocando essa única casa 00 pelo valor 
	 *  fixo 5. Logo o produto na realidade fica: 
	 *  
	 *  5 * 11 * 22 = 1210 
	 *  
	 *  O mesmo ocorre com com todas as outras posições.
	 */
	public boolean haVencedor() {
		
		

		for(int linha = 0; linha < 3; linha++) {
			
			for(int coluna = 0; coluna < 3; coluna++) {

				String valorAtual = obj.getTabuleiro(linha, coluna);
					
				if (valorAtual.equals("  X    ")) {
	
					String string_posicao = ""+ linha + coluna ; 
					int int_posicao = Integer.parseInt(string_posicao); 
					
					mult = mult * int_posicao; 
								
								
				}
				
				
				if(valorAtual.equals("  O    ")) {
					
					
					
					
					
				}
				
				
			}// fim for ( coluna) 
			
		}// fim for ( linha ) 
		
		
		if(mult == 528) {		
			return true;
		} else {
			return false;
		}
		
		
	}// fim método "há vencedor? " 
	
	
	
	
	
}
