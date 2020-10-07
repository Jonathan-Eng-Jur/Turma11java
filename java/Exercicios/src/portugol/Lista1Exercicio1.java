package portugol;

import java.util.Scanner;

public class Lista1Exercicio1 {
	
	public static void main(String[] args) {
	
		
	int anos, meses, dia, totalDias=0;
	
	
	Scanner leia = new Scanner(System.in);	
	
	System.out.print("Diga quantos anos vc tem ? ");
	anos = leia.nextInt();
	
	System.out.print("\nDiga quantos meses vc tem ? ");
	meses = leia.nextInt();
	
	System.out.print("\nDiga quantos dias vc tem ? ");
	dia = leia.nextInt();
	
	totalDias = ( (anos*365) + (meses*30) + dia) ;
	
	System.out.printf("\nA idade em dias é: %d .", totalDias);
	}

}
