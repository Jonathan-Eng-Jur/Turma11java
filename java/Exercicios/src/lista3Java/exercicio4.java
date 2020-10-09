package lista3Java;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		/*
		 * Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos 
		 * indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado:
		 *  idade, sexo (1-feminino / 2-masculino / 3-Outros),
		 *   e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa 
		 *   e 3, se a pessoa era agressiva). 
		 *   Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, 
		 *   calcule e mostre: (WHILE)
		o número de pessoas calmas; 
		o número de mulheres nervosas; 
		o número de homens agressivos; 
		o número de outros calmos;
		o número de pessoas nervosas com mais de 40 anos; 
o		 número de pessoas calmas com menos de 18 anos.

		 */
		Scanner leia = new Scanner(System.in); 
		int idade;
		final int LIMITE=150;
		byte sexo; //(1-feminino / 2-masculino / 3-Outros)
		byte tipoHumor; //(1, se a pessoa era calma; 2, se a pessoa era nervosa 
						//  3, se a pessoa era agressiva)
		int pessoasCalmas=0, mulheresN=0, homensA=0, outrosC=0, nervosas40=0, calmasM18=0;
		int contador = 1;    //char continua='S';
		
		System.out.println("________________SISTEMA GENERATION_______________");
		
		while (contador<=LIMITE)
		{
		System.out.print ("Digite sua idade: ");
		idade = leia.nextInt();
		System.out.print ("Digite: 1 - Feminino/ 2 - masculino / 3 - Outros: ");
		sexo = leia.nextByte();
		System.out.print ("Digite para cada pessoa seu humor: 1 - calma/ 2 - nervosa/ 3- agressiva\n");
		tipoHumor = leia.nextByte();
		
		
		if (tipoHumor == 1)
		{
			pessoasCalmas=pessoasCalmas+1;
		}
		if (tipoHumor==2 && sexo==1)
		{
		mulheresN = mulheresN+1;
		}
		if (tipoHumor==3 && sexo==2)  //homensA=0, outrosC=0, nervosas40=0, calmasM18=0;
		{
			homensA = homensA+1;
		}
		if (tipoHumor==1 && sexo==3) //
		{
			outrosC = outrosC+1;
		}
		if (tipoHumor==2 && idade>40) //
		{
			nervosas40 = nervosas40+1;
		}
		if (tipoHumor==1 && idade<=17 )
		{
			calmasM18=calmasM18+1;
		}
		
				
		contador++;	//fim do loop//
		
		}
		
		System.out.printf("\nTotal de pessoas calmas: %d .", pessoasCalmas);
		System.out.printf("\nTotal de mulheres nervosas: %d .", mulheresN);
		System.out.printf("\nTotal de homens agressivos: %d .", homensA);//
		System.out.printf("\nTotal de outros calmos: %d .", outrosC);///
		System.out.printf("\nTotal de pessoas nervosas com mais de 40 anos: %d .", nervosas40);////
		System.out.printf("\nTotal de pessoas calmas com menos de 18 anos: %d .", calmasM18);/////
		
				

	}

}
