package lista5.ex6.codigo1;

public class Veiculo {
	// Atributos
	private String cor;
	private String marca;
	private int numeroRodas;

	// Métodos

	public void ligarVeiculo() {
		System.out.println("Ligando...");
	}

	public void desligarVeiculo() {
		System.out.println("Desligando...");
	}

	public void acelerar() {
		System.out.println("Acelerando....");
	}

	public void frear() {
		System.out.println("Freando....");
	}

	// Métodos especiais
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getNumeroRodas() {
		return numeroRodas;
	}

	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}

}
