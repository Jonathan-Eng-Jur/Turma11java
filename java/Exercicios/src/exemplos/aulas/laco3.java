package exemplos.aulas;

import java.util.Scanner;

public class laco3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner leia = new Scanner(System.in);
	
	char opc ='S';
		
	int numero=1;
	
	while (opc=='S') { // primeiro pergunta depois executa
		System.out.println(numero++);
		System.out.println("Continua Sim ou Não: ");
		opc= leia.next().toUpperCase().charAt(0);
	}
	
	System.out.println("Fim de programa");
	
	leia.close();
	}

}
