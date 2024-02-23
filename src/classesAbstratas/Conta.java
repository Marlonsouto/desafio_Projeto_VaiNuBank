package classesAbstratas;

import Interfaces.InterfaceConta;

public abstract class Conta implements InterfaceConta {
	private int numeroDaConta;
	private int agencia;
	private String nomeDoTtular;
	private int cpf;

	private Double saldo = 0.0;

	public Conta(int numeroDaConta, int agencia, String nomeDoTtular, int cpf) {
		
		this.numeroDaConta = numeroDaConta;
		this.agencia = agencia;
		this.nomeDoTtular = nomeDoTtular;
		this.cpf = cpf;
		this.saldo = saldo;
	}

	public Conta(int numeroDaConta, int agencia, int numeroDoTtular, int cpf) {
		
		this.numeroDaConta = numeroDaConta;
		this.agencia = agencia;
		this.nomeDoTtular = nomeDoTtular;
		this.cpf = cpf;
	}



	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getNumeroDoTtular() {
		return nomeDoTtular;
	}

	public void setNumeroDoTtular(String nomeDoTtular) {
		this.nomeDoTtular = nomeDoTtular;
	}
	
	

	public void setNomeDoTtular(String nomeDoTtular) {
		this.nomeDoTtular = nomeDoTtular;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public Double getSaldo() {
		return saldo;
	}

	@Override
	public void saque(Double valor) {
		saldo = getSaldo() - valor;

	}

	@Override
	public void Transerencia(Conta conta , Double valor) {
		
	}

	@Override
	public void deposito(Double valor) {
		if (valor < 0.0) {
			System.out.println("valor insuficiente para realizar operacao.");

		}
		saldo = getSaldo() - valor;

	}
}
