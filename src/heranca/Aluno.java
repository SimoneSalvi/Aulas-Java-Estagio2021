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

	// M�todos
	public void cancelarMatricula() {
		System.out.println("Ol� " + this.getNome() + ", sua matr�cula no curso " + curso + " foi cancelada");
		this.setMatricula(0);
		this.setCurso(null);
	}

	public void fazerMatricula(int matricula) {
		System.out.println("Ol� " + this.getNome() + ", sua matr�cula no curso " + curso + " � n�mero " + matricula);
		this.setMatricula(matricula);
		this.setCurso(this.getCurso());
	}

	public void estudar() {
		System.out.println("Estudando..");
	}

	// M�todos Getters e Setters
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
