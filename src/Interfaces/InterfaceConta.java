package Interfaces;

import classesAbstratas.Conta;

public interface InterfaceConta {
	public void deposito(Double valor) ;
	public void saque(Double valor);
	public void Transerencia(Conta conta , Double valor);

}
