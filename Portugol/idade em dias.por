programa
{
	//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 

	funcao inicio()
	{
		inteiro anoNascimento
		inteiro mes 
		inteiro dia
		inteiro resultado
		inteiro idade
		inteiro resultado2
		inteiro resultado3
		inteiro totalDias
//modo de preparo
		escreva("Qual ano você nasceu?)//escreva na tela")
		leia (anoNascimento)
		escreva("Qual o mes que voce nasceu ? (digite em modo numeral)")
		leia (mes)
		escreva("Qual dia voce nasceu")
		leia (dia)

		//processamento
		resultado = (2020-anoNascimento)*365
		resultado2 = (9-mes)
		resultado3 = (28-dia)
		totalDias = resultado + resultado2 + resultado3
		

		escreva ("A minha idade em dias é: "+totalDias)

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 321; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */