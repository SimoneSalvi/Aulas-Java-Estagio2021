package lista5.ex3;

public class ContaBanco {
	// Atributos
	private String nome;
	private double saldo;
	boolean ativaCC;
	boolean ativaCP;

	// M�todos
	public void depositar(double deposito) {
		this.setSaldo(this.getSaldo() + deposito);
		System.out.println("Seu saldo � de R$" + this.getSaldo());
	}

	public void abrirContaP() {
		if (saldo >= 20) {
			System.out.println("Abrindo conta poupan�a...");
			this.setAtivaCP(true);
		} else {
			System.out.println("Seu saldo � inferior a R$20,00...");
			this.setAtivaCP(false);
		}
	}

	public void abrirContaC() {
		if (saldo >= 30) {
			System.out.println("Abrindo conta corrente...");
			this.setAtivaCC(true);
		} else {
			System.out.println("Seu saldo � inferior a R$30,00...");
			this.setAtivaCC(false);
		}
	}

	public void fecharContaC() {
		if (saldo == 0) {
			System.out.println("Conta corrente fechada com sucesso...");
			this.setAtivaCC(false);
		} else if (saldo > 0)
			System.out.println(
					"Para fechar sua conta voc� precisa sacar seu dinheiro. Voc� ainda tem em sua conta: R$" + saldo);
		else
			System.out.println("Para fechar sua conta voc� precisa fazer um dep�sito de R$" + saldo * (-1));
	}

	public void fecharContaP() {
		if (saldo == 0) {
			System.out.println("Conta poupan�a fechada com sucesso...");
			this.setAtivaCP(false);
		} else if (saldo > 0)
			System.out.println(
					"Para fechar sua conta voc� precisa sacar seu dinheiro. Voc� ainda tem em sua conta: R$" + saldo);
		else
			System.out.println("Para fechar sua conta voc� precisa fazer um dep�sito de R$" + saldo * (-1));
	}

	public void mensalidadeConta() {
		if (this.getAtivaCC() == true || this.getAtivaCP() == true) {
			this.setSaldo(this.getSaldo() - 10);
			if (saldo < 0)
				System.out.println("Aten��o, seu saldo est� negativo...");
		} else
			System.out.println("Voc� n�o tem conta(s) ativa(s)...");
	}

	public void pagar(double valor) {
		if (this.getAtivaCC() == true || this.getAtivaCP() == true) {
			this.setSaldo(this.getSaldo() - valor);
			if (saldo >= 0) {
				System.out.println("Seu saldo atual � de R$" + this.getSaldo());
			}
			if (saldo < 0)
				System.out.println("Aten��o, seu saldo est� negativo...");
		} else
			System.out.println("Voc� n�o tem conta(s) ativa(s)...");
	}

	public void sacar(double valor) {
		if (this.getAtivaCC() == true || this.getAtivaCP() == true) {
			if (saldo >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Seu saldo atual � de R$" + this.getSaldo());
			}
			if (saldo < 0)
				System.out.println("Aten��o, seu saldo est� negativo...");
		} else
			System.out.println("Voc� n�o tem conta(s) ativa(s)...");
	}

	// M�todos especiais
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getAtivaCC() {
		return ativaCC;
	}

	public void setAtivaCC(boolean ativaCC) {
		this.ativaCC = ativaCC;
	}

	public boolean getAtivaCP() {
		return ativaCP;
	}

	public void setAtivaCP(boolean ativaCP) {
		this.ativaCP = ativaCP;
	}

}
