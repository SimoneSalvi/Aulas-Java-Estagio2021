package lista5.ex4calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String operacao = "";
		double numeroPartida = 0d;
		double numeroSeguinte = 0d;

		System.out.println("Entre com o primeiro n�mero: ");
		numeroPartida = sc.nextDouble();
		double resultado = numeroPartida; //O resultado � o que o visor da calculadora est� mostrando

		do {
			System.out.println("Escolha a opera��o " + "\n Soma: '+'" + "\n Subtra��o: '-'" + "\n Multiplica��o: 'x'"
					+ "\n Divis�o: '/'" + "\n Para ver o resultado: '='");
			operacao = sc.next();

			if (!operacao.equals("=")) {
				System.out.println("Entre com o pr�ximo n�mero: ");
				numeroSeguinte = sc.nextDouble();

				// Soma
				if (operacao.equals("+")) {
					resultado += numeroSeguinte;
//					continue;
				}

				// Subtra��o
				if (operacao.equals("-")) {
					resultado -= numeroSeguinte;
//					continue;
				}

				// Multiplica��o
				if (operacao.equals("x")) {
					resultado *= numeroSeguinte;
//					continue;
				}

				// Divis�o
				if (operacao.equals("/") && numeroSeguinte != 0) {
					double dividendo = resultado;
					resultado = dividendo / numeroSeguinte;
//					continue;
				} else if (operacao.equals("/") && numeroSeguinte == 0) {
					System.out.println("N�o � poss�vel dividir por zero, entre com outro n�mero: ");
					numeroSeguinte = sc.nextDouble();
					double dividendo = resultado;
					resultado = dividendo / numeroSeguinte;

				}

			}
			if (operacao.equals("="))
				System.out.println("O resultado � " + resultado);

		} while (!operacao.equals("="));
		System.out.println("Encerrando...");
		
		sc.close();
	}
}
