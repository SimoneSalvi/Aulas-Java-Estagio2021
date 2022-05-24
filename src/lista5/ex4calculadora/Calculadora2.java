package lista5.ex4calculadora;

import java.util.Scanner;

public class Calculadora2 {
	private String operacao = "";
	private double numeroPartida = 0d;
	private double numeroSeguinte = 0d;
	private double resultado = numeroPartida;

	Scanner sc = new Scanner(System.in);

	// Métodos
	public void somar() {
//		if (this.getOperacao().equals("+")) {
		this.setResultado(this.getResultado() + this.getNumeroSeguinte());
//		}
	}

	public void subtrair() {
//		if (this.getOperacao().equals("-")) {
		this.setResultado(this.getResultado() - this.getNumeroSeguinte());
//		}
	}

	public void multiplicar() {
//		if (this.getOperacao().equals("x")) {
		this.setResultado(this.getResultado() * this.getNumeroSeguinte());
//		}
	}

	public void dividir() {
		double dividendo = this.getResultado();
		this.setResultado(dividendo / this.getNumeroSeguinte());
	}
//		} else if (this.getOperacao().equals("/") && this.getNumeroSeguinte() == 0) {
//			System.out.println("Não é possível dividir por zero, entre com outro número: ");
//			this.setNumeroSeguinte(sc.nextDouble());
//			double dividendo = this.getResultado();
//			this.setResultado(dividendo / this.getNumeroSeguinte());

//	sc.close();

	

	public void sair() {
		System.out.println("O resultado é " + this.getResultado());
	}

	// Métodos Getters e Setters
	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public double getNumeroPartida() {
		return numeroPartida;
	}

	public void setNumeroPartida(double numeroPartida) {
		this.numeroPartida = numeroPartida;
	}

	public double getNumeroSeguinte() {
		return numeroSeguinte;
	}

	public void setNumeroSeguinte(double numeroSeguinte) {
		this.numeroSeguinte = numeroSeguinte;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

}
