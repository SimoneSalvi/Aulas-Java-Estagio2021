package heranca;

public class Funcionario extends Pessoa {
	// Atributos
	private String setor;
	private boolean trabalhando;

	public Funcionario(String setor, boolean trabalhando) {
		super();
		this.setor = setor;
		this.trabalhando = trabalhando;

	}

	// Métodos
	public void mudarTrabalhando() {
		if (this.getTrabalhando() == true)
			this.setTrabalhando(false);
		else
			this.setTrabalhando(true);
	}

	public void mudarSetor(String setor) {
		if (this.getTrabalhando() == true) {
			this.setSetor(setor);
			System.out.println("Olá servidor(a) " + this.getNome() + ", seu novo setor é " + this.getSetor());
		} else
			System.out.println("Olá " + this.getNome() + ", vc não está mais ativo.");
	}

	public void executandoFuncao(String funcao) {
		if (this.getTrabalhando() == true)
			System.out.println("Servidor(a) " + this.getNome() + " executando a função: " + funcao);
		else
			System.out.println("Olá " + this.getNome() + ", vc não está mais ativo.");

	}

	// Métodos Getters e Setters
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean getTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}

}
