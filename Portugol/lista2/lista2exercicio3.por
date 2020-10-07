programa
{
	/*
	 * Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
	4 variáveis
	Quadrado = variavel*variavel
     se variavel3*variavel3 >= 1000 - imprima e finalize
     senao for 
     imprima valor1, valor2, valor3, valor 4 e valor1*valor1, valor2*valor2, valor3*valor3,valor4*valor4 

	
	 */
	funcao inicio()
	{
		//variaveis

		inteiro valor1=0
		inteiro valor2=0
		inteiro valor3=0
		inteiro valor4=0
		inteiro quadrado1=0
		inteiro quadrado2=0
		inteiro quadrado3=0
		inteiro quadrado4=0

		escreva("Digite o valor1: ")
		leia(valor1)
		escreva("Digite o valor2: ")
		leia(valor2)
		escreva("Digite o valor3: ")
		leia(valor3)
		escreva("Digite o valor4: ")
		leia(valor4)

//calculo

		quadrado1 = valor1*valor1
		quadrado2 = valor2*valor2
		quadrado3 = valor3*valor3
		quadrado4 = valor4*valor4


		se (quadrado3 >= 1000)
		{
			escreva("O valor do 3 numero é ", valor3, " e seu quadrado é", quadrado3)
		}
		senao {
			escreva("\nvalor1, ", valor1, " seu quadrado é ", quadrado1)
			escreva("\nvalor2, ", valor2, " seu quadrado é ", quadrado2)
			escreva("\nvalor3, ", valor3, " seu quadrado é ", quadrado3)
			escreva("\nvalor4, ", valor4, " seu quadrado é ", quadrado4)

		
		}

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 552; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */