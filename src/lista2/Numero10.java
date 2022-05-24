package lista2;

import java.util.Scanner;

public class Numero10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o seu salário em R$: ");
		double salario = sc.nextDouble();
		sc.close();
		
		double imposto = salario*0.05;
		
		System.out.println("O valor a ser pago de imposto é: " + imposto + "R$");
	}
}
