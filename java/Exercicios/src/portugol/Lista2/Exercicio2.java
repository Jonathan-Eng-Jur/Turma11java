package portugol.Lista2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		int n1, n2, n3, n4;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite tr�s n�meros inteiros: ");
		System.out.println("1� n�mero: ");
		n1 = leia.nextInt();
		System.out.println("2� n�mero: ");
		n2 = leia.nextInt();
		System.out.println("3� n�mero: ");
		n3 = leia.nextInt();
		
		
		
		if(n1>n2 && n1>n3) { 
		System.out.printf("O maior n�mero � o primeiro, sendo: %d.", n1);
		} 
		else if (n2>n3) { 
			System.out.printf("O maior n�mero � o segundo, sendo: %d.", n2);
			}
		else 
		{ 
			System.out.printf("O maior n�mero � o terceiro, sendo: %d.", n3);
			}
				
	}

}
