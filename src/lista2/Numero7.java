package lista2;

import java.util.Scanner;

public class Numero7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor da dist�ncia percorrida em km: ");
		double distancia = sc.nextDouble();
		System.out.println("Informe quantas horas voc� levou para percorrer esta dist�ncia: ");
		double tempo = sc.nextDouble();
		sc.close();
		
		double velocidadeMedia = distancia/tempo;
		
		System.out.println("A velocidade m�dia do carro � " + velocidadeMedia + " Km/h");
	}
}
