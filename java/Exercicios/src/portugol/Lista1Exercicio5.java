package portugol;

import java.util.Scanner;

public class Lista1Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
		 * Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
		 */
		
		int n1, n2, n3;
		double m=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Olá Alune, me dia quais são suas notas? Vamos lá...");
		System.out.println("1ª nota: ");
		n1 = leia.nextInt();
		System.out.println("2ª nota: ");
		n2 = leia.nextInt();
		System.out.println("3ª nota: ");
		n3 = leia.nextInt();
		
		m =((n1*2)+(n2*3)+(n3*5))/10;
				
		System.out.printf("Alune, com suas notas a sua média é: %.2f",m); // %2.f é usado para apresentação de números reais
		
		
		
	}

}
