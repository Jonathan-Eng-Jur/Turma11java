package POO3;
/*
 * Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e 
 * comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as 
 * características de forma que tudo o que for comum a todos os animais fique na classe Animal: 

 */
public class Animal {
	//atributos
	private String nome;
	private int anoNascimento;
	
	
	//construtor
	public Animal() {
		
	}

	public Animal(String nome, int anoNascimento) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		
	}


	//encapsulamento
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getAnoNascimento() {
		return anoNascimento;
	}


	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	
	//método
	
	public String emitiSom () {
		
		return "Som: ";
	}
	
	
		
	
	
}
