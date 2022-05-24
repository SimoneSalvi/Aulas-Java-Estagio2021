package janela;

public class Janela {

	// Atributos:
	String marca;
	String cor;
	String material;
	double comprimento;
	double altura;
	int numeroDeFolhas;
	boolean trancada;

	// Métodos:
	void status() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Cor: " + this.cor);
		System.out.println("Material: " + this.material);
		System.out.println("Tamanho, comprimento: " + this.comprimento + " altura: " + this.altura);
		System.out.println("Numero de folhas: " + this.numeroDeFolhas);
		System.out.println("Está trancada? " + this.trancada);
	}

	void trancar() {
		this.trancada = true;
	}

	void destrancar() {
		this.trancada = false;
	}

	void abrir() {
		if(trancada==true) {
			System.out.println("Não posso abrir, estou trancada");
	}else 
		System.out.println("Abrindo");

	}
}
