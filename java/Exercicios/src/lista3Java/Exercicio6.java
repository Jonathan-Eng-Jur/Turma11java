package lista3Java;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
	/*
	 * Escrever um programa que receba vários números inteiros no teclado. 
	 * E no final imprimir a média dos números múltiplos de 3. 
	 * Para sair digitar 0(zero).(DO...WHILE)
	 */
		int media=0, x=0, contador=1, total=0, resultado=0;
				
		Scanner leia = new Scanner(System.in);
		
		do
		{
		System.out.println("Digite um Número: ");
		x = leia.nextInt();
		total = total+1;
		
		x++;
		
		
		
		contador++; 
	
		}
		while (x!=0);
		{
		
		System.out.printf("O número digitado é: %d e soma: %d.", total,x);	
					
		}
		
		

	}

}
