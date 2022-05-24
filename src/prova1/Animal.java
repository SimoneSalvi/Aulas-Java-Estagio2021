package prova1;

public abstract class Animal {
	// Atributos
	private String nome;

	// M�todos

	public void imprime() {
		System.out.println("O animal " + this.getNome());
	}

	public void falar() {
		System.out.println("Falando...");
	}

	// M�todos especiais
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
