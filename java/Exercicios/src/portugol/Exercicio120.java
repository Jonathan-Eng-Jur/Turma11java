package portugol;

import java.util.Scanner;

public class Exercicio120 {

	public static void main(String[] args) 
	
	{	// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int anoNasc,idade;
		char sexo, chefe;
		String nome;
		
		System.out.print("Digite seu nome: \n");
		nome = leia.next();
		System.out.print("Digite seu ano de Nascimento: \n");
		anoNasc = leia.nextInt();
		System.out.print("Digite seu sexo Masculino ou Feminino: M ou F \n");
		sexo = leia.next().toUpperCase().charAt(0);
		System.out.print("Voc� � chefe(a) de fam�lia: S ou N\n");
		chefe = leia.next().toUpperCase().charAt(0);
		idade = 2020-anoNasc;
				
		if((sexo == 'M' || sexo == 'm') && (idade >= 18) && (chefe == 'S' || chefe == 's')  ){
			System.out.printf("\nOl� %s, sua idade � de %d voc� � do sexo Masculino e chefe de familia;\nEnt�o voc� tem direito aos R$ 600,00 mensais.\n", nome, idade); 
						;
		}else if( sexo == 'F' || sexo == 'f' && (idade >= 18) && (chefe == 'S' || chefe == 's') ){
			System.out.printf("\nOl� %s, sua idade � de %d voc� � do sexo feminino e chefa de familia;\nEnt�o voc� tem direito aos R$ 1.200,00 mensais.\n", nome, idade);
		}
		
		else { System.out.println("\nEnt�o voc� n�o tem direito...");}
		
		
	}
}
