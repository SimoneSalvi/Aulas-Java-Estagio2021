package prova1;

public class Festa {

	public static void main(String[] args) {
		//Objeto da classe Igreja
		Igreja quermesse = new Igreja();
		quermesse.setConvidados(100);
		quermesse.setTipoComida("pastel e guaraná");
		quermesse.setTipoMusica("Popular");
		quermesse.conversar();
		quermesse.dancar();
		
		//Objeto da classe Creche
		Creche creche = new Creche();
		creche.setConvidados(20);
		creche.setTipoComida("cachorro-quente e suco");
		creche.setTipoMusica("Infantil");
		creche.conversar();
		creche.dancar();
		
		//Objeto da classe Bar
		Bar bar = new Bar();
		bar.setConvidados(50);
		bar.setTipoComida("petiscos e drinks");
		bar.setTipoMusica("Sertanejo");
		bar.conversar();
		bar.dancar();

	}

}
