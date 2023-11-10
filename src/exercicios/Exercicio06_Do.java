package exercicios;

import java.util.Scanner;

public class Exercicio06_Do {

	public static void main(String[] args) {
		// Algoritmo que lê números inteiros inseridos pelo usuário até o número inserido ser 0 e ao final exibe a média dos números múltiplos de 3 que foram digitados
		
		// Criação das variáveis e do Scanner
		int numero;
		float media, soma=0f, quantidade=0f;
		Scanner input = new Scanner(System.in);
				
		// Loop Do...While
		do {
			System.out.print("Digite um número (0 para sair): ");
			numero = input.nextInt();
					
			if(numero%3 == 0 && numero != 0) {
				soma+= numero;
				quantidade++;
			}
		}while(numero != 0);
				
		// Cálculo da média e output
		media = soma/quantidade;
		System.out.printf("\nA média de todos os números múltiplos de 3 é: %.2f", media);
	}

}
