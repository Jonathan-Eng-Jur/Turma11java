package portugol.Lista2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		//Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
		//categoria ela se encontra:
			// 10-14 infantil
			// 15-17 juvenil
			// 18-25 adulto
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Diga a sua idade: ");
		idade = leia.nextInt();
				
		if(idade>=10 && idade<14) { 
		System.out.printf("\nA sua idade é de %d anos, e sua categoria é INFANTIL.", idade);
		} 
		else if (idade>=15 && idade<17) { 
			System.out.printf("\nA sua idade é de %d anos, e sua categoria é JUVENIL.", idade);
			} 
		else if (idade>=18 && idade<25) { 
			System.out.printf("\nA sua idade é de %d anos, e sua categoria é ADULTO.", idade);
			} 
		else 
		{ 
		System.out.printf("\nA sua idade de %d anos, e não possui categoria no momento...", idade);
		}
	}

}
