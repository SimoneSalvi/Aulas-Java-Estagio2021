package lista5.ex6.codigo2;

public class Cidade {

	public static void main(String[] args) {
		// casa1
		System.out.println("******Casa********");
		Casa casa1 = new Casa();
		casa1.setCor("Areia");
		casa1.setQuantidadeComodos(7);
		casa1.setAreaConstru�da(100);// m^2
		casa1.setNumeroAndares(1);
		casa1.setPiscina(true);
		casa1.limparImovel();
		casa1.venderIm�vel(); // a maneira como se vende n�o foi sobrescrita
		casa1.reformarImovel();

		System.out.println("********************");

		// apartamento1
		System.out.println("******Apartamento********");
		Apartamento apartamento1 = new Apartamento();
		apartamento1.setCor("Areia");
		apartamento1.setQuantidadeComodos(5);
		apartamento1.setAreaConstru�da(50);// m^2
		apartamento1.limparImovel();
		apartamento1.venderIm�vel(); // a maneira como se vende n�o foi sobrescrita
		apartamento1.reformarImovel();
	}

}
