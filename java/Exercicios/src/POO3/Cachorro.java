package POO3;

public class Cachorro extends Animal {
	
	private String som = "AUAUAUAUAUA";
	
	
	
	public Cachorro () {
		super();
	}
	
	public Cachorro(String nome, int anoNascimento, String som) {
	super(nome, anoNascimento);
	this.som = som;
	}





	public String getSom() {
		return som;
	}


	public void setSom(String som) {
		this.som = som;
	}


	public String emitirSom () {
		
		return super.emitiSom()+som;
	}
		
		
	
}



