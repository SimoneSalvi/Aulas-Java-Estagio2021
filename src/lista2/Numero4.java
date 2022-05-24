package lista2;

import java.util.Scanner;

public class Numero4 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da base do triangulo em metros: ");
		double base = sc.nextDouble();		
		System.out.println("Digite o valor da altura do triangulo em metros: ");
		double altura = sc.nextDouble();
		sc.close();
		
		double area = base*altura/2;
		System.out.println("A área do triangulo é " + area + " m^2");
	}
}
