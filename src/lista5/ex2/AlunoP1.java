package lista5.ex2;

public class AlunoP1 extends Aluno{

	public static void main(String[] args) {
		// Aluno1
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Ana");
		aluno1.setSerie("5ª série A");
		aluno1.setNota1(6);
		aluno1.setNota2(7);
		aluno1.setNota3(8);
		aluno1.calculaMediaIndividual();

		// Aluno2
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Pedro");
		aluno2.setSerie("5ª série A");
		aluno2.setNota1(8);
		aluno2.setNota2(8);
		aluno2.setNota3(9);
		aluno2.calculaMediaIndividual();

		// Aluno3
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Henrique");
		aluno3.setSerie("5ª série A");
		aluno3.setNota1(9);
		aluno3.setNota2(7);
		aluno3.setNota3(7);
		aluno3.calculaMediaIndividual();

	}

}
