package POO2;

public class TestePessoaFornecedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoaqualquer = new Pessoa ("Jonathan");
		Fornecedor fornecedor1 = new Fornecedor ("magalu", "Avenida Paulista", 1500, 1000);
	// Fornecedor(String nome, String endereço, double valorCredito, double valorDivida) {

		
		
	fornecedor1.setValorDivida(500.50);	
	
	System.out.println("Saldo: "+fornecedor1.getNome()+" "+fornecedor1.obterSaldo());
	
	}

}
