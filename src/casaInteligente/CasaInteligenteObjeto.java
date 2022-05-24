package casaInteligente;

public class CasaInteligenteObjeto {

	public static void main(String[] args) {
		// internet, luz acesa , energia , portaAberta, estoqueCafe
		CasaInteligente casa1 = new CasaInteligente(false, false, false, false, 10);

		casa1.status();
		casa1.ligarInternet(); 
//		casa1.desligarInternet(); 
		casa1.ligarEnergia(); 
//		casa1.desligarEnergia(); 
		casa1.abrirPortaPrincipal();
		casa1.fecharPortaPrincipal();
//		casa1.acenderLuz();
//		casa1.apagarLuz();
		casa1.fazerCafe();
     	casa1.fazerCafe();
//		casa1.reporEstoqueCafe();

		System.out.println("-------------------------");

		casa1.status();
	}

}
