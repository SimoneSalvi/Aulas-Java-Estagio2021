package casaInteligente;

import java.util.Scanner;

public class CasaInteligente implements ControladorCasa {

	Scanner leia = new Scanner(System.in);

	// Atributos
	private boolean internet;
	private boolean ligadaLuz;
	private boolean energia;
	private boolean abertaPorta;
	private int cafeEstoque;

	// Construtor
	public CasaInteligente(boolean internet, boolean ligadaLuz, boolean energia, boolean abertaPorta, int cafeEstoque) {
		this.internet = internet;
		this.ligadaLuz = ligadaLuz;
		this.energia = energia;
		this.abertaPorta = abertaPorta;
		this.cafeEstoque = cafeEstoque;

	}

// Métodos

	@Override
	public void ligarInternet() {
		this.setInternet(true);
	}

	@Override
	public void desligarInternet() {
		this.setInternet(false);
	}

	@Override
	public void ligarEnergia() {
		this.setEnergia(true);
	}

	@Override
	public void desligarEnergia() {
		this.setEnergia(false);
	}

	@Override
	public void abrirPortaPrincipal() {
		if (this.getEnergia() == false) {
			System.out.println("Sem energia..não posso abrir a porta");
		}
		if (this.getInternet() == true && this.getEnergia() == true && this.getAbertaPorta() == false) {
			System.out.println("Abrindo porta principal...");
			this.setAbertaPorta(true);
		} else if (this.getInternet() == true && this.getEnergia() == true && this.getAbertaPorta() == true) {
			System.out.println("Sua porta já está aberta..");
			this.setAbertaPorta(false);
		} else if (this.getInternet() == false)
			System.out.println("Sem internet..");
	}

	@Override
	public void fecharPortaPrincipal() {
		if (this.getEnergia() == false)
			System.out.println("Sem energia..não posso fechar a porta");
		if (this.getInternet() == true && this.getEnergia() == true && this.getAbertaPorta() == true) {
			System.out.println("Fechando porta principal...");
			this.setAbertaPorta(false);
		} else if (this.getInternet() == true && this.getAbertaPorta() == false) {

			System.out.println("Sua porta já está fechada..");
		} else if (this.getInternet() == false)
			System.out.println("Sem internet..");

	}

	@Override
	public void acenderLuz() {
		if (this.getInternet() == true && this.getEnergia() == true && this.getLigadaLuz() == true) {
			System.out.println("Sua luz já está acesa..");
		} else if (this.getInternet() == true && this.getEnergia() == true && this.getLigadaLuz() == false) {
			System.out.println("Acendendo..");
			this.setLigadaLuz(true);
		} else if (this.getInternet() == false)
			System.out.println("Sem internet..");
		else if (this.getEnergia() == false)
			System.out.println("Sem energia..");
	}

	@Override
	public void apagarLuz() {
		if (this.getInternet() == true && this.getEnergia() == true && this.getLigadaLuz() == true) {
			System.out.println("Sua luz já está acesa..");
		} else if (this.getInternet() == true && this.getEnergia() == true && this.getLigadaLuz() == false) {
			System.out.println("Acendendo..");
			this.setLigadaLuz(false);
		} else if (this.getInternet() == false)
			System.out.println("Sem internet..");
		else if (this.getEnergia() == false)
			System.out.println("Sem energia..");
	}

	public void fazerCafe() {
		if (this.getInternet() == true && this.getEnergia() == true && this.getCafeEstoque() > 0) {
			System.out.println("Quantos cafés vc quer fazer?");
			int a = leia.nextInt();
			System.out.println("Fazendo " + a + " cafés..");
			this.setCafeEstoque(this.getCafeEstoque() - a);
			if (this.getInternet() == true && this.getEnergia() == true && this.getCafeEstoque() == 0) {
				System.out.println("Repor o estoque de cápsulas..");
			}
			
		}else if(this.getCafeEstoque() == 0)
			System.out.println("Repor o estoque de cápsulas..");
		else if (this.getCafeEstoque() <5)
			System.out.println("Estoque baixo, em alerta..");
	}

	public void reporEstoqueCafe() {
		System.out.println("Quantas cápsulas vc quer repor? ");
		int b = leia.nextInt();
		this.setCafeEstoque(this.getCafeEstoque() + b);
	}

	public void status() {
		System.out.println("Internet funcionando: " + this.getInternet());
		System.out.println("Luz acesa: " + this.getLigadaLuz());
		System.out.println("Tem energia: " + this.getEnergia());
		System.out.println("Porta aberta: " + this.getAbertaPorta());
		System.out.println("Cápsulas na maq de café: " + this.getCafeEstoque());

	}

	// Metodos get e set
	public boolean getLigadaLuz() {
		return ligadaLuz;
	}

	public void setLigadaLuz(boolean ligadaLuz) {
		this.ligadaLuz = ligadaLuz;
	}

	public boolean getEnergia() {
		return energia;
	}

	public void setEnergia(boolean energia) {
		this.energia = energia;
	}

	public boolean getInternet() {
		return internet;
	}

	public void setInternet(boolean internet) {
		this.internet = internet;
	}

	public boolean getAbertaPorta() {
		return abertaPorta;
	}

	public void setAbertaPorta(boolean abertaPorta) {
		this.abertaPorta = abertaPorta;
	}

	public int getCafeEstoque() {
		return cafeEstoque;
	}

	public void setCafeEstoque(int cafeEstoque) {
		this.cafeEstoque = cafeEstoque;
	}

}
