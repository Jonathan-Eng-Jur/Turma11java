package exemplos.aulas;

import java.util.Scanner;

public class tenario1 {

	public static void main(String[] args) {
		
		String nomeAluno;
		char sexoAluno; // M - Masculino e F- Feminino
		int nota;
		String mensagem;
		Scanner leia = new Scanner (System.in);
		
		
		
		
		System.out.println("Nome: ");
		nomeAluno = leia.next().toUpperCase();
		System.out.println("Digite o sexo - M - Masculino ou F - Feminino: ");
		sexoAluno = leia.next().toUpperCase().charAt(0);
		System.out.println("Digite sua nota: ");
		nota = leia.nextInt();
		
		System.out.println("------------DADOS DO ALUNO------------");
		System.out.println();
		
		
		if(sexoAluno=='M') {
			System.out.printf("Ol� prezad aluno %s, obrigado pelo acesso!!!", nomeAluno);
		}else if (sexoAluno=='F')	{
				
		System.out.printf("Ol� prezada aluna %s, obrigado pelo acesso!!!", nomeAluno);
		}
		else {
			System.out.println("Voc� n�o escolheu M ou F !!!");
			}
		            // (condi��o (xxxxxxxxxxxx)?verdadeira/responde : falso /responde esse"
		
		mensagem = ((nota < 5) && (sexoAluno=='M'))? "Reprovado" : "Aprovado";
		mensagem = ((nota < 5) && (sexoAluno=='F'))? "Reprovada" : "Aprovada";
		
		System.out.printf("Oi %s voc� est� %s.", nomeAluno, mensagem);
		
		
		
		 
		
		
		}

}
