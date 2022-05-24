package lista5.ex6.codigo1;

public class Moto extends Veiculo {
	// Atributos
	private boolean descanso; // pézinho de apoio da moto

	// Métodos
	@Override
	public void ligarVeiculo() {
		System.out.println("Ligando a moto..");
	}

	@Override
	public void desligarVeiculo() {
		System.out.println("Desligando a moto...");
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando a moto....");
	}

	@Override
	public void frear() {
		System.out.println("Freando a moto....");
	}

	// Métodos especiais
	public boolean isDescanso() {
		return descanso;
	}

	public void setDescanso(boolean descanso) {
		this.descanso = descanso;
	}

}
