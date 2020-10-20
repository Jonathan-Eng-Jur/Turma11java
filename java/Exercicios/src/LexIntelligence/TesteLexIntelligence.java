package LexIntelligence;

import javax.swing.JOptionPane;

public class TesteLexIntelligence {

public static void main(String[] args) {		
		
		///MENSAGEM DE BOAS VINDAS PARA O USUÁRIO
		JOptionPane.showMessageDialog(null, "Bem vindX a Lex Intelligence:\r\n\n"
				+ ".##...................########........##.....##.\r\n"
				+ ".##...................##.....................##...##..\r\n"
				+ ".##...................##.....................##.##...\r\n"
				+ ".##...................######..............###.....\r\n"
				+ ".##...................##.....................##.##...\r\n"
				+ ".##...................##....................##...##..\r\n"
				+ ".########.......########.......##.....##.\r\n"
				+ "\n            Bora começar!!");
		
		//PRIMEIRO CONTATO COM O USUÁRIO
		String nomePessoa  = JOptionPane.showInputDialog("Digite o nome da parte: ");				
		String tipoPessoa  = JOptionPane.showInputDialog("Tipo pessoa: \nF-Pessoa Fisica \nJ-Pessoa Juridica").toUpperCase();
		
		//VALIDANDO O TIPO DA PESSOA
		do {
			if(tipoPessoa.equals("F") || tipoPessoa.equals("J")){				
			}else {
				JOptionPane.showMessageDialog(null, "Tipo de pessoa " + tipoPessoa + " é inválido. Por favor, digite novamente!");				
				tipoPessoa  = JOptionPane.showInputDialog("Tipo pessoa: \nF-Pessoa Fisica \nJ-Pessoa Juridica").toUpperCase();
			}
			
		}while(!tipoPessoa.equals("F") && !tipoPessoa.equals("J"));
		
		
		//VALIDANDO O PODER JUDICIÁRIO
			
		String tribunal = JOptionPane.showInputDialog("\nPor gentileza, informe qual órgão ou segmento do Poder Judiciário:\n1 – Supremo Tribunal Federal;\n2 – Conselho Nacional de Justiça;\n3 – Superior Tribunal de Justiça;\n4 - Justiça Federal;\n5 - Justiça do Trabalho;\n6- Justiça Eleitoral;\n7 - Justiça Militar da União;\n8- Justiça dos Estados e do Distrito Federal e Territórios;\n9 - Justiça Militar Estadual.\n").toUpperCase();
		
		do {
			if ( tribunal.equals("8") )
			 {
				
			}else if (tribunal.equals("1") || tribunal.equals("2") || tribunal.equals("3") || tribunal.equals("4") || tribunal.equals("5")|| tribunal.equals("6") || tribunal.equals("7") || tribunal.equals("9")){ 
				JOptionPane.showMessageDialog(null, "Este órgão ou segmento do Poder Judiciário: " + tribunal+ " é inválido.\nNo momento este módulo ainda está em desenvolvimento.\nPor favor, digite novamente!");
				tribunal = JOptionPane.showInputDialog("\nPor gentileza, informe qual órgão ou segmento do Poder Judiciário:\n1 – Supremo Tribunal Federal;\n2 – Conselho Nacional de Justiça;\n3 – Superior Tribunal de Justiça;\n4 - Justiça Federal;\n5 - Justiça do Trabalho;\n6- Justiça Eleitoral;\n7 - Justiça Militar da União;\n8- Justiça dos Estados e do Distrito Federal e Territórios;\n9 - Justiça Militar Estadual.\n").toUpperCase();
			} 
			else {JOptionPane.showMessageDialog(null, "Este órgão ou segmento do Poder Judiciário: " + tribunal+ " é inválido.\nPor favor, digite novamente!");
				tribunal = JOptionPane.showInputDialog("\nPor gentileza, informe qual órgão ou segmento do Poder Judiciário:\n1 – Supremo Tribunal Federal;\n2 – Conselho Nacional de Justiça;\n3 – Superior Tribunal de Justiça;\n4 - Justiça Federal;\n5 - Justiça do Trabalho;\n6- Justiça Eleitoral;\n7 - Justiça Militar da União;\n8- Justiça dos Estados e do Distrito Federal e Territórios;\n9 - Justiça Militar Estadual.\n").toUpperCase();
				
			}
			
		}while (!tribunal.equals("8")); 
		
		
		//VALIDANDO TRIBUNAL POR ESTADO
		
		String estado = JOptionPane.showInputDialog("\nPor gentileza, informe a Justiça do Estado ou do Distrito Federal e Territórios: \n1 - Tribunal de Justiça do Acre NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.01.0000 ou 1002-15.2008.8.01;\n2 - Tribunal de Justiça de Alagoas NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.02.0000 ou 100-15.2008.8.023;\n3 - Tribunal de Justiça do Amapá NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.03.0000 ou 100-15.2008.8.03; \n4 - Tribunal de Justiça do Amazonas NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.04.0000 ou 100-15.2008.8.04; \n5 - Tribunal de Justiça da Bahia NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.05.0000 ou 100-15.2008.8.05; \n6 - Tribunal de Justiça do Ceará NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.06.0000 ou 100-15.2008.8.06; \n7 - Tribunal de Justiça do Distrito Federal e Territórios NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.07.0000 ou 100-15.2008.8.07; \n8 - Tribunal de Justiça do Espírito Santo NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.08.0000 ou 100-15.2008.8.08;\n9 - Tribunal de Justiça de Goiás NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.09.0000 ou100-15.2008.8.09; \n10 - Tribunal de Justiça do Maranhão NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.10.0000 ou 100-15.2008.8.10; \n11 - Tribunal de Justiça do Mato Grosso NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.11.0000 ou 100-15.2008.8.11; \n12 - Tribunal de Justiça do Mato Grosso do Sul NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.12.0000 ou 100-15.2008.8.12; \n13 - Tribunal de Justiça de Minas Gerais NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.13.0000 ou 100-15.2008.8.13; \n14 - Tribunal de Justiça do Pará NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.14.0000 ou 100-15.2008.8.14; \n15 - Tribunal de Justiça da Paraíba NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.15.0000 ou 100-15.2008.8.15; \n16 - Tribunal de Justiça do Paraná NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.16.0000 ou 100-15.2008.8.16; \n17 - Tribunal de Justiça do Pernambuco NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.17.0000 ou 100-15.2008.8.17; \n18 - Tribunal de Justiça do Piauí NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.18.0000 ou 100-15.2008.8.18;\n19 - Tribunal de Justiça do Rio de Janeiro NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.19.0000 ou 100-15.2008.8.19; \n20 - Tribunal de Justiça do Rio Grande do Norte NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.20.0000 ou 100-15.2008.8.20; \n21 - Tribunal de Justiça do Rio Grande do Sul NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.21.0000 ou 100-15.2008.8.21;\n22 - Tribunal de Justiça de Rondônia NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.22.0000 ou 100-15.2008.8.22; \n23 - Tribunal de Justiça de Roraima NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.23.0000 ou 100-15.2008.8.23; \n24 - Tribunal de Justiça de Santa Catarina NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.24.0000 ou 100-15.2008.8.24; \n25 - Tribunal de Justiça de Sergipe NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.25.0000 ou 100-15.2008.8.25; \n26 - Tribunal de Justiça de São Paulo NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.26.0000 ou 100-15.2008.8.26; \n27 - Tribunal de Justiça do Tocantins NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.27.0000 ou 100-15.2008.8.27;\n").toUpperCase();
		
		do {
			if ( estado.equals("26") )
			 {
				
			}else if (estado.equals("1") || estado.equals("2") || estado.equals("3") || estado.equals("4") || estado.equals("5")|| estado.equals("6") || estado.equals("7") || estado.equals("8") || estado.equals("9") || estado.equals("10") || estado.equals("11") || estado.equals("12") || estado.equals("13")|| estado.equals("14") || estado.equals("15") || estado.equals("16") || estado.equals("17") || estado.equals("18") || estado.equals("19") || estado.equals("20") || estado.equals("21")|| estado.equals("22") || estado.equals("23") || estado.equals("24") || estado.equals("25") || estado.equals("27")){ 
				JOptionPane.showMessageDialog(null, "\nJustiça do Estado ou do Distrito Federal e Territórios: " + estado+ " é inválida(o).\nNo momento este módulo ainda está em desenvolvimento.\nPor favor, digite novamente!");
				estado = JOptionPane.showInputDialog("\nPor gentileza, informe a Justiça do Estado ou do Distrito Federal e Territórios: \n1 - Tribunal de Justiça do Acre NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.01.0000 ou 1002-15.2008.8.01;\n2 - Tribunal de Justiça de Alagoas NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.02.0000 ou 100-15.2008.8.023;\n3 - Tribunal de Justiça do Amapá NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.03.0000 ou 100-15.2008.8.03; \n4 - Tribunal de Justiça do Amazonas NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.04.0000 ou 100-15.2008.8.04; \n5 - Tribunal de Justiça da Bahia NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.05.0000 ou 100-15.2008.8.05; \n6 - Tribunal de Justiça do Ceará NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.06.0000 ou 100-15.2008.8.06; \n7 - Tribunal de Justiça do Distrito Federal e Territórios NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.07.0000 ou 100-15.2008.8.07; \n8 - Tribunal de Justiça do Espírito Santo NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.08.0000 ou 100-15.2008.8.08;\n9 - Tribunal de Justiça de Goiás NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.09.0000 ou100-15.2008.8.09; \n10 - Tribunal de Justiça do Maranhão NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.10.0000 ou 100-15.2008.8.10; \n11 - Tribunal de Justiça do Mato Grosso NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.11.0000 ou 100-15.2008.8.11; \n12 - Tribunal de Justiça do Mato Grosso do Sul NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.12.0000 ou 100-15.2008.8.12; \n13 - Tribunal de Justiça de Minas Gerais NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.13.0000 ou 100-15.2008.8.13; \n14 - Tribunal de Justiça do Pará NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.14.0000 ou 100-15.2008.8.14; \n15 - Tribunal de Justiça da Paraíba NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.15.0000 ou 100-15.2008.8.15; \n16 - Tribunal de Justiça do Paraná NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.16.0000 ou 100-15.2008.8.16; \n17 - Tribunal de Justiça do Pernambuco NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.17.0000 ou 100-15.2008.8.17; \n18 - Tribunal de Justiça do Piauí NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.18.0000 ou 100-15.2008.8.18;\n19 - Tribunal de Justiça do Rio de Janeiro NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.19.0000 ou 100-15.2008.8.19; \n20 - Tribunal de Justiça do Rio Grande do Norte NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.20.0000 ou 100-15.2008.8.20; \n21 - Tribunal de Justiça do Rio Grande do Sul NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.21.0000 ou 100-15.2008.8.21;\n22 - Tribunal de Justiça de Rondônia NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.22.0000 ou 100-15.2008.8.22; \n23 - Tribunal de Justiça de Roraima NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.23.0000 ou 100-15.2008.8.23; \n24 - Tribunal de Justiça de Santa Catarina NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.24.0000 ou 100-15.2008.8.24; \n25 - Tribunal de Justiça de Sergipe NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.25.0000 ou 100-15.2008.8.25; \n26 - Tribunal de Justiça de São Paulo NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.26.0000 ou 100-15.2008.8.26; \n27 - Tribunal de Justiça do Tocantins NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.27.0000 ou 100-15.2008.8.27;\n").toUpperCase();
			
			} 
			else {JOptionPane.showMessageDialog(null, "Este órgão ou segmento do Poder Judiciário: " + estado+ " é inválido.\nPor favor, digite novamente!");
				estado = JOptionPane.showInputDialog("\nPor gentileza, informe a Justiça do Estado ou do Distrito Federal e Territórios: \n1 - Tribunal de Justiça do Acre NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.01.0000 ou 1002-15.2008.8.01;\n2 - Tribunal de Justiça de Alagoas NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.02.0000 ou 100-15.2008.8.023;\n3 - Tribunal de Justiça do Amapá NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.03.0000 ou 100-15.2008.8.03; \n4 - Tribunal de Justiça do Amazonas NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.04.0000 ou 100-15.2008.8.04; \n5 - Tribunal de Justiça da Bahia NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.05.0000 ou 100-15.2008.8.05; \n6 - Tribunal de Justiça do Ceará NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.06.0000 ou 100-15.2008.8.06; \n7 - Tribunal de Justiça do Distrito Federal e Territórios NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.07.0000 ou 100-15.2008.8.07; \n8 - Tribunal de Justiça do Espírito Santo NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.08.0000 ou 100-15.2008.8.08;\n9 - Tribunal de Justiça de Goiás NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.09.0000 ou100-15.2008.8.09; \n10 - Tribunal de Justiça do Maranhão NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.10.0000 ou 100-15.2008.8.10; \n11 - Tribunal de Justiça do Mato Grosso NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.11.0000 ou 100-15.2008.8.11; \n12 - Tribunal de Justiça do Mato Grosso do Sul NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.12.0000 ou 100-15.2008.8.12; \n13 - Tribunal de Justiça de Minas Gerais NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.13.0000 ou 100-15.2008.8.13; \n14 - Tribunal de Justiça do Pará NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.14.0000 ou 100-15.2008.8.14; \n15 - Tribunal de Justiça da Paraíba NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.15.0000 ou 100-15.2008.8.15; \n16 - Tribunal de Justiça do Paraná NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.16.0000 ou 100-15.2008.8.16; \n17 - Tribunal de Justiça do Pernambuco NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.17.0000 ou 100-15.2008.8.17; \n18 - Tribunal de Justiça do Piauí NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.18.0000 ou 100-15.2008.8.18;\n19 - Tribunal de Justiça do Rio de Janeiro NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.19.0000 ou 100-15.2008.8.19; \n20 - Tribunal de Justiça do Rio Grande do Norte NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.20.0000 ou 100-15.2008.8.20; \n21 - Tribunal de Justiça do Rio Grande do Sul NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.21.0000 ou 100-15.2008.8.21;\n22 - Tribunal de Justiça de Rondônia NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.22.0000 ou 100-15.2008.8.22; \n23 - Tribunal de Justiça de Roraima NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.23.0000 ou 100-15.2008.8.23; \n24 - Tribunal de Justiça de Santa Catarina NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.24.0000 ou 100-15.2008.8.24; \n25 - Tribunal de Justiça de Sergipe NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.25.0000 ou 100-15.2008.8.25; \n26 - Tribunal de Justiça de São Paulo NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.26.0000 ou 100-15.2008.8.26; \n27 - Tribunal de Justiça do Tocantins NNNNNNN-DD.AAAA.J.TR.OOOO 0000100-15.2008.8.27.0000 ou 100-15.2008.8.27;\n").toUpperCase();
			
			}
			
		}while (!estado.equals("26")); 
		
		
		//VALIDANDO A CLASSE PROCESSUAL
		String classeProcessual = JOptionPane.showInputDialog("Informe a classe processual: \nJC-Justiça Comum \nJEC-Juizado Especial Cível;\n\nObs: Os Juizados Especiais Cíveis têm como intuito resolver causas de menor complexidade com\n maior rapidez, buscando, sempre que possível, o acordo entre as partes. São consideradas\n causas cíveis de menor complexidade aquelas cujo valor não exceda a 40 salários mínimos.\nObs2: Nas causas de até 20 salários mínimos não é obrigatória a assistência de advogado;\nnas de valor superior, a assistência é obrigatória.\"" ).toUpperCase();
		
			
				do {
					if(classeProcessual.equals("JC") || classeProcessual.equals("JEC")) {				
						}else {
							JOptionPane.showMessageDialog(null, "Tipo de classe processual " + classeProcessual + " é inválida. Por favor, digite novamente!");
								classeProcessual = JOptionPane.showInputDialog("Informe a classe processual: \nJC-Justiça Comum ou; \nJEC-Juizado Especial Cível;\n\nObs: Os Juizados Especiais Cíveis têm como intuito resolver causas de menor complexidade com\n maior rapidez, buscando, sempre que possível, o acordo entre as partes. São consideradas\n causas cíveis de menor complexidade aquelas cujo valor não exceda a 40 salários mínimos.\nObs2: Nas causas de até 20 salários mínimos não é obrigatória a assistência de advogado;\nnas de valor superior, a assistência é obrigatória.").toUpperCase();				
					}
					
				}while(!classeProcessual.equals("JC") && !classeProcessual.equals("JEC"));
				
		//VALIDANDO TIPO DE ASSUNTO		
		String tipoAssunto1 = JOptionPane.showInputDialog("Informe o tipo de Assunto ?\nExemp: Indenização.").toUpperCase();
				
				do {
					if (tipoAssunto1.equals("INDENIZATORIA") || tipoAssunto1.equals("IDENIZATÓRIA") || tipoAssunto1.equals("INDENIZAÇÃO") || tipoAssunto1.equals("RESTITUIÇÃO") || tipoAssunto1.equals("REEMBOLSO")){
						
					}else { 
						JOptionPane.showMessageDialog(null, "Tipo de Assunto " +tipoAssunto1+ " é inválido. Por favor, digite novamente!");
						tipoAssunto1 = JOptionPane.showInputDialog("Informe o tipo de Assunto ?\nExemp: Indenização.").toUpperCase();
					}	
				}while (!tipoAssunto1.equals("INDENIZATORIA") && !tipoAssunto1.equals("INDENIZATÓRIA") && !tipoAssunto1.equals("INDENIZAÇÃO") && !tipoAssunto1.equals("RESTITUIÇÃO") && !tipoAssunto1.equals("REEMBOLSO")); 
				
		
		
		//VALIDANDO FORO		
		String tipoForo = JOptionPane.showInputDialog("Informe qual o Foro de distribuição da Ação ?\nOpcões:\n0 - FORO CENTRAL – JOÃO MENDES JR.;\n1 - FORO REGIONAL I – SANTANA;\n2 - FORO REGIONAL II - SANTO AMARO;\n3 - FORO REGIONAL III – JABAQUARA;\n4 - FORO REGIONAL IV – LAPA;\n5 - FORO REGIONAL V - SÃO MIGUEL PAULISTA;\n6 - FORO REGIONAL VI - PENHA DE FRANÇA;\n7 - FORO REGIONAL VII – ITAQUERA;\n8 - FORO REGIONAL VIII – TATUAPÉ;\n9 - FORO REGIONAL IX - VILA PRUDENTE;\n10 - FORO REGIONAL X – IPIRANGA;\n11 - FORO REGIONAL XI – PINHEIROS;\n12 - FORO REGIONAL XII – NOSSA SENHORA DO Ó;\nDúvidas sobre a competência acesse: https://www.tjsp.jus.br/app/CompetenciaTerritorial ;").toUpperCase();
		
		do {
			if (tipoForo.equals("0") ||tipoForo.equals("1") || tipoForo.equals("2") || tipoForo.equals("3") || tipoForo.equals("4") || tipoForo.equals("5")|| tipoForo.equals("6") || tipoForo.equals("7") || tipoForo.equals("8") || tipoForo.equals("9")|| tipoForo.equals("10") || tipoForo.equals("11") || tipoForo.equals("12"))
			 {
				
			}else { 
				JOptionPane.showMessageDialog(null, "Este Foro - " + tipoForo + " é inválido. Por favor, digite novamente!");
					tipoForo= JOptionPane.showInputDialog("Informe qual o Foro de distribuição da Ação ?\nOpcões:\n0 - FORO CENTRAL – JOÃO MENDES JR.;\n1 - FORO REGIONAL I – SANTANA;\n2 - FORO REGIONAL II - SANTO AMARO;\n3 - FORO REGIONAL III – JABAQUARA;\n4 - FORO REGIONAL IV – LAPA;\n5 - FORO REGIONAL V - SÃO MIGUEL PAULISTA;\n6 - FORO REGIONAL VI - PENHA DE FRANÇA;\n7 - FORO REGIONAL VII – ITAQUERA;\n8 - FORO REGIONAL VIII – TATUAPÉ;\n9 - FORO REGIONAL IX - VILA PRUDENTE;\n10 - FORO REGIONAL X – IPIRANGA;\n11 - FORO REGIONAL XI – PINHEIROS;\n12 - FORO REGIONAL XII – NOSSA SENHORA DO Ó;\nDúvidas sobre a competência acesse: https://www.tjsp.jus.br/app/CompetenciaTerritorial ;").toUpperCase();
			}	
			
		}while (!tipoForo.equals("0") && !tipoForo.equals("1") && !tipoForo.equals("2") && !tipoForo.equals("3") && !tipoForo.equals("4") && !tipoForo.equals("5") && !tipoForo.equals("6") && !tipoForo.equals("7") && !tipoForo.equals("8") && !tipoForo.equals("9") && !tipoForo.equals("10") && !tipoForo.equals("11") &&!tipoForo.equals("12")); 
		
		
		
		//MENSAGEM DE QUE ESTAMOS PROCESSANDO OS DADOS, O USUÁRIO DARÁ MAIOR CREDIBILIDADE SE ACHAR QUE O SISTEMA ESTÁ "CALCULANDO" SUAS CHANCES
		JOptionPane.showMessageDialog(null, "Estamos processando os dados, para lhe informar suas chances nesta possível demanda..");
		
		//INSTANCIADO O OBJETO E UTILIZAÇÃO DOS MÓDULOS DAS CLASSES
		switch(tipoForo) {
			
			case "0"://CASO O USUARIO DIGITE "0" (JOÃO MENDES JR.)
				//INSTANCIANDO O OBJETO JOÃO MENDES JR.
				JoaoMendes joaoMendes = new JoaoMendes(nomePessoa, tipoPessoa, classeProcessual, tipoAssunto1, tipoAssunto1, tipoForo);
				//EXIBINDO O RESULTADO
				joaoMendes.resultado(tipoPessoa, tipoForo);
					break;
			case "1"://CASO O USUARIO DIGITE "1" (SANTANA)
				//INSTANCIANDO O OBJETO SANTANA
				Santana santana = new Santana(nomePessoa, tipoPessoa, classeProcessual, tipoAssunto1, tipoAssunto1, tipoForo);
				//EXIBINDO O RESULTADO
				santana.resultado(tipoPessoa, tipoForo);
					break;
			case "2": //CASO O USUARIO DIGITE "2" (SANTO AMARARO)
				//INSTANCIANDO O OBJETO SANTO AMARARO
				SantoAmaro santoAmaro = new SantoAmaro(nomePessoa, tipoPessoa, classeProcessual, tipoAssunto1, tipoAssunto1, tipoForo);
				//EXIBINDO O RESULTADO
				santoAmaro.resultado(tipoPessoa, tipoForo);
					break;
			case "3": //CASO O USUARIO DIGITE "3" (JABAQUARA)
				//INSTANCIANDO O OBJETO JABAQUARA
				Jabaquara jabaquara = new Jabaquara(nomePessoa, tipoPessoa, classeProcessual, tipoAssunto1, tipoAssunto1, tipoForo);
				//EXIBINDO O RESULTADO
				jabaquara.resultado(tipoPessoa, tipoForo);
					break;
			case "4": //CASO O USUARIO DIGITE "4" (LAPA)
				//INSTANCIANDO O OBJETO LAPA
				Lapa lapa = new Lapa(nomePessoa, tipoPessoa, classeProcessual, tipoAssunto1, tipoAssunto1, tipoForo);
				//EXIBINDO O RESULTADO
				lapa.resultado(tipoPessoa, tipoForo);
					break;
			case "5": //CASO O USUARIO DIGITE "5" (SÃO MIGUEL)
				//INSTANCIANDO O OBJETO SÃO MIGUEL
				SaoMiguel saoMiguel = new SaoMiguel(nomePessoa, tipoPessoa, classeProcessual, tipoAssunto1, tipoAssunto1, tipoForo);
				//EXIBINDO O RESULTADO
				saoMiguel.resultado(tipoPessoa, tipoForo);
					break;
			case "6": //CASO O USUARIO DIGITE "6" (PENHA)
				//INSTANCIANDO O OBJETO PENHA
				Penha penha = new Penha(nomePessoa, tipoPessoa, classeProcessual, tipoAssunto1, tipoAssunto1, tipoForo);
				//EXIBINDO O RESULTADO
				penha.resultado(tipoPessoa, tipoForo);
					break;
			case "7": //CASO O USUARIO DIGITE "7" (ITAQUERA)
				//INSTANCIANDO O OBJETO ITAQUERA
				Itaquera itaquera = new Itaquera(nomePessoa, tipoPessoa, classeProcessual, tipoAssunto1, tipoAssunto1, tipoForo);
				//EXIBINDO O RESULTADO
				itaquera.resultado(tipoPessoa, tipoForo);
					break;
			case "8": //CASO O USUARIO DIGITE "8" (TATUAPÉ)
				//INSTANCIANDO O OBJETO TATUAPÉ
				Tatuape tatuape = new Tatuape(nomePessoa, tipoPessoa, classeProcessual, tipoAssunto1, tipoAssunto1, tipoForo);
				//EXIBINDO O RESULTADO
				tatuape.resultado(tipoPessoa, tipoForo);
					break;
			case "9": //CASO O USUARIO DIGITE "9" (VILA PRUDENTE)
				//INSTANCIANDO O OBJETO VILA PRUDENTE
				VilaPrudente vilaPrudente = new VilaPrudente(nomePessoa, tipoPessoa, classeProcessual, tipoAssunto1, tipoAssunto1, tipoForo);
				//EXIBINDO O RESULTADO
				vilaPrudente.resultado(tipoPessoa, tipoForo);
					break;
			case "10": //CASO O USUARIO DIGITE "10" (IPIRANGA)
				//INSTANCIANDO O OBJETO IPIRANGA
				Ipiranga ipiranga = new Ipiranga(nomePessoa, tipoPessoa, classeProcessual, tipoAssunto1, tipoAssunto1, tipoForo);
				//EXIBINDO O RESULTADO
				ipiranga.resultado(tipoPessoa, tipoForo);
					break;
				
			case "11": //CASO O USUARIO DIGITE "11" (PINHEIROS)
				//INSTANCIANDO O OBJETO PINHEIROS
				Pinheiros pinheiros = new Pinheiros(nomePessoa, tipoPessoa, classeProcessual, tipoAssunto1, tipoAssunto1, tipoForo);
				//EXIBINDO O RESULTADO
				pinheiros.resultado(tipoPessoa, tipoForo);
					break;
			case "12": //CASO O USUARIO DIGITE "12" (NOSSA SENHORA DO Ó)
				//INSTANCIANDO O OBJETO NOSSA SENHORA DO Ó
				NossaSraO nossaSraO = new NossaSraO(nomePessoa, tipoPessoa, classeProcessual, tipoAssunto1, tipoAssunto1, tipoForo);
				//EXIBINDO O RESULTADO
				nossaSraO.resultado(tipoPessoa, tipoForo);
					break;
					
			default:
				JOptionPane.showMessageDialog(null, "Tipo de foro inválido!");
				
	}

		
}

}