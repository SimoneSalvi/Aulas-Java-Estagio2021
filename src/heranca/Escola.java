package heranca;

public class Escola {

	public static void main(String[] args) {

		// Professor
		// String Disciplina, Double salario
		Professor p1 = new Professor("Matemática", 2000d);
		p1.setNome("Joao");
		p1.setIdade(40);
		p1.setSexo("M");

		p1.receberAumento(500d);
		p1.fazerAni();
		p1.aplicarProva();
		p1.participarReuniao();

		// Aluno
		// Int matricula, String curso
		Aluno a1 = new Aluno(1010, "TI");
		a1.setNome("Maria");
		a1.setSexo("F");
		a1.setIdade(17);

		a1.cancelarMatricula();
		a1.fazerAni();
		a1.fazerMatricula(2123);
		a1.estudar();

		// Funcionario
		// String setor, boolean trabalhando
		Funcionario f1 = new Funcionario("cantina", true);
		f1.setNome("Laura");
		f1.setSexo("F");
		f1.setIdade(52);

//		f1.mudarTrabalhando();
//		f1.mudarTrabalhando();
		f1.mudarSetor("secretaria");
		f1.fazerAni();
		f1.executandoFuncao(" preencher formulário");
	}

}
