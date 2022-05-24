package lista4;

import java.util.Scanner;

//dado um número, informe se ele é divisível por 5

public class Numero4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor inteiro: ");
		int numero = sc.nextInt();
		
		if (numero%5==0) 
			System.out.println("O número informado é divisível por 5.");
		else 
			System.out.println("O número informado não é divisível por 5.");
	}
}
