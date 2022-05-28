
public class Main {

	public static void main(String[] args) {
		Cliente flavio = new Cliente();
		flavio.setNome("Flávio");
		
		
		
		
		Conta cc = new ContaCorrente(flavio);
		cc.depositar(100);
		
		
		Conta poupanca = new ContaPoupanca(flavio);
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
