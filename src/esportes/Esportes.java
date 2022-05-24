package esportes;

public class Esportes {
	// Atributos
	private int quantidadePessoasTime;

	// Métodos
	public void jogarRegras() {
		System.out.println("Para ganhar é preciso...");
	}

	// Métodos especiais
	public int getQuantidadePessoasTime() {
		return quantidadePessoasTime;
	}

	public void setQuantidadePessoasTime(int quantidadePessoasTime) {
		this.quantidadePessoasTime = quantidadePessoasTime;
	}

}
