package POO3;

public class Cavalo extends Animal {

	
	private String som = "Ahiin-in-in-hinir";

	
		
	public Cavalo () {
		super();
	}
	
	public Cavalo(String nome, int anoNascimento, String som) {
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
