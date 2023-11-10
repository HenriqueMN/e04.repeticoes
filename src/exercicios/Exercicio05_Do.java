package exercicios;

import java.util.Scanner;

public class Exercicio05_Do {

	public static void main(String[] args) {
		// Algoritmo que lê números inteiros inseridos pelo usuário até o número inserido ser 0 e ao final exibe a soma dos números positivos que foram digitados
		
		// Criação das variáveis e do Scanner
		int idade, soma=0;
		Scanner input = new Scanner(System.in);
		
		// Loop Do...While
		do {
			System.out.print("Digite um número (0 para sair): ");
			idade = input.nextInt();
			
			if(idade > 0) {
				soma+= idade;
			}
		}while(idade != 0);
		
		// Output
		System.out.print("\nA soma dos números positivos é: " + soma);

	}

}
