package lista4;

import java.util.Scanner;

public class Numero8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma1 = 0; // 0 a 15
		int soma2 = 0; // 16 a 30
		int soma3 = 0; // 31 a 45
		int soma4 = 0; // 46 a 60
		int soma5 = 0; // maior que 60
		int idade;

		for (int i=1; i<=50; i++) {
			System.out.println("Digite a idade");
			idade = sc.nextInt();
			if (idade<=15)
				soma1 ++;
			if (idade>=16 && idade <=30)
				soma2 ++;
			if (idade>=31 && idade <=45)
				soma3 ++;
			if (idade>=46 && idade <=60)
				soma4 ++;
			if (idade>60)
				soma5 ++;
		}
		System.out.println("Porcentagem faixa etária 0 a 15 anos: " + (double)(soma1/50.0)*100 + " %");
		System.out.println("Porcentagem faixa etária 16 a 30 anos: " + (double)(soma2/50.0)*100+ " %");
		System.out.println("Porcentagem faixa etária 31 a 45 anos: " + (double)(soma3/50.0)*100 + " %");
		System.out.println("Porcentagem faixa etária 46 a 60 anos: " + (double)(soma4/50.0)*100 + " %");
		System.out.println("Porcentagem faixa etária maior que 60 anos: " + (double)(soma5/50.0)*100 + " %");

	}

}
