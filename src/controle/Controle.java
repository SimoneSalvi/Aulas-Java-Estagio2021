package controle;

public class Controle implements Controlador{
	
	//Atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//Metodos especiais	
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean getLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public boolean getTocando() {
		return tocando;
	}
	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	//Construtor
	public Controle(int volume, boolean ligado, boolean desligado) {
		this.volume = 10;
		this.ligado = false;
		this.tocando = false;
	}
	
	//Métodos
	public void ligar() {
		this.setLigado(true);
	}
	
	public void desligar() {
		this.setLigado(false);
	}
	
	public void maisVolume() {
		if(this.getLigado()==true && this.getVolume()<100)
			this.setVolume(this.getVolume()+1);
		else if(this.getVolume() == 100)
			System.out.println("Volume máximo..Não posso aumentar.");
	}
	
	public void menosVolume() {
		if(this.getLigado()==true && this.getVolume()>0)
			this.setVolume(this.getVolume()-1);
		else if(this.getVolume() == 0)
			System.out.println("Já estou sem volume..");
	}
	
	public void ligarMudo() {
		if(this.getLigado()==true)
			this.setVolume(0);
	}
	
	public void desligarMudo() {
		if(this.getLigado()==true)
			this.setVolume(10);
	}
	
	public void play() {
		if (this.getLigado()==true && this.getTocando()==false)
			this.setTocando(true);
	}
	
	public void pause() {
		if (this.getLigado()==true && this.getTocando()==true)
			this.setTocando(false);
	}	
	
	public void abrirMenu() {
		if (this.getLigado()==true)
		System.out.println("Está ligado? " + this.getLigado());
		System.out.println("Está tocando? " +  this.getTocando());
		System.out.println("Volume: ");
		for(int i=0; i<=this.getVolume(); i=i+5)
			System.out.println("|");
		for(int i = this.getVolume(); i<=100; i+=5)
			System.out.println("-");
		System.out.println("("+ this.getVolume()+ "%)");
			
	}
	public void fecharMenu() {
		System.out.println("Fechando Menu..");
	}
	
}
