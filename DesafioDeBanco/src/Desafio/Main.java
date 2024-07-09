package Desafio;

public class Main {
	public static void main(String[] args) {
		Cliente andre = new Cliente();
		andre.setNome("Andre");
		
		IConta cc = new ContaCorrente(andre);
		IConta poupanca = new ContaPoupanca(andre);
		
		cc.depositar(200);
		cc.transferir(20, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
