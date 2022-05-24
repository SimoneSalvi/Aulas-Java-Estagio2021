package controle2;

public class ControleRemoto implements Controlador{

	// Atributos
	private boolean ligada;
	private boolean smart;
	private int volume;
	private int canal;


	// Métodos:
	@Override
	public void ligarTV() {
		this.setLigada(true);
		
	}

	@Override
	public void desligarTV() {
		this.setLigada(false);
		
	}

	@Override
	public void mudarCanalTV() {
		if(this.getLigada()==true)
			this.setCanal(this.getCanal()+1);
	}

	@Override
	public void abriServiçoSmart() {
		if(this.getSmart()==true && this.getLigada()==true)
			System.out.println("Ligando serviço smart...");
		else if (this.getSmart()==false && this.getLigada()==true)
			System.out.println("Sua TV não tem serviço smart");
	}

	@Override
	public void fecharServiçoSmart() {
		if(this.getSmart()==true && this.getLigada()==true)
			System.out.println("Fechando serviço smart...");
		
	}

	@Override
	public void aumentoVolume() {
		if (this.getLigada()==true && this.getVolume()<100)
			this.setVolume(this.getVolume()+1);
	}

	@Override
	public void diminuiVolume() {
		if (this.getLigada()==true && this.getVolume()>0)
			this.setVolume(this.getVolume()-1);
		else if (this.getLigada()==true && this.getVolume()==0)
			this.setVolume(getVolume()-1);
	}
	
	
	
	// Métodos Get e Set


	public boolean getLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public boolean getSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	// Construtor

	public ControleRemoto(boolean ligada, boolean smart, int volume) {
		super();
		this.ligada = ligada;
		this.smart = smart;
		this.volume = volume;
	}

}
