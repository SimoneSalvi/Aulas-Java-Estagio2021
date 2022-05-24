package prova1;

public class Papagaio extends Ave {

	// Atributos
	private String vocabulario;

	// Métodos
	@Override
	public void falar() {
		System.out.println("Pagagaio falando sem parar... ");
	}
	
	@Override
	public void imprime() {
		System.out.println("Pagagaio " + this.getNome() +" falando sem parar: " + this.getVocabulario());

	}

	// Métodos especiais
	public String getVocabulario() {
		return vocabulario;
	}

	public void setVocabulario(String vocabulario) {
		this.vocabulario = vocabulario;
	}


}
