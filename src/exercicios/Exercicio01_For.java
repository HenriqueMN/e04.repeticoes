package exercicios;

import java.util.Scanner;

public class Exercicio01_For {

	public static void main(String[] args) {
		// Algoritmo que lê dois números, um valor inicial e um valor final, e no final exibe todos os números entre eles que são múltiplos de 3 e 5
		
		// Criação das variáveis e do Scanner
		int num1, num2, multiplo;
		Scanner input = new Scanner(System.in);
		
		// Leitura do valor inicial e final
		System.out.print("Insira o número inicial: ");
		num1 = input.nextInt();
		System.out.print("Insira o número final: ");
		num2 = input.nextInt();
		
		// Checando se o num1 é menor que o num2
		if(num1 > num2) {
			System.out.print("\nIntervalo inválido!");
		}else {
			System.out.print("\nNo intervalo entre " + num1 + " e " + num2 + ":");
		}
		
		
		// For loop
		for(int i = num1;i <= num2;i++) {
			
			//Para um número ser múltiplo de outro, o módulo do primeiro pelo segundo deve ser 0
			if(i%3 == 0 && i%5 == 0) {
				System.out.print("\nO número " + i + " é múltiplo de 3 e 5.");
			}
		}
	}
}