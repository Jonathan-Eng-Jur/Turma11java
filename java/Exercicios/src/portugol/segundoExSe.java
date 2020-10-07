package portugol;

import java.util.Scanner;

public class segundoExSe 
{
	public static void main(String[] args) {
		
		 Scanner tec = new Scanner (System.in);
		 double numero;
		System.out.print("Digite um numero que direi se ele é\nImpar, Par ou Negativo ");
		numero = tec.nextDouble();
		if (numero < 0){
			System.out.printf("Você digitou %.0f, é um numero negativo",numero);
		}else if (numero == 0) {
			System.out.println("Você digitou 0, é um numero neutro");
		}else if (numero%2 == 0){
			System.out.printf("Você digitou %.0f, é um numero Par! e positivo",numero);
		}else{
		System.out.printf("Você digitou %.0f, é um numero Impar! e positivo",numero);
		}
	}
}