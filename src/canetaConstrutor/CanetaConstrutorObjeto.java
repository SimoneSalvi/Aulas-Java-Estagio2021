package canetaConstrutor;

public class CanetaConstrutorObjeto {

	public static void main(String[] args) {
		CanetaConstrutor c1 = new CanetaConstrutor("verde", "BIC", 0.5, 15, 100, true);
		c1.status();
		
		CanetaConstrutor c2 = new CanetaConstrutor("azul", "BIC", 0.7, 15, 80, false);
		c2.status();
		
	}

}
