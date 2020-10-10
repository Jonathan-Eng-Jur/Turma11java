package exemplosAulaVetoresMatriz;

import java.util.Arrays;
import java.util.Scanner;

public class exemploNotas {

	public static void main(String[] args) {

	Scanner leia= new Scanner(System.in);
	String alunos[] = {"Bruna dos Santos","BRUNO CORREIA DA COSTA","BRUNO DE FREITAS SOUSA","Carla Cristina Conceição de Paula","Christian Garcia Amantino","Cleiton Ortega dos Santos","Debora Miranda Carmona","Everton Luiz Rosário de Oliveira","GABRIEL REIS RITTER","Gildenor Junior da Silva Costa","Guilherme Marcionilo Pedroso do Rosario Silva","Herick Willians Canhete Rocha","Jacqueline Alves Barbosa","João Victor dos Santos Rigoleto","Jonas De Oliveira Santos","JONATHAN CAVALCANTI DE PAULA","Juliana Cavalaro de Oliveira","Karina Soares Lima","Larissa Meira Dominguez","Leonardo Iamur Terra","Lysandro Andrade Martin","Matheus Araujo de moraes","Matheus Fernandes Rodrigues","Matheus Trindade Torok","Mônica dos santos ribeiro","Natália Lopes moreno","Phelipe Almeida de Souza","Rafaela de Albuquerque","Ricardo Martins Corrêa","SARAH LIDIA DE OLIVEIRA BRAIA","Stefanie Dias Costa","Tiago Diniz Gomes","Victor Augusto de Souza Tavares","Vivian Rodrigues Nakano","Washington pereira dos santos","Wellington Vieira","Wesley Bueno da Silva","Yago Tonoli Domingues","Zaine de Queiros Jesus"};
	int continua = 1;
	int contador=1;
	int codigos [] = new int [alunos.length];
	
	int notas=0;
	
	
	do {
	for (int x =0;x<alunos.length;x++)
	{
	System.out.printf("\nO aluno %s - cod: %d.", alunos[x], x);
	
	}
	
	
	System.out.println("\nDiga qual o anulo quer rever as notas?");
	codigos = leia.next().toUpperCase().charAt(0);
	contador++;
	Arrays.binarySearch(alunos, codigos);
	leia.nextInt();
	
	} while(continua == 'S');
	
	
	
	

}
	
}
