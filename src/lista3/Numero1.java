package lista3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Numero1 {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a sua altura em metros: ");
		double altura = sc.nextDouble();
		System.out.println("Digite o seu sexo (M/F): ");
		String sexo = sc.next();
		
		sc.close();	
		
		double pesoIdeal=0d;
		DecimalFormat formato = new DecimalFormat("#.##");
		if (sexo.equals("M")) { 
		    pesoIdeal = (72.7 * altura)-58;
			System.out.println("O seu peso ideal Masculino é " + formato.format(pesoIdeal) + " Kg");
		}
		else {
		    pesoIdeal = (62.1 * altura)-44.7;
			System.out.println("O seu peso ideal Feminino é " + formato.format(pesoIdeal) + " Kg");
		}
	}
}
