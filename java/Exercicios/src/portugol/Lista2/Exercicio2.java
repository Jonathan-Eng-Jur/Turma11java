package portugol.Lista2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		int n1, n2, n3, n4;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite três números inteiros: ");
		System.out.println("1º número: ");
		n1 = leia.nextInt();
		System.out.println("2º número: ");
		n2 = leia.nextInt();
		System.out.println("3º número: ");
		n3 = leia.nextInt();
		
		
		
		if(n1>n2 && n1>n3) { 
		System.out.printf("O maior número é o primeiro, sendo: %d.", n1);
		} 
		else if (n2>n3) { 
			System.out.printf("O maior número é o segundo, sendo: %d.", n2);
			}
		else 
		{ 
			System.out.printf("O maior número é o terceiro, sendo: %d.", n3);
			}
				
	}

}
