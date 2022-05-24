package lista2;

import java.util.Scanner;

public class Numero9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o seu peso atual: ");
		double pesoAtual = sc.nextDouble();
		System.out.println("Informe o seu peso desejado: ");
		double pesoDesejado = sc.nextDouble();
		sc.close();
		
		double percentualPesoPerder = ((pesoAtual-pesoDesejado)/pesoAtual)*100;
		
		System.out.println("O percentual de peso a ser eliminado é " + percentualPesoPerder + "%");
	}

}
