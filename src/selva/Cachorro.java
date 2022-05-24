package selva;

public class Cachorro extends Mamifero{

	@Override
	public void emitirSom() {
		//super.emitirSom();
		System.out.println("au, au...");
	}

	@Override
	public void alimentar() {
		//super.alimentar();
		System.out.println("Comendo ra��o e bebendo �gua...");
		
	}
	
	public void enterrarOsso() {
		System.out.println("Enterrando osso...");
	}
	
	public void destruirSofa() {
		System.out.println("Destruindo sof�..");
	}
	public void comerSandalia() {
		System.out.println("Comendo sand�lia..");
	}
	public void morder() {
		System.out.println("Mordendo..");
	}
	public void abanarRabo() {
		System.out.println("Abanando rabo...");
	}
	
	
}
