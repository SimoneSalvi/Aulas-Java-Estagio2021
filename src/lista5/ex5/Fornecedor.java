package lista5.ex5;

import java.text.DecimalFormat;
//import java.text.NumberFormat;

public class Fornecedor extends Pessoa {
	DecimalFormat df = new DecimalFormat("###.00");
	
	// Atributos
	private double valorCredito; // crédito máximo atribuído ao fornecedor
	private double valorDivida; // montante da dívida para com o fornecedor

	//Métodos
	public void obterSaldo() {   //devolve a diferença entre os valores dos atributos valorCredito e valorDivida
		System.out.println("Fornecedor: " + this.getNome() + "\n Endereço: " + this.getEndereço() + "\n Telefone: "
				+ this.getTelefone());
		System.out.println("Saldo atual Fornecedor: " + df.format(this.getValorCredito()-this.getValorDivida()));
	}

	// Métodos especiais
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
