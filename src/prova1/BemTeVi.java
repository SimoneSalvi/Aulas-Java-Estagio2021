package prova1;

public class BemTeVi extends Ave{


	//Métodos

	@Override
	public void falar() {
		System.out.println("Bem Te Vi falando...piu piu");
	}

	@Override
	public void imprime() {
		System.out.println("Bem Te Vi: " + this.getNome() );
	}
	
	
}
