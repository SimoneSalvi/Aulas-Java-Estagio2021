package lista3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Numero3 {
	public static void main (String[]args) {
		DecimalFormat formato = new DecimalFormat("#.##");
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor do seu consumo em Kwh: ");		
		double consumo = sc.nextDouble();
		sc.close();
		
		double conta = 0d;
		
		if (consumo <= 300) {
			conta = consumo*1.25;
			System.out.println("A conta de energia elétrica do estabelecimento é : " + formato.format(conta) + " R$.");
		}else if (301 <= consumo && consumo <=600 ) {
			conta = consumo*1.50;
			System.out.println("A conta de energia elétrica do estabelecimento é : " + formato.format(conta) + " R$.");
		}else if (601 <= consumo && consumo <=1000 ) {
			conta = consumo*1.75;
			System.out.println("A conta de energia elétrica do estabelecimento é : " + formato.format(conta) + " R$.");
		}else{
			conta = consumo*2.00;
			System.out.println("A conta de energia elétrica do estabelecimento é : " + conta + " R$.");
		}
		
	}
}
