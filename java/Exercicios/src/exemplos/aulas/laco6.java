package exemplos.aulas;

import java.util.Scanner;

public class laco6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int a=0,b=0;
		System.out.println("LEIA A:");
		a = leia.nextInt();
		System.out.println("LEIA B:");
		b = leia.nextInt();
		System.out.printf("VALORES ANTES DA INVERSÃO A: %d B: %d",a,b);
		a = a+b;
		b = a-b;
		a= a-b;
		
		//x= x10 + y20=30
		//y= x30 - y20 = 10 
		//x= x30 - y-10=20

		
		System.out.println();
		System.out.printf("VALORES APÓS A INVERSÃO A: %d B: %d",a,b);
		leia.close();

	}

}
