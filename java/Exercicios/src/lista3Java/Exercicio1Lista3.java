package lista3Java;

import java.util.Scanner;

public class Exercicio1Lista3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
		 */
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Os números que dividos por 11 e obtemos resto = 5, são: \n");
		
		for (x=1000;x<=1999;x=x+1)
		
		{
		if (x %11==5)
		
		System.out.println("Nº"+x); }
					
		
	}
	
	}
