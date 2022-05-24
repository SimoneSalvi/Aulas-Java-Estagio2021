package lista2;

import java.util.Scanner;

public class Numero8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor do produto em R$: ");
		double valorProduto = sc.nextDouble();
		sc.close();
		double novoValorProduto = valorProduto+(valorProduto*0.25);
		
		System.out.println("O novo valor de venda é: " + novoValorProduto + "R$");
	}
}
