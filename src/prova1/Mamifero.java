package prova1;

public class Mamifero extends Animal {
	// Atributos
	private int velocidade; //m/minuto

	// M�todos
	public void correr() {
		System.out.println("Mamifero correndo...");
	}

	// M�todos especiais
	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
}
