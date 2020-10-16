package POO2;

public class Clientes2 {
	
//ATRIBUTOS- informação do cliente 
	
	public String nome;
	public char sexo;
	public int anoNascimento;
	public char tipo;
	
	
	
	//CONTRUTOR - TE OBRIGA PARA CRIAR O OBJETO DEVE CUMPRIR AS REGRAS, NESTE CASO ESPERA UMA STRING - NOME - 
	public Clientes2(String nome) {
	     //NOME CLASSE
		this.nome = nome;
	}



	//SOBRECARGA - DO CONSTRUTOR
	
	public Clientes2(String nome, char sexo) {
		 //NOME CLASSE
		this.nome = nome;
		this.sexo = sexo;
	}


	//SOBRECARGA - DO CONSTRUTOR
	public Clientes2(String nome, char sexo, int anoNascimento) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.anoNascimento = anoNascimento;
	}
	
	//METODO = funçao mas dentro de uma classe
	
	public int idade() {
		return 2020 - anoNascimento;		
		
	}
	
	
	
	
	
	
	
	
	//métodos - tudo que o cliente faz - ex: bom dia Sra. ou Sr. ou Outros.

}
