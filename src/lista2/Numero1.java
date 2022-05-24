package lista2;

import java.util.Scanner;

public class Numero1 {

	public static void main(String[] args) {
	double m1 = 0d;
	double m2 = 0d;
	double m3 = 0d;
	
		System.out.println("Digite o custo da matéria-prima 1: ");
		Scanner sc = new Scanner(System.in);
		m1 = sc.nextDouble();
		System.out.println("Digite o custo da matéria-prima 2: ");
	    m2 = sc.nextDouble();
		System.out.println("Digite o custo da matéria-prima 3: ");
		m3 = sc.nextDouble();
		sc.close();
		
		double custoTotal = (m1 + 3*m2 + 2*m3);
		System.out.println("O valor total dos custos é: " + custoTotal);
	}

}
