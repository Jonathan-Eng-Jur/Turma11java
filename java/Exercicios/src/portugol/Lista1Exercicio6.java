package portugol;

import java.util.Scanner;

public class Lista1Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano,
		 * P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é:  
		 * 
		 * d= √(x2-x1)^2 + (y2-y1)^2
		 */
		int x1, x2, y1, y2;
		double d=0, r1=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Diga a posição de x1: ");
		x1 = leia.nextInt();
		System.out.println("Diga a posição de y1: ");
		y1 = leia.nextInt();
		System.out.println("Diga a posição de x2: ");
		x2 = leia.nextInt();
		System.out.println("Diga a posição de y2: ");
		y2 = leia.nextInt();
		
		
		r1=((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1));
		
		d = Math.sqrt(r1); // raiz quadrada
		
		System.out.printf("\nAs posições de P( %d, %d ) e P( %d , %d ), sendo a raiz quadrada de D: %.2f .", x1, y1, x2, y2, d);
							
		
	}

}
