package selva;

public class Reptil extends Animal{
	//Atributos
	private String corEscama;

	//Métodos
	@Override
	public void locomover() {
		System.out.println("Rastejando...");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Emitindo som de reptil...");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo plantas...");
		
	}

	//Métodos especiais
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	

}
