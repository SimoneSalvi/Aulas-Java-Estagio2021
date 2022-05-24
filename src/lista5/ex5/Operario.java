package lista5.ex5;

import java.text.DecimalFormat;

public class Operario extends Empregado {
	DecimalFormat df = new DecimalFormat("###.00");
	// Atributos
	private double valorProducao; // valor monet�rio dos artigos efetivamente produzidos pelo oper�rio
	private int comissao; // %porcentagem do valorProducao que ser� adicionado ao sal�rio base do oper�rio

	// M�todos
	@Override
	public void calcularSalario() {
		System.out.println("Oper�rio: " + this.getNome() + "\n Endere�o: " + this.getEndere�o() + "\n Telefone: "
				+ this.getTelefone());
		System.out.println("Sal�rio final Oper�rio: R$"
				+ df.format((this.getSalarioBase() + (this.getValorProducao() * this.getComissao() / 100))
						* ((100 - this.getPorcentagemImposto()) / 100)));
	}

	// M�todos Getters e Setters
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
