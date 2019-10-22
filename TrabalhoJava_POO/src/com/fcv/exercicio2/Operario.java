package com.fcv.exercicio2;

public class Operario extends Empregado {
	
	private double valorProducao;
	private double comissao;
	
	public double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
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
		double valorComissao = (valorProducao * comissao);
		double salario = (salarioBase + valorComissao) - valorImposto;
		System.out.println("Salario: R$: " + salario + "\tBruto: R$ " + salarioBase + "\tImpostos: R$ " + valorImposto + "\tComissao: R$ " + valorComissao);
	}

}
