package classes;

import classesAbstratas.Conta;

public class ContaCorrente extends Conta {

	private double limiteDeCredito ;
	
	public ContaCorrente(int numeroDaConta, int agencia, int numeroDoTtular, int cpf, Double saldo) {
		super(numeroDaConta, agencia, numeroDoTtular, cpf, saldo);
		this.limiteDeCredito = 1000;
	}
	
	

	@Override
	public void Transerencia(Conta conta , Double valor) {

	}

}