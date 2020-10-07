package portugol;

import java.util.Scanner;

public class Lista1Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor 
		 * e dos impostos (aplicados ao custo de fábrica). 
		 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
		 * escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
		 * soma= 100% = custos(28%) + impostos(48%) + custo fabrica
		 * 100%  - soma
		 * 73%     15000
		 */
		int custos, impostos;
		double soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Um carro possui alguns custos sendo eles:");
		System.out.println("Informe o valor do distribuidor: ");
		custos = leia.nextInt();
		System.out.println("Informe o valor dos impostos: ");
		impostos = leia.nextInt();
		
		soma = (100*(custos+impostos))/73;
		
		System.out.printf("\nO custo ao consumidor é de R$ %.2f .", soma);
				
	}

}
