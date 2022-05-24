package prova1;

public class Vaca extends Mamifero {
	// Atributos
	private boolean permiteOrdenha;

	// M�todos
	

	public void ordenhar() {
		System.out.println("Ordenhando...");
	}
	
	@Override
	public void falar() {
		System.out.println("Muuuuuuuu...vaca emitindo sons");
	}
	

	@Override
	public void imprime() {
		System.out.println("O nome da vaca  � " + this.getNome() + " e ela se movimenta a " + this.getVelocidade() + " m/min");
	}

	// M�todos especiais

	public boolean PermiteOrdenha() {
		return permiteOrdenha;
	}

	public void setPermiteOrdenha(boolean permiteOrdenha) {
		this.permiteOrdenha = permiteOrdenha;
	}

}
