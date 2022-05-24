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
		System.out.println("Comendo ração e bebendo água...");
		
	}
	
	public void enterrarOsso() {
		System.out.println("Enterrando osso...");
	}
	
	public void destruirSofa() {
		System.out.println("Destruindo sofá..");
	}
	public void comerSandalia() {
		System.out.println("Comendo sandália..");
	}
	public void morder() {
		System.out.println("Mordendo..");
	}
	public void abanarRabo() {
		System.out.println("Abanando rabo...");
	}
	
	
}
