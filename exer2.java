package aula33.labs;



public class exer2 {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();
		
		conta.setNumero("1234");
		conta.setAgencia("3251");
		conta.setEspecial(true);
		conta.setLimiteEspecial(500);
		conta.setSaldo(-10);
		
		conta.consultarSaldo();
		System.out.println("Saldo da Conta "+conta.getNumero()+ "= "+ conta.getSaldo());
		
		boolean saqueEfetuado = conta.realizarSaque(10); // saque
		if(saqueEfetuado) {
		System.out.println("Saque efetuado com sucesso");
		conta.consultarSaldo();
		}
		else {
			System.out.println("Não foi possivel realizar saque. Saldo Insuficiente.");
		}
		
		boolean saqueEfetuado1 = conta.realizarSaque(500); //saque
		System.out.println("Tentativa de saque de 500 reais.");
		if(saqueEfetuado1) {
		System.out.println("Saque efetuado com sucesso");
		conta.consultarSaldo();
		}
		else {
			System.out.println("Não foi possivel realizar saque. Saldo Insuficiente.");
		}
		System.out.println("deposito de 500 reias.");
		conta.depositar(500);
		conta.consultarSaldo();
		
		if (conta.verificarUsoChequeEspecial()) {
			System.out.println("Esta usando cheque especial.");
		}else {
			System.out.println("Não esta usando cheque especial.");
		}
		conta.realizarSaque(600);
		conta.consultarSaldo();
		if (conta.verificarUsoChequeEspecial()) {
			System.out.println("Esta usando cheque especial.");
		}else {
			System.out.println("Não esta usando cheque especial.");
		}
	}

}
