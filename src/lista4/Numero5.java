package lista4;

import java.util.Scanner;

public class Numero5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do seu salário: ");
		double salarioBruto = sc.nextDouble();
		System.out.println("Digite o valor da parcela de empréstimo que "
				+ "você gostaria de receber");
		double prestacaoTestar = sc.nextDouble();
		sc.close();
		
		if (prestacaoTestar <= salarioBruto*0.25)
			System.out.println("O empréstimo pode ser consedido. Valor máx da parcela = " + salarioBruto*0.25);
		else
			System.out.println("O empréstimo não pode ser consedico.");
	}
}
