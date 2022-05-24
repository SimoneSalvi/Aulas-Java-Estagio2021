package lista2;

import java.util.Scanner;

public class Numero3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o seu peso em Kg: ");
        double peso = sc.nextDouble();
		System.out.println("Digite a sua altura em metros: ");
        double altura = sc.nextDouble();
        sc.close();
        
        double massaCorp = peso/(Math.pow(altura, 2));
        
        System.out.println("O seu ICM é " + massaCorp + "Kg/m2");
	}

}
