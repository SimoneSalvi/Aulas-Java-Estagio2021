package aulaJava;

public class Caneta {

// Atributos:
	String cor;
	String modelo;
	double ponta;
	double tamanho;
	int carga;
	boolean tampada;

//Métodos		

	void status() {
		System.out.println("Cor: " + this.cor);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}

	void tampar() {
		this.tampada = true;
	}

	void destampar() {
		this.tampada = false;
	}

	void escrever() {
		if (this.tampada == true && this.carga == 0) {
			System.out.println("Desculpe, não posso escrever, estou tampada e sem carga.");
		} else {
			System.out.println("Estou escrevendo.");
		}
	}

}