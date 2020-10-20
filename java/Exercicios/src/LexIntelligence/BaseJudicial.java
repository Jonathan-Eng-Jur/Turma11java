package LexIntelligence;

import java.util.Scanner;

//CLASSE MATRIZ
public class BaseJudicial {
	
	//ATRIBUTOS -  BASE DO SISTEMA - RAIZ
	private String nome; //NOME DO SOLICITANTE
	private String parte; // VERIFICAR SE � PARTE (PESSOA F�SICA) OU EMPRESA (PESSOA JUR�DICA);
	private String numProcesso = "1000221-63.2020.8.26.0228"; //N�MERO DO PROCESSO, SEGUNDO OS PAD�RES DO CNJ, CASO TENHA PROCESSO EM ANDAMENTO - COLOCAR PADR�ES PARA ACEITA��O DE CARACTERES
	private String classe; //JEC - JU�ZADO ESPECIAL C�VEL OU JC - JUSTI�A COMUM;
	private String assunto; //ex: INDENIZA��O, RESTITUI��O, DIREITO DE FAM�LIA;
	private String foro;//USAR A PADRONIZA��O DO TJSP/ PARA OS F�RUNS REGIONAIS;
	private int vara; // QUANDO TIVER PROCESSO EM ANDAMENTO;
	private String chances; // TERMOS UTILIZADO PARA VERIFICAR A CHANCES DE GANHO OU PERDA DA CAUSA: P-PROV�VEL, V-VI�VEL, R-REMOTO;
	private String chanc;
	Scanner leia = new Scanner(System.in);
	
	//CONSTRUTOR PADR�O:
	public BaseJudicial() {}

	// CONSTRUTOR - PARA QUANDO N�O TIVER PROCESSO EM ANDAMENTO:
	public BaseJudicial(String nome, String parte, String classe, String assunto, String foro, String chances) {
		super();
		this.nome = nome;
		this.parte = parte;
		this.classe = classe;
		this.assunto = assunto;
		this.foro = foro;
		this.chances = chances;
	}

	//CONSTRUTOR - PARA QUANDO TIVER UM PROCESSO EM ANDAMENTO
	public BaseJudicial(String nome, String parte, String numProcesso, String classe, String assunto, String foro, int vara,
			String chances) {
		super();
		this.nome = nome;
		this.parte = parte;
		this.numProcesso = numProcesso;
		this.classe = classe;
		this.assunto = assunto;
		this.foro = foro;
		this.vara = vara;
		this.chances = chances;
	}
				
	//M�TODOS
	//public String resultado () {
		 
		//do { 
			
			//if (chances=='P'){ 
				//System.out.println("Com essas informa��es, nosso sistema considera este caso como Prov�vel.\nObs: Lembrado que de acordo com a legislal��o brasileira os Magistrados tem o poder do livre convencimento, podendo julgar de forma diversa a depender das provas, altera��o de Jurisprid�ncia e curso do processo.");
			
			//} else if (chances=='V'){ 
				//System.out.println("Com essas informa��es, nosso sistema considera este caso como Vi�vel.\nObs: Lembrado que de acordo com a legislal��o brasileira os Magistrados tem o poder do livre convencimento, podendo julgar de forma diversa a depender das provas, altera��o de Jurisprid�ncia e curso do processo.");
				
	//		} else if (chances=='R'){ 
		//		System.out.println("Com essas informa��es, nosso sistema considera este caso como Remoto.\nObs: Lembrado que de acordo com a legislal��o brasileira os Magistrados tem o poder do livre convencimento, podendo julgar de forma diversa a depender das provas, altera��o de Jurisprid�ncia e curso do processo.");
				
	//		} else { 
		//		System.out.println("Op��o inv�lida no momento, tente novamente");			
		//	} 
	//	}while (chances !='P' && chances !='V' && chances !='R');
		
	//	System.out.println("ObrigadxX");
		
	//	return chanc;
				
	 // }
	 
	 
	 
	//GETERS E SETTERS
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setParte(String parte) {
		this.parte = parte;
	}

	public void setNumProcesso(String numProcesso) {
		this.numProcesso = numProcesso;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public void setForo(String foro) {
		this.foro = foro;
	}

	public void setVara(int vara) {
		this.vara = vara;
	}

	public void setChances(String chances) {
		this.chances = chances;
	}

	public void setChanc(String chanc) {
		this.chanc = chanc;
	}

	public void setLeia(Scanner leia) {
		this.leia = leia;
	}
	 
	


} //CLASSE