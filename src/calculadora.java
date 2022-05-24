import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual opera��o voc� gostaria de realizar? " + "\n Soma: A" + "\n Subtra��o: B"
				+ "\n Multiplica��o: C" + "\n Divis�o: D");
		String operacao = sc.next();
		System.out.println("Opera��o escolhida: " + operacao);

		switch (operacao) {
		// Soma    parcela+parcela+...+parcela=soma
		case ("A"):
			System.out.println("Qual o n�mero de parcelas a ser somado?");
			int parcelas = sc.nextInt();
			int i;
			double soma = 0;
			for (i = 1; i <= parcelas; i++) {
				System.out.println("Informe o valor da parcela " + i + ": ");
				soma += sc.nextDouble();
			}
			System.out.println("O resultado da soma �: " + soma);
			break;

		// Subtra��o    minuendo-subtraendo=resto ou diferen�a
		case ("B"):
			System.out.println("Informe o valor do minuendo:");
			double minuendo = sc.nextDouble();
			System.out.println("Informe o valor do subtraendo:");
			double subtraendo = sc.nextDouble();
			System.out.println("Resto ou diferen�a: " + (minuendo - subtraendo));
			break;

		// Multiplica��o   fator*fator*...*fator=produto
		case ("C"):
			System.out.println("Qantos fatores ser�o multiplicados: ");
			int numeroFatores = sc.nextInt();
			int b;
			double produto = 1; // elemento neutro da multiplica��o
			for (b = 1; b <= numeroFatores; b++) {
				System.out.println("Informe o valor do fator " + b + ": ");
				produto = produto * sc.nextDouble();
			}
			System.out.println("O produto da multiplica��o �: " + produto);
			break;

		// Divis�o   dividendo/divisor=quociente
		case ("D"):
			System.out.println("Informe o valor do dividendo: ");
			double dividendo = sc.nextDouble();
			System.out.println("Informe o valor do divisor: ");
			double divisor = sc.nextDouble();
			if (divisor == 0)
				System.out.println("N�o existe divis�o por zero.");
			else
				System.out.println("O quociente �: " + (dividendo / divisor));
			break;
		}
		sc.close();
	}

}
