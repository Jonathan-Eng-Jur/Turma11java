package POO3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Estoque {
/*
 * Crie uma um programa para trabalhar com estoque de uma loja, o programa dever� trabalhar com 
 * Collection do tipo List do Java para manipular os dados desse estoque, o programa dever� atender
 * as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
 */	public static void main (String args[]){
	//Armazenar dados da List
	List<String> estoque = new ArrayList();
		estoque.add("Camisa D&G");
		estoque.add("Cal�a D&G");
		estoque.add("Sapato D&G");
		estoque.add("Camisa C&A");
		estoque.add("Cal�a C&A");
		estoque.add("Sapato C&A");
	
	//imprimindo o estoque	
	System.out.println("Estoque Inicial: \n"+estoque);
	
	//removendo itens do estoque - Remover dados da list;
	estoque.remove("Cal�a D&G"); //REMOVE
	estoque.remove("Cal�a C&A");
	
	System.out.println("\nAtualiza��o do Estoque: \n"+estoque+"\n");
	
	
	//Apresentar todos os dados da list.
	for (String estoq : estoque) {
		System.out.println("Estoque - produto: "+estoq);
	}
	
	
	/*Collection<String> estoque2 = Arrays.asList("Cinto", "Bota");
	estoque.addAll(estoque2);
	System.out.println("Estoque Atualizado: "+estoque);
	*/
	
	
	
	/*VERIFICA��O SE CONT�M O OBJETO "SAPATO" - RETORNA VERDADEIRO OU FALSE
	 * System.out.println("Cont�m no estoque o produoto Sapato?"+estoque.contains("Sapato"));
	
	*/
	
	/*LIMPAR ESTOQUE
	 * estoque.clear(); LIMPA
	System.out.println("Lista: "+estoque); EXIBIR
	*/
	
	
	/* REMOVENDO OBJETO DA LISTA
	 * estoque.remove("Camisa"); REMOVE
	System.out.println("Lista: "+estoque); IMPRIMI
	*/
	
	
	
	/*
	 * VERIFICA��O SE A LISTA EST� VAZIA
	 * if (estoque.isEmpty())
	{ System.out.println("Estoque vazio.");}
	else {
		System.out.println("Lista: "+estoque);
	}
	*/
	
	
	
	
	
}
	
	
}
