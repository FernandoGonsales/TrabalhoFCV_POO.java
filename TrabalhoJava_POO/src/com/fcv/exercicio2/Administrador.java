package com.fcv.exercicio2;

public class Administrador extends Empregado {

	private double ajudaDeCusto;

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}
	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	@Override
	public void calcularSalario() {
		double salario = (salarioBase + ajudaDeCusto) - (salarioBase * imposto);
		double valorImposto = (salarioBase * imposto);
		System.out.println("Salario: R$: " + salario + "\tBruto: R$ " + salarioBase + "\tImpostos: R$ " + valorImposto + "\tAjuda de custo: R$ " + ajudaDeCusto);
	}

}
