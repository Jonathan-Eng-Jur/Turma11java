package POO11;

public class Avioes {
	
	String companhia;
	String modelo;
	String aeroporto;
	double distanciaAero;
	
	void viagem (double percurso)
	{if (distanciaAero <=0);
	{System.out.println("Avi�o estacionado...");}
	if (distanciaAero>0 && distanciaAero<1000)
	{System.out.println("Viagem nacional");
	}if (distanciaAero>1000 && distanciaAero<2000)
	{System.out.println("Viagem na Am�rica");
	}if (distanciaAero>2000)
	{System.out.println("Viagem Internacional");
	}		
		
	}
	
	
	
	
	
	
	

}
