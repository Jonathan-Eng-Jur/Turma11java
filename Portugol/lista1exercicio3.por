programa
{
	
	funcao inicio()
	{
		inteiro mes 
		inteiro dias
		inteiro idade
		inteiro totalDias
//modo de preparo
		escreva("Qual sua idade em dias)")
		leia (totalDias)
		

		//processamento
		idade = totalDias/365
		mes = (totalDias - idade*365)/30
		dias = (totalDias - idade*365) - (mes*30)
				
		
 
		escreva ("A minha idade em anos, meses e dias é: "+idade+"idade"+mes+"meses"+dias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 240; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */