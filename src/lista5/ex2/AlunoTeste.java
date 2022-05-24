package lista5.ex2;

import java.util.Scanner;

public class AlunoTeste extends Aluno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Armazenar as notas dos 5 alunos em uma matriz
		int matriz[][] = new int[3][5]; // matriz de 3 linhas e 5 colunas

		for (int i = 0; i < 3; i++) { // linhas
			for (int j = 0; j < 5; j++) { // colunas
				System.out.println("Digite a nota " + i + " do aluno da coluna " + j);
				matriz[i][j] = sc.nextInt();
//				matriz[i][j] = i + j;
			}
			sc.close();
		}

		// Media Aluno1
		double somaA1 = 0d;
		for (int i = 0; i < 3; i++) {
			int j = 0;
			somaA1 += matriz[i][j];
		}
		double mediaA1 = somaA1 / 3;

		// Media Aluno2
		double somaA2 = 0d;
		for (int i = 0; i < 3; i++) {
			int j = 1;
			somaA2 += matriz[i][j];
		}
		double mediaA2 = somaA2 / 3;

		// Media Aluno3
		double somaA3 = 0d;
		for (int i = 0; i < 3; i++) {
			int j = 2;
			somaA3 += matriz[i][j];
		}
		double mediaA3 = somaA3 / 3;

		// Media Aluno4
		double somaA4 = 0d;
		for (int i = 0; i < 3; i++) {
			int j = 3;
			somaA4 += matriz[i][j];
		}
		double mediaA4 = somaA4 / 3;

		// Media Aluno5
		double somaA5 = 0d;
		for (int i = 0; i < 3; i++) {
			int j = 4;
			somaA5 += matriz[i][j];
		}
		double mediaA5 = somaA5 / 3;

		System.out.println("A média total dos alunos foi " + (mediaA1 + mediaA2 + mediaA3 + mediaA4 + mediaA5) / 5);

	}
}
