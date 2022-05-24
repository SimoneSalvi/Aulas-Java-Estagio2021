package lista5.ex5;

import java.text.DecimalFormat;

public class Administrador extends Empregado {
	DecimalFormat df = new DecimalFormat("###.00");

	// Atributos
	private double ajudaDeCusto;

	// Métodos
	@Override
	public void calcularSalario() {
		DecimalFormat df = new DecimalFormat("###.00");
		System.out.println("Administrador: " + this.getNome() + "\n Endereço: " + this.getEndereço() + "\n Telefone: "
				+ this.getTelefone());
		System.out.println("Salário final Administrador: R$" + df
				.format((this.getSalarioBase() + this.getAjudaDeCusto()) * ((100 - getPorcentagemImposto()) / 100)));
	}

	// Métodos especiais
	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

}
