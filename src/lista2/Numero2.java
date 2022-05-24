package lista2;

import java.util.Scanner;

public class Numero2 {

	public static void main(String[] args) {
		
		System.out.println("Digite o valor do raio da esfera em metros: ");
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		sc.close();
		
		double volume = 4*(3.14 * Math.pow(raio,3))/3;
		System.out.println("O volume da esfera de raio " + raio + " é " + volume + " m^3");
	}

}