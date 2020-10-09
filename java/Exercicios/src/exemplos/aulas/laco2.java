package exemplos.aulas;

import java.util.Scanner;

public class laco2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador=1;
		char opc ='S';
				
		Scanner leia = new Scanner(System.in);
		
		do
		{System.out.println(contador);
		System.out.println("Continua Sim ou Não: ");
		opc = leia.next().toUpperCase().charAt(0);
		
		contador=contador+10; // ou contador++//
		
		}while (opc =='S');
		
		
	}

}
