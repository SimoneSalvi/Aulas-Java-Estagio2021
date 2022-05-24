package lista5.ex6.codigo2;

public class Apartamento extends Imoveis {
	// Atributos
	private boolean elevador;
	private boolean sacada;

	// Métodos
	@Override
	public void limparImovel() {
		System.out.println("Limpando o apartamento...");
	}

	@Override
	public void reformarImovel() {
		System.out.println("Reformando o apartamento...");
	}

	// Métodos Getters e Setters
	public boolean isElevador() {
		return elevador;
	}

	public void setElevador(boolean elevador) {
		this.elevador = elevador;
	}

	public boolean isSacada() {
		return sacada;
	}

	public void setSacada(boolean sacada) {
		this.sacada = sacada;
	}

}
