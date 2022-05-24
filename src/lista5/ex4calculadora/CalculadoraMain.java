package lista5.ex4calculadora;

import java.util.Scanner;

public class CalculadoraMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Calculadora
		Calculadora2 calculadora = new Calculadora2();

		System.out.println("Entre com o primeiro número: ");
		calculadora.setNumeroPartida(sc.nextDouble());
		calculadora.setResultado(calculadora.getNumeroPartida()); // O resultado é o que o visor da calculadora está
																	// mostrando

		do {
			System.out.println("Escolha a operação " + "\n Soma: '+'" + "\n Subtração: '-'" + "\n Multiplicação: 'x'"
					+ "\n Divisão: '/'" + "\n Para ver o resultado: '='");
			calculadora.setOperacao(sc.next());

			if (!calculadora.getOperacao().equals("=")) {
				System.out.println("Entre com o próximo número: ");
				calculadora.setNumeroSeguinte(sc.nextDouble());

				// Soma
				if (calculadora.getOperacao().equals("+")) {
					calculadora.somar();
				}

				// Subtração
				if (calculadora.getOperacao().equals("-")) {
					calculadora.subtrair();
				}

				// Multiplicar
				if (calculadora.getOperacao().equals("x")) {
					calculadora.multiplicar();
				}

				// Dividir
				if (calculadora.getOperacao().equals("/") && calculadora.getNumeroSeguinte() != 0) {
					calculadora.dividir();
				} else if (calculadora.getOperacao().equals("/") && calculadora.getNumeroSeguinte() == 0) {
					System.out.println("Não é possível dividir por zero.. ");
					System.exit(0);
				}

			}
			if (calculadora.getOperacao().equals("="))
				calculadora.sair();

		} while (!calculadora.getOperacao().equals("="));
		System.out.println("Encerrando...");

		sc.close();

	}

}
