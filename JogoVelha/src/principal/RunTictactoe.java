package principal;

import java.util.Scanner;

import classes.Regras;
import classes.Tabuleiro;

public class RunTictactoe {

	public static Tabuleiro tabuleiro = new Tabuleiro(); 
	
	
	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
	public static void main(String[] args) {
		
	
		
		//Objetos
		Regras regras = new Regras();
	    
		Scanner input = new Scanner(System.in);
		
		
		// começo do game 
		System.out.println("Escolha alguma posicao digitando os numeros: \n");
		
		//criar e mostrar um tabuleiro de números na tela
		tabuleiro.criarTabuleiro();
		tabuleiro.mostrarTabuleiro();
		
		
		// marcar X em alguma posição 
		System.out.print("digite: ");
		String posicao = input.next();
		
		regras.marcar(posicao);

	}

}
