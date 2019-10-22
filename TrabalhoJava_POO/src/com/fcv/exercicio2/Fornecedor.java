package com.fcv.exercicio2;

public class Fornecedor extends Pessoa {

	private double valorCredito;
	private double valorDivida;
	
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public void obterSaldo() {
		double saldo = valorCredito - valorDivida;
		if (valorCredito < valorDivida) {
			System.out.println("Saldo negativado: R$ " + saldo);
		} else {
		System.out.println("Saldo disponivel: R$ " + saldo);
		}
	}
	
}
