programa
{
	
	funcao inicio()
	{
		 /*
		  *  Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos

		  */

		cadeia nomeUsuario
		caracter opcao
		inteiro idade
		
		
		escreva("Digite a sua idade: ")
		leia(idade)
        
			
		se (idade >= 18)
		{ escreva ("Com sua idade de", idade, "Sua categoria é Adulto")
		}
				
		senao se (idade 5>= <=7){
			escreva("Com sua idade de", idade, "Sua categoria é Infantil A") 
		}
				
		senao se (idade 8>= <=11){
			escreva(("Com sua idade de", idade, "Sua categoria é Infantil B")
		}
				
		senao se (idade 12>= <=13){
			escreva(("Com sua idade de", idade, "Sua categoria é Juvenil A") 
		}
				
		senao se (idade 14>= <=17){
			escreva(("Com sua idade de", idade, "Sua categoria é Juvenil B")
		}
				
		senao se (idade <= 4){
			escreva(("Com sua idade de", idade, "Você não tem categoria.")
		
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