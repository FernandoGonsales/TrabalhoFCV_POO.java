package com.fcv.exercicio1;

public class Conta {

	protected double saldo = 0.00;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void Depositar(int valor) {
		valor += saldo;
		setSaldo(valor);
		System.out.println("Depositado: R$ " + valor + "\t Saldo atual: R$ " + saldo);
	}

	public void Saque(int valor) {
		saldo = getSaldo();
		if (valor > saldo) {
			System.out.println("Saldo insuficiente \t Saldo atual: R$ " + saldo);
		} else {
			double taxa = 0.05 * valor;
			saldo -= valor;
			saldo -= taxa;
			System.out.println("Sacado: R$ " + valor + "\tTaxa: R$ " + taxa + "\tSaldo restante: R$ " + saldo);
		}
	}

	public void ConultaSaldo() {
		saldo = getSaldo();
		System.out.println("Saldo atual: R$ " + saldo);
	}

}
