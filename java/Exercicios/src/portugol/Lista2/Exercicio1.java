package portugol.Lista2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Faça um programa que entre com três números e coloque em ordem crescente.
		
		int n1, n2, n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite três números: ");
		System.out.println("1º número: ");
		n1 = leia.nextInt();
		System.out.println("2º número: ");
		n2 = leia.nextInt();
		System.out.println("3º número: ");
		n3 = leia.nextInt();
		
		
		
		if(n1>n2 && n2>n3) { 
		System.out.printf("A ordem dos números é a seguinte: %d, %d e %d.", n1,n2,n3);
		} 
		else if (n2>n1 && n1>n3) { 
			System.out.printf("A ordem dos números é a seguinte: %d, %d e %d.",n2,n1,n3);
			}
		else if (n3>n2 && n2>n1) { 
			System.out.printf("A ordem dos números é a seguinte: %d, %d e %d.",n3,n2,n1);
			}
		else if (n3>n1 && n1>n2) { 
			System.out.printf("A ordem dos números é a seguinte: %d, %d e %d.",n3,n1,n2);
			}
		else if (n2>n3 && n3>n1) { 
			System.out.printf("A ordem dos números é a seguinte: %d, %d e %d.",n2,n3,n1);
			}
		else 
		{ 
			System.out.printf("A ordem dos números é a seguinte: %d, %d e %d.", n1,n3,n2);
			}
				
	}

}
