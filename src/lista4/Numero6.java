package lista4;

import java.util.Scanner;

public class Numero6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o primeiro número natural:");
		int num1 = sc.nextInt();
		System.out.println("Informe o outro número natural:");
		int num2 = sc.nextInt();

		int menor = num1;
		int maior = num2;
		
		if (num1<num2) {
			 menor = num1;
			 maior = num2;
		}
		
		int soma = 0;
		for (int i= menor; i<=maior; i++) {
			soma+= i;
		}	
		System.out.println("A soma do intervalo informado é " + soma);
		}
}
