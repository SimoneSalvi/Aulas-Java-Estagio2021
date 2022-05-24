package lista5.ex4calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String operacao = "";
		double numeroPartida = 0d;
		double numeroSeguinte = 0d;

		System.out.println("Entre com o primeiro número: ");
		numeroPartida = sc.nextDouble();
		double resultado = numeroPartida; //O resultado é o que o visor da calculadora está mostrando

		do {
			System.out.println("Escolha a operação " + "\n Soma: '+'" + "\n Subtração: '-'" + "\n Multiplicação: 'x'"
					+ "\n Divisão: '/'" + "\n Para ver o resultado: '='");
			operacao = sc.next();

			if (!operacao.equals("=")) {
				System.out.println("Entre com o próximo número: ");
				numeroSeguinte = sc.nextDouble();

				// Soma
				if (operacao.equals("+")) {
					resultado += numeroSeguinte;
//					continue;
				}

				// Subtração
				if (operacao.equals("-")) {
					resultado -= numeroSeguinte;
//					continue;
				}

				// Multiplicação
				if (operacao.equals("x")) {
					resultado *= numeroSeguinte;
//					continue;
				}

				// Divisão
				if (operacao.equals("/") && numeroSeguinte != 0) {
					double dividendo = resultado;
					resultado = dividendo / numeroSeguinte;
//					continue;
				} else if (operacao.equals("/") && numeroSeguinte == 0) {
					System.out.println("Não é possível dividir por zero, entre com outro número: ");
					numeroSeguinte = sc.nextDouble();
					double dividendo = resultado;
					resultado = dividendo / numeroSeguinte;

				}

			}
			if (operacao.equals("="))
				System.out.println("O resultado é " + resultado);

		} while (!operacao.equals("="));
		System.out.println("Encerrando...");
		
		sc.close();
	}
}
