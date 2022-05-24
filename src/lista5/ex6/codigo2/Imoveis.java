package lista5.ex6.codigo2;

public class Imoveis {
	// Atributos
	private String cor;
	private int quantidadeComodos;
	private double areaConstruída;

	// Métodos
	public void limparImovel() {
		System.out.println("Limpando ....");
	}

	public void venderImóvel() {
		System.out.println("Vendendo imóvel...");
	}

	public void reformarImovel() {
		System.out.println("Reformando imóvel...");
	}

	// Métodos Getters e Setters
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQuantidadeComodos() {
		return quantidadeComodos;
	}

	public void setQuantidadeComodos(int quantidadeComodos) {
		this.quantidadeComodos = quantidadeComodos;
	}

	public double getAreaConstruída() {
		return areaConstruída;
	}

	public void setAreaConstruída(double areaConstruída) {
		this.areaConstruída = areaConstruída;
	}

}
