package lista5.ex5;

import java.text.DecimalFormat;

public class Vendedor extends Empregado {
	DecimalFormat df = new DecimalFormat("###.00");
	// Atributos
	private double valorVendas; // valor monetário dos artigos vendidos
	private int comissao; // porcentagem do valorVendas que será adicionado ao salário base do Vendedor

	// Métodos
	@Override
	public void calcularSalario() {
		System.out.println("Vendedor: " + this.getNome() + "\n Endereço: " + this.getEndereço() + "\n Telefone: "
				+ this.getTelefone());
		System.out.println("Salário final Vendedor: R$"
				+ df.format((this.getSalarioBase() + (this.getValorVendas() * this.getComissao() / 100))
						* ((100 - getPorcentagemImposto()) / 100)));
	}

	// Métodos Getters e Setters
	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public int getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}

}
