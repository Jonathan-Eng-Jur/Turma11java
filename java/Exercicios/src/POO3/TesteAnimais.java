package POO3;

import POO1.Empregado;
import POO1.Terceiro;

public class TesteAnimais {

	public static void main(String[] args) {
		/*
		Empregado isaura = new Empregado ("Isaura", 10, 50.45);
//(String nome, int horas, double valorHora, double adicional)		
		Terceiro let = new Terceiro ("Leticia", 10, 50.45, 50.55);
		
		System.out.println("Pagamentos");
		System.out.println(isaura.getNome()+"\nVocê recebe R$ "+isaura.pagamento());
		System.out.println(let.getNome()+"\nVocê recebe R$ "+let.pagamento()); //pagamento diferenciado
		 */
                            //(String nome, int anoNascimento, String som) 
		Cachorro rex = new Cachorro ("Rex", 1993, "UAUAUAUAuuuuuu...");
		Cavalo troia = new Cavalo ("Troia", 1990, "Ahiin-in-in-hinir...");
		Preguica jaiminho = new Preguica ("Jaiminho", 1970, "ZzZzZzZZzz...");
		
		System.out.println("Nome Animal: "+rex.getNome()+" - "+rex.emitirSom());
		System.out.println("Nome Animal: "+troia.getNome()+" - "+troia.emitirSom());
		System.out.println("Nome Animal: "+jaiminho.getNome()+" - "+jaiminho.emitirSom());
	}

}
