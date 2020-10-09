package lista3Java;

public class Exercicio2Lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. 
 */		int x;
		System.out.println("Os números são: ");
		for (x=1;x<=10;x++)
		{
		if (x%2 == 0){
		System.out.printf("\n%d é um numero Par!",x);
		}
		else{
		System.out.printf("\n%d é um numero Impar!",x);
		}
			
		}
						
	}

}
