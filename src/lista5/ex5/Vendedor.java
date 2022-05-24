package lista5.ex5;

import java.text.DecimalFormat;

public class Vendedor extends Empregado {
	DecimalFormat df = new DecimalFormat("###.00");
	// Atributos
	private double valorVendas; // valor monet�rio dos artigos vendidos
	private int comissao; // porcentagem do valorVendas que ser� adicionado ao sal�rio base do Vendedor

	// M�todos
	@Override
	public void calcularSalario() {
		System.out.println("Vendedor: " + this.getNome() + "\n Endere�o: " + this.getEndere�o() + "\n Telefone: "
				+ this.getTelefone());
		System.out.println("Sal�rio final Vendedor: R$"
				+ df.format((this.getSalarioBase() + (this.getValorVendas() * this.getComissao() / 100))
						* ((100 - getPorcentagemImposto()) / 100)));
	}

	// M�todos Getters e Setters
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
