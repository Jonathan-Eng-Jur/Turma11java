package ListaVetorMatriz;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	/*
	 * Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.
	 */
	Scanner leia = new Scanner (System.in);
	int PI[] = new int [6];
	int x=0, somaP=0, somaI=0;
	int contadorI=0;
		
	System.out.println("Digite um n�mero inteiro: ");
	PI[0] = leia.nextInt();
	System.out.println("Digite um n�mero inteiro: ");
	PI[1] = leia.nextInt();
	System.out.println("Digite um n�mero inteiro: ");
	PI[2] = leia.nextInt();
	System.out.println("Digite um n�mero inteiro: ");
	PI[3] = leia.nextInt();
	System.out.println("Digite um n�mero inteiro: ");
	PI[4] = leia.nextInt();
	System.out.println("Digite um n�mero inteiro: ");
	PI[5] = leia.nextInt();
	
	for(x=0;x<6;x++)
	{
	if (PI[x]%2 == 0)	
		
	{somaP=PI[x]+PI[x];
	System.out.printf("Os n�meros pares digitados de posi��o: %d  �: %d.\n",x, PI[x]);
	}
	
	if (PI[x]%2 == 1)	
	{
	somaI=PI[x]+PI[x];
	contadorI++;
	}
		
	} 
	System.out.println("\nA soma dos n�meros pares �: "+somaP);
	System.out.println("\nA soma dos n�meros impares �: "+somaI);
	System.out.println("\nA quantidade de n�meros impares �: "+contadorI);
	
	}

}
