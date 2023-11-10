package exercicios;

import java.util.Scanner;

public class Exercicio04_While {

	public static void main(String[] args) {
		/* Input:
		 * 
		 * Idade (Número inteiro)
		 * Identidade de Gênero (Número Inteiro): 
		 * * 1 – Mulher Cis
		 * * 2 – Homem Cis
		 * * 3 – Não Binário
		 * * 4 – Mulher Trans
		 * * 5 – Homem Trans
		 * * 6 – Outros
		 * Pessoa Desenvolvedora (Número Inteiro):
		 * * 1 – Backend
		 * * 2 – Frontend
		 * * 3 – Mobile
		 * * 4 – FullStack
		 * 
		 * Após digitar a categoria, o sistema deverá perguntar ao usuário se ele deseja continuar a leitura dos dados de um novo colaborador ou não (S/N). Caso seja pressionada a tecla N, mostre na tela:
		 * 
		 * Output:
		 * 
		 * * O número de pessoas desenvolvedoras Backend
		 * * O número de Mulheres Cis e Trans desenvolvedoras Frontend
		 * * O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos
		 * * O número de Não Binários desenvolvedores FullStack menores de 30 anos
		 * * O número total de pessoas que responderam à pesquisa
		 * * A média de idade das pessoas que responderam à pesquisa
		 */
		
		// Criação das variáveis e do Scanner
		int idade, idGenero, idDev;
		int totalB=0, totalMulherFr=0, totalHomemM40=0, totalNBFu30=0, total=0;
		float totalIdade = 0, media;
		char continuar='s';
		Scanner input = new Scanner(System.in);
		
		// While loop
		while(continuar == 's') {
			System.out.println("Idade: ");
			idade = input.nextInt();
			System.out.println("Identidade de gênero: " + "\n" + 
							  "(1|Mulher Cis; 2|Homem Cis; 3|Não Binário; 4|Mulher Trans; 5|Homem Trans; 6|Outro)");
			idGenero = input.nextInt();
			System.out.println("Pessoa desenvolvedora: " + "\n" + 
							  "(1|Backend; 2|Frontend; 3|Mobile; 4|Fullstack)");
			idDev = input.nextInt();
			
			total++;
			totalIdade += idade;
			
			if(idDev == 1) { //Se for Backend
				totalB++;
			}
			
			if((idGenero == 1 || idGenero == 4) && idDev == 2) { //Se for mulher e Frontend
				totalMulherFr++;
			}
			
			if((idGenero == 2 || idGenero == 5) && idDev == 3 && idade > 40) { //Se for homem, acima de 40 e Mobile
				totalHomemM40++;
			}
			
			if(idGenero == 3 && idDev == 4 && idade > 30) { //Se for NB, fullstack e acima de 30
				totalNBFu30++;
			}
			
			System.out.println("Deseja continuar?\n(s/n): ");
			continuar = input.next().charAt(0);
			
		}
		
		//Cálculo da média de idade
		media = totalIdade/total;
		
		// Output
		System.out.println("Total de pessoas desenvolvedoras Backend: " + totalB);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + totalMulherFr);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + totalHomemM40);
		System.out.println("Total de Não Binários desenvolvedores FullStack menores de 30 anos: " + totalNBFu30);
		System.out.println("Total de pessoas que responderam a pesquisa: " + total);
		System.out.printf("Média de idade das pessoas que responderam a pesquisa: %.2f", media);

	}

}
