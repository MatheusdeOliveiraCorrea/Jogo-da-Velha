package classes;

public class Tabuleiro {

	public String tabuleiro[][] = new String[3][3];
	
	
	public String[][] getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(String[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	//preencher todas as casas do vetor com F<linhas><colunas>  
	public void criarTabuleiro() { 

		for (int linhas = 0; linhas < 3; linhas++) {

			for (int colunas = 0; colunas < 3; colunas++) {

				tabuleiro[linhas][colunas] = " -" + linhas + colunas + "-  "; // F00 F01 F02 ...

			}

		}

	}

	public void mostrarTabuleiro() {

		for (int linhas = 0; linhas < 3; linhas++) {

			for (int colunas = 0; colunas < 3; colunas++) {

				System.out.print(tabuleiro[linhas][colunas]);
				
				
	//pular linha quando chegar no terceiro F, ou seja, quando a coluna for 2 ( terceiro F) 
				if (colunas == 2) { 
					System.out.println("\n");
				}

			}

		}

	}
	
	
	
	
	
	
	
	
	

}
