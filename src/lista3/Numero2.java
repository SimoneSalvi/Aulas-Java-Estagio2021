package lista3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Numero2 {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Digite um valor inteiro: ");
			int n1 = sc.nextInt();
			System.out.println("Digite um valor inteiro: ");
			int n2 = sc.nextInt();
			System.out.println("Digite um valor inteiro: ");
			int n3 = sc.nextInt();
		    sc.close();
			
			double media = (double) (n1 + n2 + n3)/3;
			DecimalFormat formato = new DecimalFormat("#.##");
			
			if (n1<n2 && n1<n3)
				System.out.println("O menor valor informado � " + n1 + " e a m�dia entre os tr�s valores inteiros iformados � " + formato.format(media));
			
			else if (n2<n1 && n2<n3)
			    System.out.println("O menor valor informado � " + n2 + " e a m�dia entre os tr�s valores inteiros iformados � " + formato.format(media));
			
			else 
				System.out.println("O menor valor informado � " + n3 + " e a m�dia entre os tr�s valores inteiros iformados � " + formato.format(media));
	}
}
