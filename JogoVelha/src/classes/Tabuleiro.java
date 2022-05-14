package classes;

public class Tabuleiro {

	public String matrizTabuleiro[][] = new String[3][3];
	
	public void setTabuleiro(int linha, int coluna) {

		this.matrizTabuleiro[linha][coluna] = "  X    ";
		
	}
	
	
	public String getTabuleiro(int linha, int coluna) {
		
		return this.matrizTabuleiro[linha][coluna];
	}

	//preencher todas as casas do vetor com F<linhas><colunas>  
	public void criarTabuleiro() { 

		for (int linhas = 0; linhas < 3; linhas++) {

			for (int colunas = 0; colunas < 3; colunas++) {

				matrizTabuleiro[linhas][colunas] = " -" + linhas + colunas + "-  "; // 00 01 02 ...

			}

		}

	}

	

/*
 * Simples método para correr todas casas de uma matriz(com estruturas for), mostrar seu valor e 
 * pular linha a cada 3 casas  	
 */
	public void mostrarTabuleiro() {

		for (int linhas = 0; linhas < 3; linhas++) {

			for (int colunas = 0; colunas < 3; colunas++) {
				System.out.print(matrizTabuleiro[linhas][colunas]);
				
					//pular linha quando chegar no terceiro elemento, ou seja, quando a coluna for 2.
					//formando assim um quadrado que será nosso tabuleiro 
					if (colunas == 2) { 
						System.out.println("\n");
					}

			} 

		}

	}
	
	

}
