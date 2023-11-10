package exercicios;

import java.util.Scanner;

public class Exercicio01_For {

	public static void main(String[] args) {
		// Algoritmo que lê dois número, um valor inicial e um valor final, e no final exibe todos os números entre eles que são múltiplos de 3 e 5
		
		// Criação das variáveis e do Scanner
		int num1, num2, multiplo;
		Scanner input = new Scanner(System.in);
		
		// Leitura do valor inicial e final
		System.out.print("Insira o número inicial: ");
		num1 = input.nextInt();
		System.out.print("Insira o número final: ");
		num2 = input.nextInt();
		
		// For loop
		for(int i = num1;i <= num2;i++) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.print("\nO número " + i + " é múltiplo de 3 e 5.");
			}
		}

	}

}
