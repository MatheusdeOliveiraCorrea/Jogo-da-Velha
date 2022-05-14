package principal;

import java.util.Scanner;

import classes.Regras;
import classes.Tabuleiro;

public class RunTictactoe {

	public static Tabuleiro tabuleiro = new Tabuleiro(); // tabuleiro 

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
	public String getTabuleiro(int linha, int coluna) {
		
		return tabuleiro.getTabuleiro(linha, coluna);
	}

	public static void main(String[] args) {

		// Objetos
		Regras regras = new Regras();
		Scanner input = new Scanner(System.in);

		// começo do game
		System.out.println("Escolha alguma posicao digitando os numeros: \n");

		// criar e mostrar um tabuleiro de números na tela
		tabuleiro.criarTabuleiro(); // preenche
		tabuleiro.mostrarTabuleiro(); 

		// Alterna entre os jogadores Humano vs Computador com estrutura while
		int rodada = 1;
		int vez = 1; 
		
		while (!regras.haVencedor()) { //enquanto não tiver vencedor

			if (rodada > 9) {  
				System.out.println("acabou");
				break;
			}

			if (vez == 1 ) {

				System.out.println("Rodada " + rodada);

				
				
				// marcar X em alguma posição
				System.out.print("Sua vez!! Digite: ");
				String posicao = input.next();

				regras.marcar(posicao);
				
				tabuleiro.mostrarTabuleiro();
				//vez--; // passa a vez pro computador

			} else {

				System.out.println("Rodada " + rodada + " VEZ DO COMPUTADOR: ");
				vez++;
			}

			rodada++;

		} // fim while

	}

}
