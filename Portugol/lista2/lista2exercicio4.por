programa
{
	/*
	 * Faça um sistema que leia um número inteiro e mostre uma mensagem 
	 * indicando se este número é par ou ímpar, 
	 * e se é positivo ou negativo.
	 * PAR OU IMPAR SÓ PARA POSITIVO
	 * NEGATIVO MENOR QUE 0 ZERO
	 * ZERO É PAR	 
	 * VARIAVEL - NUMERO INTEIRO 
	 * 
	 */
	funcao inicio()
	{
	inteiro valorUsuario

	escreva("Digite um valor: ")
	leia(valorUsuario)

	se (valorUsuario > 0)
	{se ((valorUsuario % 2) ==0)
		escreva("O valor é positivo e par")
	} senao { escreva("O valor é negativo e impar")
	}

	se (valorUsuario < 0)
	{se ((valorUsuario % 2) ==0)
		escreva("O valor é negativo e par")
	} senao { escreva("O valor é negativo e impar")
	}

	senao {
	escreva ("Você digitou 0, e zero é par!!")
		
	}
}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 667; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */