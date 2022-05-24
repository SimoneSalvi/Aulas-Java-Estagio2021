package lista5.ex3;

public class ContaBanco {
	// Atributos
	private String nome;
	private double saldo;
	boolean ativaCC;
	boolean ativaCP;

	// Métodos
	public void depositar(double deposito) {
		this.setSaldo(this.getSaldo() + deposito);
		System.out.println("Seu saldo é de R$" + this.getSaldo());
	}

	public void abrirContaP() {
		if (saldo >= 20) {
			System.out.println("Abrindo conta poupança...");
			this.setAtivaCP(true);
		} else {
			System.out.println("Seu saldo é inferior a R$20,00...");
			this.setAtivaCP(false);
		}
	}

	public void abrirContaC() {
		if (saldo >= 30) {
			System.out.println("Abrindo conta corrente...");
			this.setAtivaCC(true);
		} else {
			System.out.println("Seu saldo é inferior a R$30,00...");
			this.setAtivaCC(false);
		}
	}

	public void fecharContaC() {
		if (saldo == 0) {
			System.out.println("Conta corrente fechada com sucesso...");
			this.setAtivaCC(false);
		} else if (saldo > 0)
			System.out.println(
					"Para fechar sua conta você precisa sacar seu dinheiro. Você ainda tem em sua conta: R$" + saldo);
		else
			System.out.println("Para fechar sua conta você precisa fazer um depósito de R$" + saldo * (-1));
	}

	public void fecharContaP() {
		if (saldo == 0) {
			System.out.println("Conta poupança fechada com sucesso...");
			this.setAtivaCP(false);
		} else if (saldo > 0)
			System.out.println(
					"Para fechar sua conta você precisa sacar seu dinheiro. Você ainda tem em sua conta: R$" + saldo);
		else
			System.out.println("Para fechar sua conta você precisa fazer um depósito de R$" + saldo * (-1));
	}

	public void mensalidadeConta() {
		if (this.getAtivaCC() == true || this.getAtivaCP() == true) {
			this.setSaldo(this.getSaldo() - 10);
			if (saldo < 0)
				System.out.println("Atenção, seu saldo está negativo...");
		} else
			System.out.println("Você não tem conta(s) ativa(s)...");
	}

	public void pagar(double valor) {
		if (this.getAtivaCC() == true || this.getAtivaCP() == true) {
			this.setSaldo(this.getSaldo() - valor);
			if (saldo >= 0) {
				System.out.println("Seu saldo atual é de R$" + this.getSaldo());
			}
			if (saldo < 0)
				System.out.println("Atenção, seu saldo está negativo...");
		} else
			System.out.println("Você não tem conta(s) ativa(s)...");
	}

	public void sacar(double valor) {
		if (this.getAtivaCC() == true || this.getAtivaCP() == true) {
			if (saldo >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Seu saldo atual é de R$" + this.getSaldo());
			}
			if (saldo < 0)
				System.out.println("Atenção, seu saldo está negativo...");
		} else
			System.out.println("Você não tem conta(s) ativa(s)...");
	}

	// Métodos especiais
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
