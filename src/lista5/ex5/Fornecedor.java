package lista5.ex5;

import java.text.DecimalFormat;
//import java.text.NumberFormat;

public class Fornecedor extends Pessoa {
	DecimalFormat df = new DecimalFormat("###.00");
	
	// Atributos
	private double valorCredito; // cr�dito m�ximo atribu�do ao fornecedor
	private double valorDivida; // montante da d�vida para com o fornecedor

	//M�todos
	public void obterSaldo() {   //devolve a diferen�a entre os valores dos atributos valorCredito e valorDivida
		System.out.println("Fornecedor: " + this.getNome() + "\n Endere�o: " + this.getEndere�o() + "\n Telefone: "
				+ this.getTelefone());
		System.out.println("Saldo atual Fornecedor: " + df.format(this.getValorCredito()-this.getValorDivida()));
	}

	// M�todos especiais
	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

}
