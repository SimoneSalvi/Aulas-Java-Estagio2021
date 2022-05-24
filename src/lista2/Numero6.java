package lista2;

import java.util.Scanner;

public class Numero6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor da compra em R$: ");
		double valorCompra = sc.nextDouble();
		System.out.println("Informe a porcentagem do desconto: ");
		double descontoPorcentagem = sc.nextDouble();
		sc.close();
		
		double descontoDecimal = (100-descontoPorcentagem)/100;
		double valorCompraComDesconto = valorCompra*descontoDecimal;
		double comissaoVendedor = valorCompraComDesconto*0.03;
		
		System.out.println("O valor final da compra do cliente é " + valorCompraComDesconto + "R$ "
			+ " e o valor da comissão do vendedor é " + comissaoVendedor + "R$");
	}

}
