package lista3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Numero3case {
	public static void main (String[]args) {
		DecimalFormat formato = new DecimalFormat("#.##");
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor do seu consumo em Kwh: ");		
		int consumo = sc.nextInt();
		sc.close();
		
		double conta = 0d;
		int a, b, c, d;
		if(consumo <= 300)
			a = 1;
		if(301 <= consumo && consumo <=600 )
			b = 2;
		if (601 <= consumo && consumo <=1000 )
			c = 3;
		if (consumo>1000)
			d = 4;
		
		switch (consumo) {
		case 1:
			conta = consumo*1.25;
			System.out.println("A conta de energia elétrica do estabelecimento é : " + formato.format(conta) + " R$.");
		    break;
		case 2:
			conta = consumo*1.50;
			System.out.println("A conta de energia elétrica do estabelecimento é : " + formato.format(conta) + " R$.");
		    break;
		case 3:
			conta = consumo*1.75;
			System.out.println("A conta de energia elétrica do estabelecimento é : " + formato.format(conta) + " R$.");
		    break;
		case 4:
			conta = consumo*2.00;
			System.out.println("A conta de energia elétrica do estabelecimento é : " + conta + " R$.");
			break;
		}
		
	}
}