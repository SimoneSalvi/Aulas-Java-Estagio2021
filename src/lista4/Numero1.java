package lista4;

import java.util.Scanner;

public class Numero1 {

	public static void main(String[] args) {
		
		int n = 0;
		int soma = 0;
		int totalNumeros=0;
		double media ;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Digite um n�mero inteiro: ");
			n = sc.nextInt();
			soma += n;
			totalNumeros ++;
		}while(n != 0);
		
		System.out.println("A soma dos n�meros informados � " + soma + " e a m�dia entre os n�meros informados � " + soma/(totalNumeros-1));
	}
}
