import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual operação você gostaria de realizar? " + "\n Soma: A" + "\n Subtração: B"
				+ "\n Multiplicação: C" + "\n Divisão: D");
		String operacao = sc.next();
		System.out.println("Operação escolhida: " + operacao);

		switch (operacao) {
		// Soma    parcela+parcela+...+parcela=soma
		case ("A"):
			System.out.println("Qual o número de parcelas a ser somado?");
			int parcelas = sc.nextInt();
			int i;
			double soma = 0;
			for (i = 1; i <= parcelas; i++) {
				System.out.println("Informe o valor da parcela " + i + ": ");
				soma += sc.nextDouble();
			}
			System.out.println("O resultado da soma é: " + soma);
			break;

		// Subtração    minuendo-subtraendo=resto ou diferença
		case ("B"):
			System.out.println("Informe o valor do minuendo:");
			double minuendo = sc.nextDouble();
			System.out.println("Informe o valor do subtraendo:");
			double subtraendo = sc.nextDouble();
			System.out.println("Resto ou diferença: " + (minuendo - subtraendo));
			break;

		// Multiplicação   fator*fator*...*fator=produto
		case ("C"):
			System.out.println("Qantos fatores serão multiplicados: ");
			int numeroFatores = sc.nextInt();
			int b;
			double produto = 1; // elemento neutro da multiplicação
			for (b = 1; b <= numeroFatores; b++) {
				System.out.println("Informe o valor do fator " + b + ": ");
				produto = produto * sc.nextDouble();
			}
			System.out.println("O produto da multiplicação é: " + produto);
			break;

		// Divisão   dividendo/divisor=quociente
		case ("D"):
			System.out.println("Informe o valor do dividendo: ");
			double dividendo = sc.nextDouble();
			System.out.println("Informe o valor do divisor: ");
			double divisor = sc.nextDouble();
			if (divisor == 0)
				System.out.println("Não existe divisão por zero.");
			else
				System.out.println("O quociente é: " + (dividendo / divisor));
			break;
		}
		sc.close();
	}

}
