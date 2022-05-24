package lista5.ex6.codigo2;

public class Casa extends Imoveis {
	// Atributos
	private int numeroAndares;
	private boolean piscina;

	// Métodos
	@Override
	public void limparImovel() {
		System.out.println("Limpando a casa...");
	}

	@Override
	public void reformarImovel() {
		System.out.println("Reformando a casa...");
	}

	// Métodos Getters e Setters
	public int getNumeroAndares() {
		return numeroAndares;
	}

	public void setNumeroAndares(int numeroAndares) {
		this.numeroAndares = numeroAndares;
	}

	public boolean isPiscina() {
		return piscina;
	}

	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}

}
