package prova1;

import java.util.Scanner;

public class Numero4 {

	public static void main(String[] args) {

		int numeroUsuario;
		int soma;
		int a, b, c;
		double media;
//		int vetor[];

		Scanner leia = new Scanner(System.in);
		System.out.println("Informe a posição escolhida: ");
		numeroUsuario = leia.nextInt();

		int vetor[] = new int [numeroUsuario];
		soma = 0;
		a = 1;
		b = 0;

		for (int i = 0; i < numeroUsuario; i++) {
			c = a + b;
			a = b;
			b = c;
			soma += c;
			vetor[i] = c;
		}

		System.out.println("O elemento da posição " + numeroUsuario + " apresenta a soma=" + soma + " e a média entre os elementos "
				+ (double)soma / (vetor.length));
		leia.close();

	}
}
