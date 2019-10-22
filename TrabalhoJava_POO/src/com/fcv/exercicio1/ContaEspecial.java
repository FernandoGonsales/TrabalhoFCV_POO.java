package com.fcv.exercicio1;

public class ContaEspecial extends Conta {
	
	@Override
	public void Saque(int valor) {
		getSaldo();
		if (valor > saldo) {
			System.out.println("Saldo insuficiente \t Saldo atual: R$ " + saldo);
		} else {
			double taxa = 0.01 * valor;
			saldo -= valor;
			saldo -= taxa;
			System.out.println("Sacado: R$ " + valor + "\tTaxa: R$ " + taxa + "\tSaldo restante: R$ " + saldo);
		}
	}
}
		
