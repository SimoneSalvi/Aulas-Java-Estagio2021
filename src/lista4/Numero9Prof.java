package lista4;
	import java.util.Scanner;
public class Numero9Prof {


	    public static void main(String[] args) {
	        Scanner leitura = new Scanner(System.in);
//	        int n,c;
	        int dp,ds,a,b,soma;
	        dp = 0;
	        ds = 0;
	        a = 0;
	        b = 3;
	        soma = 0;
	        
	        int [][] m = new int [4][4];
	        for (int i=0; i<=3; i++) {  //Índice da linha i+1
	            for (int j=0; j<=3; j++) { //Índice da coluna j+1
	                System.out.print("Digite o elemento a" + (i+1) + (j+1) 
	                        + " da matriz: ");
	                m[i][j] = leitura.nextInt();
	                soma = soma + m[i][j];
	                if(i == j) { //Diagonal principal
	                    dp = dp + m[i][j];
	                } else if(i == a && j == b) { //Diagonal secundária
	                    ds = ds + m[i][j];
	                    a++;
	                    b--;
	                }                            
	            }
	        }
	        
	        System.out.println("\n\n A soma da diagonal principal é: " + dp);
	        System.out.println("\n A soma da diagonal secundária é: " + ds);
	        System.out.println("\n A soma de todos os elementos é: " + (soma/16.0));
	        
	/*        System.out.println("\n Vamos acessar um elemento da matriz:");
	        System.out.println("Digite a linha do elemento que desejar: ");
	        n = leitura.nextInt();
	        System.out.println("Digite a coluna do elemento que desejar: ");
	        c = leitura.nextInt();
	        System.out.println("O elemento de matriz na posição a" + n + c +
	                " é: " + m[n-1][c-1]);        
	*/        
	        leitura.close();        

	}

}
