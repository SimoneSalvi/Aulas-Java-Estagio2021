package canetaConstrutor;

public class CanetaConstrutor {
	// Atributos:
	private	String cor;
	private	String modelo;
	private	double ponta;
	private	double tamanho;
	private	int carga;
	private	boolean tampada;
	
	//Construtor
	public CanetaConstrutor (String cor, String modelo, double ponta, double tamanho, int carga, boolean tampada) {
		this.setTampada(tampada);
		this.setModelo(modelo);
		this.setCarga(carga);
		this.setCor(cor);
		this.setPonta(ponta);
		this.setTamanho(tamanho);
	}

	//Métodos de acesso
	
	public String getCor() {
		return this.cor;
	}	
	
	public void setCor(String cor) {
		this.cor = cor;
	}	
	
	public String getModelo() {
		return this.modelo;
	}	
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}	
	
	public double getPonta() {
		return this.ponta;
	}	
	
	public void setPonta(double ponta) {
		this.ponta = ponta;
	}
	
	public double getTamanho() {
		return this.tamanho;
	}	
	
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	public int getCarga() {
		return this.carga;
	}	
	
	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	public boolean getTampada() {
		return this.tampada;
	}	
	
	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	
	//Métodos		

	public	void status() {
			System.out.println("Cor: " + this.getCor());
			System.out.println("Modelo: " + this.getModelo());
			System.out.println("Ponta: " + this.getPonta());
			System.out.println("Tamanho: " + this.getTamanho());
			System.out.println("Carga: " + this.getCarga());
			System.out.println("Está tampada? " + this.getTampada());
		}

		void tampar() {
			this.setTampada(true);
		}

		void destampar() {
			this.setTampada(false);
		}

		void escrever() {
			if (this.getTampada() == true && this.getCarga() == 0) {
				System.out.println("Desculpe, não posso escrever, estou tampada e sem carga.");
			} else {
				System.out.println("Estou escrevendo.");
			}
		

	}
}
