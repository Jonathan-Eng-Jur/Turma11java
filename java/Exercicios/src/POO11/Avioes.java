package POO11;

public class Avioes {
	
	String companhia;
	String modelo;
	String aeroporto;
	double distanciaAero;
	
	void viagem (double percurso)
	{if (distanciaAero <=0);
	{System.out.println("Avião estacionado...");}
	if (distanciaAero>0 && distanciaAero<1000)
	{System.out.println("Viagem nacional");
	}if (distanciaAero>1000 && distanciaAero<2000)
	{System.out.println("Viagem na América");
	}if (distanciaAero>2000)
	{System.out.println("Viagem Internacional");
	}		
		
	}
	
	
	
	
	
	
	

}
