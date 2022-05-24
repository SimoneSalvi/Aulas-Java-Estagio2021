package selva;

public class Aves extends Animal {
	// Atributos
	private String corPena;

	// Métodos

	@Override
	public void locomover() {
		System.out.println("voando...");

	}

	@Override
	public void emitirSom() {
		System.out.println("Som de ave...");

	}

	@Override
	public void alimentar() {
		System.out.println("Comendo frutas...");
	}
		
	public void construirNinho() {
		System.out.println("Construindo ninho...");
	}

	//Métodos especiais
	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

}
