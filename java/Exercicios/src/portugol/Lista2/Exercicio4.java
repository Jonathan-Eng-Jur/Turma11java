package portugol.Lista2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.
		 */
		 Scanner leia = new Scanner (System.in);
		double numero;
		
		System.out.print("Digite um numero par ou impar: \n");
		numero = leia.nextDouble();
		
		if (numero < 0){
		System.out.printf("\nVoc� digitou %.0f, � um numero negativo",numero);
		}else if (numero == 0) {
		System.out.println("\nVoc� digitou 0, � um numero neutro");
		}else if (numero%2 == 0){
		System.out.printf("\nVoc� digitou um n�meoro par e sua raiz � %.2f !",Math.sqrt(numero));
		}else{
		System.out.printf("\nVoc� digitou um n�mero impar, e elevado ao quadrado � %.2f !",numero*numero);
		}
	
	
	}

}
