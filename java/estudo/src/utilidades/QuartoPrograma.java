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
		
		
		System.out.println("Escreva o nome do usuário: ");
		nome = tec.next();
		
		System.out.print("Escreva o ano de Nascimento"); // rpintLN pula linha
		ano=tec.nextInt(); // ler números
		System.out.print(nome); // print não pula linha
		System.out.print("Escreva o seu salário: ");
		salario= tec.nextDouble();
		idade=(2020-ano);
		System.out.printf("Olá %s, sua idade é %d em anos e seu salário %.2f", nome, idade, salario);
		
		

	}

}
