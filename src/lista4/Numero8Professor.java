package lista4;

import java.util.Scanner;

public class Numero8Professor {

	public static void main(String[] args) {
        int idade, g1, g2, g3, g4, g5;
        g1 = 0;
        g2 = 0;
        g3 = 0;
        g4 = 0;
        g5 = 0;            
        Scanner leitura = new Scanner(System.in);
        
        for (int i=1; i<=5; i++) {
            System.out.print("Digite a " + i + "-ésima idade: ");
            idade = leitura.nextInt();
            if(idade > 0 && idade <= 15)
                g1 = g1 + 1;
            if(idade > 15 && idade <= 30)
                g2 = g2 + 1;
            if(idade > 30 && idade <= 45)
                g3 = g3 + 1;
            if(idade > 45 && idade <= 60)
                g4 = g4 + 1;
            if(idade > 60)
                g5 = g5 + 1;
        }
        
        System.out.println("O percentual da faixa 0  - 15anos é: " + 
                (g1/5.0)*100.0 + "%");
        System.out.println("O percentual da faixa 16 - 30anos é: " + 
                (g2/5.0)*100.0 + "%");
        System.out.println("O percentual da faixa 31 - 45anos é: " + 
                (g3/5.0)*100.0 + "%");
        System.out.println("O percentual da faixa 45 - 60anos é: " + 
                (g4/5.0)*100.0 + "%");
        System.out.println("O percentual da faixa 60+ anos é:    " + 
                (g5/5.0)*100.0 + "%");
        leitura.close();
    }
}
