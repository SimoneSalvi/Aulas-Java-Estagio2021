package prova1;

public class Mamifero extends Animal {
	// Atributos
	private int velocidade; //m/minuto

	// Métodos
	public void correr() {
		System.out.println("Mamifero correndo...");
	}

	// Métodos especiais
	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
}
