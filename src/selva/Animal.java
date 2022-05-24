package selva;

public abstract class Animal {
	//Atributos
	private double peso;
	private int membros;
	private int idade;

	//Metodos abstratos
	public abstract void locomover();
	public abstract void emitirSom();
	public abstract void alimentar();
	
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getMembros() {
		return membros;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
