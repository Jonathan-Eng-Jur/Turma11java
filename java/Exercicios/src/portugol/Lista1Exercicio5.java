package portugol;

import java.util.Scanner;

public class Lista1Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
		 * Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente. 
		 */
		
		int n1, n2, n3;
		double m=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Ol� Alune, me dia quais s�o suas notas? Vamos l�...");
		System.out.println("1� nota: ");
		n1 = leia.nextInt();
		System.out.println("2� nota: ");
		n2 = leia.nextInt();
		System.out.println("3� nota: ");
		n3 = leia.nextInt();
		
		m =((n1*2)+(n2*3)+(n3*5))/10;
				
		System.out.printf("Alune, com suas notas a sua m�dia �: %.2f",m); // %2.f � usado para apresenta��o de n�meros reais
		
		
		
	}

}
