package lista4;

import java.util.Scanner;

//dado um n�mero, informe se ele � divis�vel por 5

public class Numero4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor inteiro: ");
		int numero = sc.nextInt();
		
		if (numero%5==0) 
			System.out.println("O n�mero informado � divis�vel por 5.");
		else 
			System.out.println("O n�mero informado n�o � divis�vel por 5.");
	}
}
