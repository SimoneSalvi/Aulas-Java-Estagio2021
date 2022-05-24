package lista5.ex2;

import java.text.DecimalFormat;

public class AlunoP2 extends Aluno {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		// Aluno1
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Ana");
		aluno1.setSerie("5ª série A");
		aluno1.setNota1(6);
		aluno1.setNota2(6);
		aluno1.setNota3(6);
		aluno1.calculaMedia();

		// Aluno2
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Pedro");
		aluno2.setSerie("5ª série A");
		aluno2.setNota1(6);
		aluno2.setNota2(6);
		aluno2.setNota3(6);
		aluno2.calculaMedia();

		// Aluno3
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Henrique");
		aluno3.setSerie("5ª série A");
		aluno3.setNota1(6);
		aluno3.setNota2(6);
		aluno3.setNota3(6);
		aluno3.calculaMedia();

		// Aluno4
		Aluno aluno4 = new Aluno();
		aluno4.setNome("Maria");
		aluno4.setSerie("5ª série A");
		aluno4.setNota1(6);
		aluno4.setNota2(6);
		aluno4.setNota3(6);
		aluno4.calculaMedia();

		// Aluno5
		Aluno aluno5 = new Aluno();
		aluno5.setNome("João");
		aluno5.setSerie("5ª série A");
		aluno5.setNota1(6);
		aluno5.setNota2(6);
		aluno5.setNota3(6);
		aluno5.calculaMedia();

		System.out.println("A média geral dos alunos foi " + df.format((aluno1.getMedia() + aluno2.getMedia() + aluno3.getMedia() + aluno4.getMedia() + aluno5.getMedia()) / 5));

	}

}
