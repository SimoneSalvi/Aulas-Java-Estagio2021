package lista4;

import java.util.Scanner;

public class Numero9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matriz [][]  = new int [4][4];
		
		int soma = 0;
		
		for(int i=0; i<=3; i++){
			for (int j=0; j<=3; j++) {
				System.out.println("Digite o elemento: ");
				matriz[i][j] = sc.nextInt();
			//	matriz[i][j]= i+j;
				soma = soma + matriz [i][j];
			//	System.out.printf("%d %d %d %n",j+i,j,i);
			}	
		}
		sc.close();
		for (int i = 0; i<=3; i++){
			System.out.println("Elementos da diagonal principal: " + matriz[i][i]);
		}
		
		int j=3;
		int i=0;
		while (i<4) {
			System.out.println("Elementos da diagonal secundária: " + matriz[i][j]);
			i++;
			j--;
		}
		System.out.println("A média aritmética dos valores é: " + soma/16);
		}
}