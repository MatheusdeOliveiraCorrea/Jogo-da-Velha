package classes;

public class VezJogador {
	
	Tabuleiro tab = new Tabuleiro();
	
	
	public void checkar(String numero) {
		
		
		System.out.println(numero.charAt(0));
		System.out.println(numero.charAt(1));
		
		int linha = numero.charAt(0);
		int coluna = numero.charAt(1);
		
		
		
	    
		tab.tabuleiro[linha][coluna] = "x";
		
		tab.mostrarTabuleiro();
		
		
		
		
	}
	

}
