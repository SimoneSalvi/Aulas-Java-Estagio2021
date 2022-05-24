package lista2;

import java.util.Scanner;

public class Numero5 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do primeiro número inteiro: ");
		double n1 = sc.nextDouble();
		System.out.println("Digite o valor do segundo número inteiro: ");
		double n2 = sc.nextDouble();
		System.out.println("Digite o valor do terceiro número inteiro: ");
		double n3 = sc.nextDouble();
		sc.close();
		
		double media = (double) (n1+n2+n3)/3;
		System.out.println("A média dos três números informados é: " + media);

	
	}

}
