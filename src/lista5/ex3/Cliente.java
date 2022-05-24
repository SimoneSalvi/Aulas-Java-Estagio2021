package lista5.ex3;

public class Cliente {

	public static void main(String[] args) {
		ContaBanco cliente1 = new ContaBanco();
		cliente1.setNome("João");
		cliente1.setSaldo(0d);
		cliente1.setAtivaCC(false);

//		cliente1.pagar(5d);
//		cliente1.abrirContaC();
		cliente1.depositar(100d);
		cliente1.abrirContaC();
		cliente1.pagar(150d);
		cliente1.fecharContaC();
		cliente1.depositar(50d);
		cliente1.fecharContaC();

	}

}
