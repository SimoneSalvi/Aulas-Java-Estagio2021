package lista5.ex5;

public class Empregado extends Pessoa {
	// Atributos
	private int codigoSetor;
	private double salarioBase;
	private double porcentagemImposto; // em%

	// Métodos
	public void calcularSalario() {
		System.out.println("Salário final: R$"
				+ (this.getSalarioBase() - (this.getSalarioBase() * this.getPorcentagemImposto() / 100)));
	}

	// Metodos especiais
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

	public double getPorcentagemImposto() {
		return porcentagemImposto;
	}

	public void setPorcentagemImposto(int porcentagemImposto) {
		this.porcentagemImposto = porcentagemImposto;
	}

}
