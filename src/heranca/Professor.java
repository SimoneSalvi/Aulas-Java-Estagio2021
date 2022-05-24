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

	// M�todos
	public void receberAumento(double aumento) {
		this.setSalario(this.getSalario() + aumento);
		System.out.println("Ol� " + this.getNome() + ", seu novo sal�rio � " + this.getSalario());

	}

	public void aplicarProva() {
		System.out.println("Aplicando prova...");
	}

	public void participarReuniao() {
		System.out.println("Participando de reuni�o...");
	}

	// M�todos Getters e Setters
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
