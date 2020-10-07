package utilidades;

public class TerceiroPrograma {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int valor=10; // tipo de dados
		String nome="AULA de JAVA"; //tipo de classe letra Maíscula 
		char opcao= 'X';
		double salario= 1000.01;
		
		
		System.out.print("Exemplo do print\n");
		System.out.println("R$ "+salario);
		System.out.printf("Nome de usuário: %s e salario: %.0f com acrescimo de 10%%", nome, (salario+(salario*0.1)));
		
	}

}
