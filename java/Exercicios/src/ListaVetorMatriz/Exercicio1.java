package ListaVetorMatriz;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	/*
	 * Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.

	 */
	Scanner leia = new Scanner (System.in);
	int	A[] = {-5, -2, 0, 1, 5, 7};
	
	int x=0, soma=0;
	

	soma=A[0]+A[1]+A[5];
	
	
	if (A[4]==5) {
		
		
 System.out.printf("A soma dos valores das posi��es A[0], A[1] e A[5] � %d.\n", soma);
 
	A[4]=100;}
	
	for (x=0;x<6;x++)
		
	{ System.out.printf("O valor na posi��o %d, � %d.\n", x, A[x]);}
	

	}

}
