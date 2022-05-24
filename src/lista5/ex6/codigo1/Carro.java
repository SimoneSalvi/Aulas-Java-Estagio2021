package lista5.ex6.codigo1;

public class Carro extends Veiculo {
	// Atributos
	private int numeroPortas;
	private double volumePortaMalas;
	private boolean arCondicionado;
	private boolean direcaoHidraulica;

	// Métodos
	@Override
	public void ligarVeiculo() {
		System.out.println("Ligando o carro..");
	}

	@Override
	public void desligarVeiculo() {
		System.out.println("Desligando o carro...");
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando o carro....");
	}

	@Override
	public void frear() {
		System.out.println("Freando o carro....");
	}

	// Métodos especiais
	public int getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}

}
