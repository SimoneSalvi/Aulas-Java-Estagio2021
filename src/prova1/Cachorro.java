
package prova1;

public class Cachorro extends Mamifero{
	//Atributos
	private boolean tipoLatido; // V=alto; F=baixo

	
	//Métodos

	@Override
	public void falar() {
		System.out.println("Latindo...");
	}
	
	public void lateAlto() {
		this.setTipoLatido(true);
	}
	
	public void lateBaixo() {
		this.setTipoLatido(false);
	}
	
	@Override
	public void imprime() {
		System.out.println("O nome do cachorro  é " + this.getNome() + " e ele se movimenta a " + this.getVelocidade() + " m/min");
	}
	
	//Métodos especiais
	public boolean TipoLatido() {
		return tipoLatido;
	}

	public void setTipoLatido(boolean tipoLatido) {
		this.tipoLatido = tipoLatido;
	}


}
