package lista3Java;

import java.util.Scanner;

public class Exercicio3Lista3 {

	public static void main(String[] args) {
	/*
	 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
	 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
	 */
		Scanner leia = new Scanner(System.in);
		
		int idade=0, x = 1, total21 = 0, total50 = 0;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		while (idade != -99) 
		{ // primeiro pergunta depois executa //
			
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		if (idade<21)
		{ total21 = total21+1;
			
		}
		
		if (idade > 50)
			
		{ total50=total50+1;
					
		}
		
		x++;
		
		}		
		System.out.println("Total de pessoas com 21 anos é: "+total21);
		System.out.println("Total de pessoas com mais de 50 anos é: "+total50);
			
	}

}
