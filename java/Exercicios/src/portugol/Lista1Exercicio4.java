package portugol;

import java.util.Scanner;

public class Lista1Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 4. Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o: 
 		r= (a+b)^2;
		s=(b+c)^2;
		
		d = (r+s)/2;
		 */
		int a, b, c, d=0, r=0, s=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Diga tr�s valores inteiros: \n");
		System.out.print("1� n�emro: \n");
		a = leia.nextInt();
		System.out.print("2� n�mero: \n");
		b = leia.nextInt();
		System.out.print("3� n�mero\n");
		c = leia.nextInt();
		
		r= (a+b)*(a+b);
		s=(b+c)*(b+c);
		
		d = (r+s)/2;
				
		System.out.printf("\nOs resultados s�o: \nR: %d;\nS: %d;\nD: %d.", r, s, d);
		
			}

	
	}