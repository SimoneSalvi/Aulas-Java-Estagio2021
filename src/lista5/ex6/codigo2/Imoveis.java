package lista5.ex6.codigo2;

public class Imoveis {
	// Atributos
	private String cor;
	private int quantidadeComodos;
	private double areaConstru�da;

	// M�todos
	public void limparImovel() {
		System.out.println("Limpando ....");
	}

	public void venderIm�vel() {
		System.out.println("Vendendo im�vel...");
	}

	public void reformarImovel() {
		System.out.println("Reformando im�vel...");
	}

	// M�todos Getters e Setters
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

	public double getAreaConstru�da() {
		return areaConstru�da;
	}

	public void setAreaConstru�da(double areaConstru�da) {
		this.areaConstru�da = areaConstru�da;
	}

}
