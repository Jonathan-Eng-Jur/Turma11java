package portugol.Lista2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
		 */
		 Scanner leia = new Scanner (System.in);
		double numero;
		
		System.out.print("Digite um numero par ou impar: \n");
		numero = leia.nextDouble();
		
		if (numero < 0){
		System.out.printf("\nVocê digitou %.0f, é um numero negativo",numero);
		}else if (numero == 0) {
		System.out.println("\nVocê digitou 0, é um numero neutro");
		}else if (numero%2 == 0){
		System.out.printf("\nVocê digitou um númeoro par e sua raiz é %.2f !",Math.sqrt(numero));
		}else{
		System.out.printf("\nVocê digitou um número impar, e elevado ao quadrado é %.2f !",numero*numero);
		}
	
	
	}

}
