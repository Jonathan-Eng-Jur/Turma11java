package utilidades;

import java.util.Scanner;

public class QuartoPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// criar um teclado no programa
		Scanner tec = new Scanner(System.in); //criou o teclado
		
		String nome; //%s
		int ano, idade=0;//%d
		double salario; //%2f
		
		
		System.out.println("Escreva o nome do usu�rio: ");
		nome = tec.next();
		
		System.out.print("Escreva o ano de Nascimento"); // rpintLN pula linha
		ano=tec.nextInt(); // ler n�meros
		System.out.print(nome); // print n�o pula linha
		System.out.print("Escreva o seu sal�rio: ");
		salario= tec.nextDouble();
		idade=(2020-ano);
		System.out.printf("Ol� %s, sua idade � %d em anos e seu sal�rio %.2f", nome, idade, salario);
		
		

	}

}
