package selva;

public class Mamifero extends Animal {
	// Atributos
	private String corPelo;

	// M�todos
	@Override
	public void locomover() {
		System.out.println("Andando...");
	}

	@Override
	public void emitirSom() {
		System.out.println("Sons caracter�sticos...");

	}

	@Override
	public void alimentar() {
		System.out.println("Mamando...");

	}

	//m�todos especiais
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

}
