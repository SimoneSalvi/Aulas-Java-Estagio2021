package lista4;

//calcule e imprima o somatório dos números pares 
//existentes entre 100 e 500

public class Numero3 {

	public static void main(String[] args) {
		int i;
		int soma = 0;
		for (i=100; i<501; i++) {
			if (i%2==0) 
				soma+=i;
		}
		System.out.println("A soma dos números "
			+ "pares existentes entre 100 e 500 é " + soma);
	}
}
