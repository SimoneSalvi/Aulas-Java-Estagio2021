package esportes;

public class Jogos {

	public static void main(String[] args) {
		// Futebol
		System.out.println("******Futebol******");
		Futebol futebol = new Futebol();
		futebol.setQuantidadePessoasTime(11);
		futebol.jogarRegras();
		
		System.out.println("----------------------");

		// Voleibol
		System.out.println("******Voleibol******");
		Voleibol voleibol = new Voleibol();
		voleibol.setQuantidadePessoasTime(6);
		voleibol.jogarRegras();
		
		System.out.println("----------------------");
		
		// Basquete
		System.out.println("******Basquete******");
		Basquete basquete = new Basquete();
		basquete.setQuantidadePessoasTime(10);
		basquete.jogarRegras();
		
		System.out.println("----------------------");
	}

}
