programa
{
	
	funcao inicio()
	{ /*
		*
		*Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos
		 1min= 60seg
		 1h = 60min*60= 3600seg	 
		 */
		 inteiro totalSegundos=0
		 inteiro horas=0
		 inteiro minutos=0
		 inteiro segundos=0


		 escreva ("Quantos segundos tem a duração do evento")
		 leia (totalSegundos)

		 //processamento
		 horas = totalSegundos/3600
		 escreva("\n Total de horas: ", horas)
		 minutos= (totalSegundos %3600)/60)
		 escreva("\n Total de minutos: ", minutos)
		 segundos = (totalSegundos %3600)%60
		 escreva ("\n Total de segundo: ", segundos)	 
		
		 
		 
		 
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 595; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */