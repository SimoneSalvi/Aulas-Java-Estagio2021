package heranca;

public class Pessoa {
	// Atributos
	private String nome;
	private String sexo;
	private int idade;

	// M�todos
	public void fazerAni() {
		this.setIdade(this.getIdade() + 1);
		System.out.println("Feliz anivers�rio!!  ^^");
	}

	// M�todos Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
