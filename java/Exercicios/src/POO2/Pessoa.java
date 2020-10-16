package POO2;
/*1. Cria uma Classe Pessoa, contendo os atributos encapsulados, 
 * com seus respectivos seletores (getters) e modificadores (setters), 
 * e ainda o construtor padr�o e pelo menos mais duas op��es de construtores 
 * conforme sua percep��o. Atributos: String nome; String endere�o; String telefone; 
 */
public class Pessoa {//NOME DA CLASSE
	//ATRIBUTOS - PRIVATE PARA ENCAPSULAR
	private String nome;  
	private String endere�o;
	private String telefone;
	
	//CONSTRUTOR PADR�O - public Pessoa ()  { }
	// CONTRUTOR REPETE O NOME DA CLASSE
	public Pessoa ()  { } //CONTRUTOR 01

	public Pessoa(String nome) {//CONTRUTOR 02
		
		this.nome = nome;
	}

	public Pessoa(String nome, String endere�o) {//CONTRUTOR 03
	//THIS - DIFERENCIA O QUE � CLASSE, COM O DO PROGRAMA
		this.nome = nome;
		this.endere�o = endere�o;
	}

	//GET E SET
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
