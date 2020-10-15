package POO11;
//1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as informações deste objeto no console.

public class Clientes {
	
	public  String nome;
	public String sexo;
	public String email;
	public String idade;
	
	
	
	public Clientes (String nomeCliente, String idadeCliente, String emailCliente, String sexoCliente) {
		
		nome = nomeCliente;
		idade = idadeCliente;
		email = emailCliente;
		sexo = sexoCliente;
	}
	
	public void Exibir()
	{
		System.out.printf("Dados do cliente: \nNome: %s\nSexo: %s \nIdade: %s \nEmail: %s\n ", nome, sexo, idade, email );
	}

}
