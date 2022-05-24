package aulaJava;

import java.util.Scanner;

public class Scaner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Digite uma frase: ");
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();
		System.out.println("A frese digitada foi " + frase);
		sc.close();
		
		

	}

}
