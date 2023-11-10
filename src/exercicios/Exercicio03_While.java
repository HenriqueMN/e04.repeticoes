package exercicios;

import java.util.Scanner;

public class Exercicio03_While {

	public static void main(String[] args) {
		// Algoritmo que lê idades inseridas pelo usuário até que seja digitado um número negativo e ao final retorna o número de pessoas menores de 21 anos e maiores de 50 anos
		
		// Criação das variáveis e do Scanner
		int idade=1, menos21=0, mais50=0;
		Scanner input = new Scanner(System.in);
		
		// Loop while
		while(idade > 0) {
			System.out.print("Digite uma idade (insira um número negativo para parar): ");
			idade = input.nextInt();
			
			if(idade < 21 && idade > 0) {
				menos21++;
			}else if(idade > 50 && idade > 0) {
				mais50++;
			}else {
				continue;
			}
		}
		
		// Output
		System.out.print("\nTotal de pessoas menores de 21 anos: " + menos21 + "\n" + 
						"\nTotal de pessoas maiores de 50 anos: " + mais50);

	}

}
