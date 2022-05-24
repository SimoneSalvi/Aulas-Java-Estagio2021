package lista2;

import java.util.Scanner;

public class Numero7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor da distância percorrida em km: ");
		double distancia = sc.nextDouble();
		System.out.println("Informe quantas horas você levou para percorrer esta distância: ");
		double tempo = sc.nextDouble();
		sc.close();
		
		double velocidadeMedia = distancia/tempo;
		
		System.out.println("A velocidade média do carro é " + velocidadeMedia + " Km/h");
	}
}
