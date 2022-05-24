package lista5.ex5;

public class Empresa {

	public static void main(String[] args) {

		// escreva um programa de teste adequado para todas estas classes e o diagrama
		// de classes.

		// Fornecedor
		Fornecedor funcionario1 = new Fornecedor();
		funcionario1.setNome("Pedro");
		funcionario1.setEndereço("Araraquara-SP");
		funcionario1.setTelefone("3333-3030");
		funcionario1.setValorCredito(5000d);
		funcionario1.setValorDivida(1000d);
		funcionario1.obterSaldo();
		System.out.println("************************");

		// Administrador
		Administrador administrador1 = new Administrador();
		administrador1.setNome("João");
		administrador1.setEndereço("São Carlos-SP");
		administrador1.setTelefone("4444-4040");
		administrador1.setCodigoSetor(10101);
		administrador1.setPorcentagemImposto(3);
		administrador1.setSalarioBase(5000d);
		administrador1.setAjudaDeCusto(100d);
		administrador1.calcularSalario();
		System.out.println("************************");

		// Operario
		Operario operario1 = new Operario();
		operario1.setNome("Ana");
		operario1.setEndereço("Araras-SP");
		operario1.setTelefone("5555-5050");
		operario1.setCodigoSetor(90909);
		operario1.setPorcentagemImposto(3);
		operario1.setSalarioBase(3000d);
		operario1.setValorProducao(10000);
		operario1.setComissao(2);
		operario1.calcularSalario();
		System.out.println("************************");

//		Vendedor
		Vendedor vendedor1 = new Vendedor();
		vendedor1.setNome("Maria");
		vendedor1.setEndereço("Colina-SP");
		vendedor1.setTelefone("2222-20202");
		vendedor1.setCodigoSetor(323232);
		vendedor1.setPorcentagemImposto(3);
		vendedor1.setSalarioBase(6000d);
		vendedor1.setValorVendas(6000);
		vendedor1.setComissao(4);
		vendedor1.calcularSalario();
		System.out.println("************************");

	}

}
