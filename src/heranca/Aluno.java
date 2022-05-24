package heranca;

public class Aluno extends Pessoa {
	// Atributos
	private int matricula;
	private String curso;

	public Aluno(int matricula, String curso) {
		super();
		this.matricula = matricula;
		this.curso = curso;
	}

	// Métodos
	public void cancelarMatricula() {
		System.out.println("Olá " + this.getNome() + ", sua matrícula no curso " + curso + " foi cancelada");
		this.setMatricula(0);
		this.setCurso(null);
	}

	public void fazerMatricula(int matricula) {
		System.out.println("Olá " + this.getNome() + ", sua matrícula no curso " + curso + " é número " + matricula);
		this.setMatricula(matricula);
		this.setCurso(this.getCurso());
	}

	public void estudar() {
		System.out.println("Estudando..");
	}

	// Métodos Getters e Setters
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
