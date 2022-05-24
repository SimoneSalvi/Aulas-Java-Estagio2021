package lista5.ex5;

import java.text.DecimalFormat;

public class Operario extends Empregado {
	DecimalFormat df = new DecimalFormat("###.00");
	// Atributos
	private double valorProducao; // valor monetário dos artigos efetivamente produzidos pelo operário
	private int comissao; // %porcentagem do valorProducao que será adicionado ao salário base do operário

	// Métodos
	@Override
	public void calcularSalario() {
		System.out.println("Operário: " + this.getNome() + "\n Endereço: " + this.getEndereço() + "\n Telefone: "
				+ this.getTelefone());
		System.out.println("Salário final Operário: R$"
				+ df.format((this.getSalarioBase() + (this.getValorProducao() * this.getComissao() / 100))
						* ((100 - this.getPorcentagemImposto()) / 100)));
	}

	// Métodos Getters e Setters
	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public int getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}

}
