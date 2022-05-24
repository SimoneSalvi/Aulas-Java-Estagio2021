package lista4;

import java.util.Scanner;

public class Numero2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor: ");
		int numero = sc.nextInt();
		
		int soma = 0;
		int i, a, b, proximo;
		a = 0;
		b = 0;
		proximo = 1;
		for (i=0; i < numero ;i++) {
			System.out.print(proximo + " , ");
			a = b;
			b = proximo;
			soma+= proximo;
			proximo = a + b;
		}
		System.out.println("\nSoma dos elementos: " + soma);
	}
}
