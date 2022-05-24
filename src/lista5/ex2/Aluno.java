package lista5.ex2;

import java.text.DecimalFormat;

public class Aluno {
	DecimalFormat df = new DecimalFormat("#,###.00");

	// Atributos
	private String nome, serie;
	private double nota1, nota2, nota3, media;

	// Métodos
	public void calculaMediaIndividual() { // vai imprimir nome, serie e media individual
		System.out.println("O(a) aluno(a) " + this.getNome() + " da " + this.getSerie() + " teve média "
				+ df.format((this.getNota1() + this.getNota2() + this.getNota3()) / 3));
	}

	public void calculaMedia() { // vai imprimir somente a media individual
		this.setMedia((this.getNota1() + this.getNota2() + this.getNota3()) / 3);
	}

	// Métodos Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

}
