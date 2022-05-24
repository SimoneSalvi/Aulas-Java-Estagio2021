package selva;

public class Mamifero extends Animal {
	// Atributos
	private String corPelo;

	// Métodos
	@Override
	public void locomover() {
		System.out.println("Andando...");
	}

	@Override
	public void emitirSom() {
		System.out.println("Sons característicos...");

	}

	@Override
	public void alimentar() {
		System.out.println("Mamando...");

	}

	//métodos especiais
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

}
