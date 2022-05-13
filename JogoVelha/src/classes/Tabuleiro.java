package classes;

public class Tabuleiro {

	public String tabuleiro[][] = new String[3][3];
	
	public void setTabuleiro(int linha, int coluna) {

	
		this.tabuleiro[linha][coluna] = "  X    ";
		
	}
	
	
	public String[][] getTabuleiro() {
		return tabuleiro;
	}

	//preencher todas as casas do vetor com F<linhas><colunas>  
	public void criarTabuleiro() { 

		for (int linhas = 0; linhas < 3; linhas++) {

			for (int colunas = 0; colunas < 3; colunas++) {

				tabuleiro[linhas][colunas] = " -" + linhas + colunas + "-  "; // 00 01 02 ...

			}

		}

	}

	

/*
 * Simples método para correr todas casas de uma matriz, mostrar seu valor e 
 * pular linha a cada 3 casas  	
 */
	public void mostrarTabuleiro() {

		for (int linhas = 0; linhas < 3; linhas++) {

			for (int colunas = 0; colunas < 3; colunas++) {
				System.out.print(tabuleiro[linhas][colunas]);
				
					//pular linha quando chegar no terceiro elemento, ou seja, quando a coluna for 2.
					//formando assim um quadrado que será nosso tabuleiro 
					if (colunas == 2) { 
						System.out.println("\n");
					}

			} 

		}

	}
	
	

}
