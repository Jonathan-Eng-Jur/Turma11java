package POO3;

public class Preguica extends Animal {
	
	private String som = "ZzZzZzZZzz";
	
		

	public Preguica () {
		super();
	}
	
	
public Preguica(String nome, int anoNascimento, String som) {
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
