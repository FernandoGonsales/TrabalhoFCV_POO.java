package com.fcv.exercicio1;

public class Principal {

	public static void main(String[] args) {

		System.out.println("CLIENTE ESPECIAL:");
		ContaEspecial clienteEspecial = new ContaEspecial();
		clienteEspecial.ConultaSaldo();
		clienteEspecial.Depositar(100);
		clienteEspecial.Saque(50);

		System.out.println("\nCLIENTE NORMAL:");
		Conta clienteNormal = new Conta();
		clienteNormal.ConultaSaldo();
		clienteNormal.Depositar(100);
		clienteNormal.Saque(50);
		clienteNormal.Saque(60);
		
	}

}
