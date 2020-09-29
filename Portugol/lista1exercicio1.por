programa
{
	//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 

	funcao inicio()
	{
		inteiro anos
		inteiro meses 
		inteiro dia
		inteiro idade
		inteiro totalDias=0
//modo de preparo
		escreva("Quantos anos voce tem")
		leia (anos)
		escreva("Diga quantos meses?")
		leia (meses)
		escreva("Diga quantos dias")
		leia (dia)

		//processamento
		totalDias = ( (anos*365) + (meses*30) + dia )
			
		
		

		escreva ("A idade em dias é: "+totalDias)

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 495; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */