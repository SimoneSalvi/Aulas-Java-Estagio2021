package heranca;

public class Professor extends Pessoa {
	// Atributos
	private String especialidade;
	private double salario;

	public Professor(String especialidade, double salario) {
		super();
		this.especialidade = especialidade;
		this.salario = salario;
	}

	// Métodos
	public void receberAumento(double aumento) {
		this.setSalario(this.getSalario() + aumento);
		System.out.println("Olá " + this.getNome() + ", seu novo salário é " + this.getSalario());

	}

	public void aplicarProva() {
		System.out.println("Aplicando prova...");
	}

	public void participarReuniao() {
		System.out.println("Participando de reunião...");
	}

	// Métodos Getters e Setters
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
