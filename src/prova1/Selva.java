package prova1;

public class Selva {

	public static void main(String[] args) {
		//objeto da classe Bem te vi
		BemTeVi bemTeVi = new BemTeVi();
		bemTeVi.setNome("Tiquinho");
		bemTeVi.falar();
		bemTeVi.imprime();
		
		//Objeto da classe Papagaio
		Papagaio papagaio = new Papagaio();
		papagaio.setNome("Zé");
		papagaio.setVocabulario("Bom dia !!! Como vai sua tia?");
		papagaio.falar();
		papagaio.imprime();
		
		//Objeto da classe Vaca
		Vaca vaca = new Vaca();
		vaca.setNome("Mimosa");
		vaca.setPermiteOrdenha(true);
		vaca.setVelocidade(2);
		vaca.falar();
		vaca.imprime();
		
		//Objeto da classe Cachorro
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Bingo");
		cachorro.setTipoLatido(false);
		cachorro.setVelocidade(50);
		cachorro.imprime();

}
}