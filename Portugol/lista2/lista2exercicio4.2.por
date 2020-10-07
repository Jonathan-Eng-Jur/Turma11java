programa
{
	
	funcao inicio()
	{
		inteiro valor
		escreva("Valor :")
		leia(valor)

	se  ( valor==0 ou (valor>0) e ((valor %2) ==0) ) {
		escreva("O valor é positivo e par.")
	}
	senao se  ( (valor<0) e ((valor %2) ==0) ) {
		escreva("O valor é negativo e par.")
	
	}
	se  ( (valor>0) e ((valor %2) != 0) ) {
		escreva("O valor é positivo e impar.")
	}
	senao se  ( (valor<0) e (valor %2) != 0 ) {
		escreva("O valor é negativo e impar.")	

	}
	


	
}


}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 446; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */