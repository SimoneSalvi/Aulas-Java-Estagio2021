package selva;

public class Selva {

	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Cachorro c = new Cachorro();
		Canguru cg = new Canguru();
		Aves a = new Aves();
		Reptil r = new Reptil();
		
		m.locomover();
		c.locomover();
		cg.locomover();
		a.locomover();
		r.locomover();
		
	}

}
