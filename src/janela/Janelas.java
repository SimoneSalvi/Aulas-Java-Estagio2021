package janela;

public class Janelas {

	public static void main(String[] args) {
		Janela janela1 = new Janela();
		janela1.marca = "sasaki";
		janela1.cor = "branca";
		janela1.material = "ferro";
		janela1.comprimento = 2;
		janela1.altura = 1;
		janela1.numeroDeFolhas = 2;
		janela1.trancada = true;
		
		janela1.status();
		janela1.abrir();
		
		janela1.destrancar();
		janela1.abrir();

	}

}
