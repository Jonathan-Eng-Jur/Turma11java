package POO2;

import java.util.Scanner;

public class Cliente2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		//INSTANCIAR - OBJETO 01
		Clientes2 cliente1 = new Clientes2("Jonathan");
		//INSTANCIAR - OBJETO 02
		Clientes2 cliente2 = new Clientes2("Juliana", 'M');
		//INSTANCIAR - OBJETO 03
		Clientes2 cliente3 = new Clientes2("Zaine", 'F', 1991);
		
						
		System.out.println("Digite o nome do Usuário: ");
		cliente1.nome= leia.next();//MUDAR O NOME ATRIBUÍDO
		
		//busca o nome
		System.out.println(cliente1.nome);
		System.out.println(cliente3.nome);
		
		System.out.println (cliente3.idade()+" "+cliente3.nome+" "+cliente3.sexo);
		

	}

}
