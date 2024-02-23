package classes;

import java.util.Date;

import classesAbstratas.Conta;

public class ContaPoupanca extends Conta {
	
	private Date aniversario;
	

	public ContaPoupanca(int numeroDaConta, int agencia, String nomeDoTtular, int cpf, Date aniversario) {
		super(numeroDaConta, agencia, nomeDoTtular, cpf);
		this.aniversario = aniversario;
	}

	@Override
	public void saque(Double valor) {
		super.saque(valor+(valor*0.02));
	}

	@Override
	public void Transerencia(Conta conta , Double valor) {
		
	}

	
	

}
