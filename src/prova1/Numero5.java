package prova1;

public class Numero5 {

	public static void main(String[] args) {

		int matriz[][] = new int[10][10];
		int soma = 0;
		int i;
		int j;

		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				matriz[i][j] = i + j;
				soma += matriz[i][j];
			}
		}

		// Diagonal Principal
		for (i = 0; i < 10; i++) {
			System.out.println("Elementos da diagonal principal: " + matriz[i][i]);

			// Diagonal Secundária
			j = 9;
			i = 0;
			while (i < 9) {
				System.out.println("Elementos da diagonal secundária: " + matriz[i][j]);
				i++;
				j--;
			}
			// Média aritmética
			System.out.println("A média aritmética dos valores é: " + soma / 100);
		}

	}

}
