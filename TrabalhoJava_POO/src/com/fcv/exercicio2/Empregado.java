package com.fcv.exercicio2;

public class Empregado extends Pessoa {

	private int codigoSetor;
	protected double salarioBase;
	protected double imposto;
	
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public void calcularSalario() {
		double salario = salarioBase - (salarioBase * imposto);
		double valorImposto = (salarioBase * imposto);
		System.out.println("Salario: R$: " + salario + "\tBruto: R$ " + salarioBase + "\tImpostos: R$ " + valorImposto);
	}
	
}
