package portugol;

import java.util.Scanner;

public class lista1Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * inteiro totalSegundos=0
		 inteiro horas=0
		 inteiro minutos=0
		 inteiro segundos=0

		 escreva ("Quantos segundos tem a duração do evento")
		 leia (totalSegundos)
		 //processamento
		 horas = totalSegundos/3600
		 escreva("\n Total de horas: ", horas)
		 minutos= (totalSegundos %3600)/60)
		 escreva("\n Total de minutos: ", minutos)
		 segundos = (totalSegundos %3600)%60
		 escreva ("\n Total de segundo: ", segundos)	 
		 */
		int totalSegundos=0, horas, minutos, segundos;
		
		Scanner leia = new Scanner(System.in);	
		
		System.out.print("Quantos segundos tem a duração do evento? ");
		totalSegundos = leia.nextInt();
		
		horas = totalSegundos/3600;
		minutos = (totalSegundos %3600)/60;
		segundos = (totalSegundos %3600)%60;
		
		System.out.printf("\nO Total em horas é: %d .", horas);
		System.out.printf("\nO total em minutos é: %d .", minutos);
		System.out.printf("\nO total em segundos é: %d .", segundos);

	}

}
