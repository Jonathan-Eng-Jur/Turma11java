package lista3Java;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
		 * No final, mostre a soma dos n�meros digitados.
		 */
		int total=0, x=0, contador=1;
		
				
		Scanner leia = new Scanner(System.in);
		
		do
		{
		System.out.println("Digite um N�mero: ");
		x = leia.nextInt();
		
		total= total+x;
		
		contador++; 
		
		}
		while (x!=0); // TRAVA
		{		
		
		
			System.out.printf("A soma dos n�meros digitados �: %d.", total);	
			
		}
		
		
	}

}
