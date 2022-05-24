package lista4;

import java.util.Scanner;

public class Numero7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, numero, soma=0;
		
		for (i=0; i<=20; i++) {
			System.out.println("Informe o número natural: ");
			numero = sc.nextInt();
			if (numero%2==0) {
				soma+=numero;
			}	
		}	
		System.out.println("Soma: " + soma);
	}
}
