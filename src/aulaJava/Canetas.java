package aulaJava;

public class Canetas {

	public static void main(String[] args) {
		Caneta caneta1 = new Caneta();
		caneta1.cor = "azul";
		caneta1.modelo = "bic";
		caneta1.ponta = 0.5;
		caneta1.tamanho = 15d;
		caneta1.carga = 100;
		caneta1.tampada = true;
	
		caneta1.status();
		caneta1.destampar();
		caneta1.status();
	}

}
