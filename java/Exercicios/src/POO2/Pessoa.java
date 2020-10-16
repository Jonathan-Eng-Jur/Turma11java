package POO2;
/*1. Cria uma Classe Pessoa, contendo os atributos encapsulados, 
 * com seus respectivos seletores (getters) e modificadores (setters), 
 * e ainda o construtor padrão e pelo menos mais duas opções de construtores 
 * conforme sua percepção. Atributos: String nome; String endereço; String telefone; 
 */
public class Pessoa {//NOME DA CLASSE
	//ATRIBUTOS - PRIVATE PARA ENCAPSULAR
	private String nome;  
	private String endereço;
	private String telefone;
	
	//CONSTRUTOR PADRÃO - public Pessoa ()  { }
	// CONTRUTOR REPETE O NOME DA CLASSE
	public Pessoa ()  { } //CONTRUTOR 01

	public Pessoa(String nome) {//CONTRUTOR 02
		
		this.nome = nome;
	}

	public Pessoa(String nome, String endereço) {//CONTRUTOR 03
	//THIS - DIFERENCIA O QUE É CLASSE, COM O DO PROGRAMA
		this.nome = nome;
		this.endereço = endereço;
	}

	//GET E SET
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
