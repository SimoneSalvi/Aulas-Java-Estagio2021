package esportes;

public class Esportes {
	// Atributos
	private int quantidadePessoasTime;

	// M�todos
	public void jogarRegras() {
		System.out.println("Para ganhar � preciso...");
	}

	// M�todos especiais
	public int getQuantidadePessoasTime() {
		return quantidadePessoasTime;
	}

	public void setQuantidadePessoasTime(int quantidadePessoasTime) {
		this.quantidadePessoasTime = quantidadePessoasTime;
	}

}
