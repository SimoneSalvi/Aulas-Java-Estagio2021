package lista5.ex6.codigo1;

public class Rua {

	public static void main(String[] args) {

		// Carro 1
		Carro carro1 = new Carro();
		carro1.setCor("branco");
		carro1.setMarca("Ford");
		carro1.setNumeroRodas(4);
		carro1.setNumeroPortas(2);
		carro1.ligarVeiculo();
		carro1.acelerar();
		carro1.frear();
		carro1.desligarVeiculo();

		// Moto1
		Moto moto1 = new Moto();
		moto1.setCor("vermelha");
		moto1.setMarca("Yamaha");
		moto1.setNumeroRodas(2);
		moto1.ligarVeiculo();
		moto1.acelerar();
		moto1.frear();
		moto1.desligarVeiculo();

	}

}
