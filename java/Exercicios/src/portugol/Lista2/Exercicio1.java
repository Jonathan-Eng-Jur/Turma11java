package portugol.Lista2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		
		int n1, n2, n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite tr�s n�meros: ");
		System.out.println("1� n�mero: ");
		n1 = leia.nextInt();
		System.out.println("2� n�mero: ");
		n2 = leia.nextInt();
		System.out.println("3� n�mero: ");
		n3 = leia.nextInt();
		
		
		
		if(n1>n2 && n2>n3) { 
		System.out.printf("A ordem dos n�meros � a seguinte: %d, %d e %d.", n1,n2,n3);
		} 
		else if (n2>n1 && n1>n3) { 
			System.out.printf("A ordem dos n�meros � a seguinte: %d, %d e %d.",n2,n1,n3);
			}
		else if (n3>n2 && n2>n1) { 
			System.out.printf("A ordem dos n�meros � a seguinte: %d, %d e %d.",n3,n2,n1);
			}
		else if (n3>n1 && n1>n2) { 
			System.out.printf("A ordem dos n�meros � a seguinte: %d, %d e %d.",n3,n1,n2);
			}
		else if (n2>n3 && n3>n1) { 
			System.out.printf("A ordem dos n�meros � a seguinte: %d, %d e %d.",n2,n3,n1);
			}
		else 
		{ 
			System.out.printf("A ordem dos n�meros � a seguinte: %d, %d e %d.", n1,n3,n2);
			}
				
	}

}
