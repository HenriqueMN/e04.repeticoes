package exercicios;

import java.util.Scanner;

public class Exercicio02_For {

	public static void main(String[] args) {
		// Algoritmo que lê 10 números inteiros e exibe na tela a quantidade de números pares e a quantidade de números ímpares
		
		// Criação das variáveis e do Scanner
		int numero, pares=0, impares=0;
		Scanner input = new Scanner(System.in);
		
		// For loop
		for(int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + "º número: ");
			numero = input.nextInt();
			
			if(numero%2 == 0) {
				pares++;
			}else {
				impares++;
			}
		}
		
		// Output
		System.out.print("\nTotal de números pares: " + pares);
		System.out.print("\nTotal de números ímpares: " + impares);

	}

}
