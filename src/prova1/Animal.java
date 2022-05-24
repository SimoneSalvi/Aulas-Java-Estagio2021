package prova1;

public abstract class Animal {
	// Atributos
	private String nome;

	// Métodos

	public void imprime() {
		System.out.println("O animal " + this.getNome());
	}

	public void falar() {
		System.out.println("Falando...");
	}

	// Métodos especiais
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
