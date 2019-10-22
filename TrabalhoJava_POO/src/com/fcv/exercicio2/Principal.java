package com.fcv.exercicio2;

public class Principal {

	public static void main(String[] args) {

		System.out.println("FORNECEDOR:");
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setNome("Fernando");
		fornecedor.setEndereco("Av. Pedro Taques, 2205");
		fornecedor.setTelefone("32324021");
		fornecedor.setValorCredito(100.0);
		fornecedor.setValorDivida(50.0);
		fornecedor.obterSaldo();

		System.out.println("\nEMPREGADO:");
		Empregado empregado = new Empregado();
		empregado.setNome("Ana");
		empregado.setEndereco("Rua Araxá, 1185");
		empregado.setTelefone("44997012152");
		empregado.setCodigoSetor(20);
		empregado.setSalarioBase(1900);
		empregado.setImposto(0.10);
		empregado.calcularSalario();

		System.out.println("\nADMINISTRADOR:");
		Administrador administrador = new Administrador();
		administrador.setNome("José");
		administrador.setEndereco("Rua Uruguai, 851");
		administrador.setTelefone("44997087752");
		administrador.setCodigoSetor(21);
		administrador.setSalarioBase(1900);
		administrador.setImposto(0.10);
		administrador.setAjudaDeCusto(250);
		administrador.calcularSalario();
		
		System.out.println("\nOPERARIO:");
		Operario operario = new Operario();
		operario.setNome("Erika");
		operario.setEndereco("Rua Canadá, 1520");
		operario.setTelefone("44997228712");
		operario.setCodigoSetor(22);
		operario.setSalarioBase(1900);
		operario.setImposto(0.10);
		operario.setValorProducao(14000);
		operario.setComissao(0.05);
		operario.calcularSalario();
		
		System.out.println("\nVENDEDOR:");
		Vendedor vendedor = new Vendedor();
		vendedor.setNome("Lucas");
		vendedor.setEndereco("Rua Equador, 3310");
		vendedor.setTelefone("44997040708");
		vendedor.setCodigoSetor(23);
		vendedor.setSalarioBase(1900);
		vendedor.setImposto(0.10);
		vendedor.setValorVendas(8400);
		vendedor.setComissao(0.08);
		vendedor.calcularSalario();
		
	}

}
