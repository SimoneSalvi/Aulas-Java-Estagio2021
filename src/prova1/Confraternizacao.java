package prova1;

public abstract class Confraternizacao {
	//Atributos
	private String tipoMusica;
	private int convidados;
	private String tipoComida;
	
	//Métodos
	
	public void conversar() {
		System.out.println("Conversando...");
	}
	
	public void dancar() {
		System.out.println("Dançando...");
	}

	public String getTipoMusica() {
		return tipoMusica;
	}

	public void setTipoMusica(String tipoMusica) {
		this.tipoMusica = tipoMusica;
	}

	public int getConvidados() {
		return convidados;
	}

	public void setConvidados(int convidados) {
		this.convidados = convidados;
	}

	public String getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}
}
