package lista4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Numero10 {

	public static void main(String[] args) {
		DecimalFormat formato = new DecimalFormat("#.##");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do seu salário: ");
		double salarioBruto = sc.nextDouble();
		sc.close();
		
		if (salarioBruto<500) {
			System.out.println("O valor atualizado do salário é: " + formato.format(salarioBruto*1.30) + " R$.");
		}
		if (salarioBruto>=500 && salarioBruto<=1500) {
			System.out.println("O valor atualizado do salário é: " + formato.format(salarioBruto*1.15) + " R$.");
		}
		if (salarioBruto>1500) {
			System.out.println("O valor atualizado do salário é: " + formato.format(salarioBruto*1.05) + " R$.");
		}
	}
}
