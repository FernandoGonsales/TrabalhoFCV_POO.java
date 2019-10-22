package com.fcv.exercicio2;

public class Vendedor extends Empregado {
	
	private double valorVendas;
	private double comissao;
	
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public void calcularSalario() {
		double valorImposto = (salarioBase * imposto);
		double valorComissao = (valorVendas * comissao);
		double salario = (salarioBase + valorComissao) - valorImposto;
		System.out.println("Salario: R$: " + salario + "\tBruto: R$ " + salarioBase + "\tImpostos: R$ " + valorImposto + "\tComissao: R$ " + valorComissao);
	}

}
