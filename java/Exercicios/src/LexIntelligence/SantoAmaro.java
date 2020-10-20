package LexIntelligence;

import javax.swing.JOptionPane;

public class SantoAmaro extends BaseJudicial {
	

	//ATRIBUTOS
	public String juizo;
			
	
	//CONSTRUTORES
	public SantoAmaro () { }
	
	 public SantoAmaro(String nome, String parte, String classe, String assunto, String foro, String chances) {
		super(nome, parte, classe, assunto, foro, chances);
	
	}
	
	public SantoAmaro(String nome, String parte, String numProcesso, String classe, String assunto, String foro, int vara, String chances) {
		super(nome, parte, numProcesso, classe, assunto, foro, vara, chances);
	
	}
	
	
	//METODOS
	public void resultado (String parte, String foro) {
	
		
		if ( parte.equals("F") && foro.equals("2")){ 
			JOptionPane.showMessageDialog(null,"Com essas informações, nosso sistema considera este caso como PROVÁVEL.\nObs: Lembrado que de acordo com a legislalção brasileira os Magistrados tem o poder do livre convencimento, \npodendo julgar de forma diversa a depender das provas, alteração de Jurispridência e o curso do processo.\nEntre em contato pelo link: www.lex.com/br ou Whatsapp (11) 9 9988-7766;\nObrigadxX!!");
		}else { 
			JOptionPane.showMessageDialog(null,"Com essas informações, nosso sistema considera este caso como REMOTA.\nObs: Lembrado que de acordo com a legislalção brasileira os Magistrados tem o poder do livre convencimento, \npodendo julgar de forma diversa a depender das provas, alteração de Jurispridência e o curso do processo.\nEntre em contato pelo link: www.lex.com/br ou Whatsapp (11) 9 9988-7766;\nObrigadxX!!");
		}
				
		
						
	}
}