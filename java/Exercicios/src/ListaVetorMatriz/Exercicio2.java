package ListaVetorMatriz;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	/*
	 * Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
	 */
	Scanner leia = new Scanner (System.in);
	int PI[] = new int [6];
	int x=0, somaP=0, somaI=0;
	int contadorI=0;
		
	System.out.println("Digite um número inteiro: ");
	PI[0] = leia.nextInt();
	System.out.println("Digite um número inteiro: ");
	PI[1] = leia.nextInt();
	System.out.println("Digite um número inteiro: ");
	PI[2] = leia.nextInt();
	System.out.println("Digite um número inteiro: ");
	PI[3] = leia.nextInt();
	System.out.println("Digite um número inteiro: ");
	PI[4] = leia.nextInt();
	System.out.println("Digite um número inteiro: ");
	PI[5] = leia.nextInt();
	
	for(x=0;x<6;x++)
	{
	if (PI[x]%2 == 0)	
		
	{somaP=PI[x]+PI[x];
	System.out.printf("Os números pares digitados de posição: %d  é: %d.\n",x, PI[x]);
	}
	
	if (PI[x]%2 == 1)	
	{
	somaI=PI[x]+PI[x];
	contadorI++;
	}
		
	} 
	System.out.println("\nA soma dos números pares é: "+somaP);
	System.out.println("\nA soma dos números impares é: "+somaI);
	System.out.println("\nA quantidade de números impares é: "+contadorI);
	
	}

}
