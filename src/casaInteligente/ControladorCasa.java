package casaInteligente;

public interface ControladorCasa {

	public abstract void ligarInternet();

	public abstract void desligarInternet();

	public abstract void ligarEnergia();

	public abstract void desligarEnergia();

	public abstract void abrirPortaPrincipal();

	public abstract void fecharPortaPrincipal();

	public abstract void acenderLuz();

	public abstract void apagarLuz();
	
	public abstract void fazerCafe();

	public abstract void reporEstoqueCafe();

}
