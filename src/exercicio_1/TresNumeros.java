package exercicio_1;

import java.util.Scanner;

public class TresNumeros {

	
	public static void main(String[] args) {
		int numeroUm, numeroDois, numeroTres, maiorNumero, menorNumero;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite os valores:");
		numeroUm = entrada.nextInt();
		numeroDois = entrada.nextInt();
		numeroTres = entrada.nextInt();
		
		if((numeroUm == numeroDois) && (numeroDois == numeroTres) && (numeroTres == numeroUm)) {
			System.out.println("Os n�meros s�o iguais!");
		}else if((numeroUm > numeroDois) && (numeroUm>numeroTres)) {
				maiorNumero = numeroUm;
				System.out.println("O maior n�mero �: " + numeroUm);			
		}else if((numeroDois > numeroUm) & (numeroDois > numeroTres)) {
				maiorNumero = numeroDois;
				System.out.println("O maior n�mero �: " + numeroDois);	
		}else if((numeroTres > numeroUm) && (numeroTres > numeroDois)) {			
				maiorNumero = numeroTres;
				System.out.println("O maior n�mero �: " + numeroTres);			
		}	
		
		if((numeroUm == numeroDois) && (numeroDois == numeroTres) && (numeroTres == numeroUm)) {
			System.out.println("Os n�meros s�o iguais!");
		}else if((numeroUm < numeroDois) && (numeroUm < numeroTres)) {
				menorNumero = numeroUm;
				System.out.println("O menor n�mero �: " + numeroUm);			
		}else if((numeroDois < numeroUm) & (numeroDois < numeroTres)) {
			    menorNumero = numeroDois;
				System.out.println("O menor n�mero �: " + numeroDois);	
		}else if((numeroTres < numeroUm) && (numeroTres < numeroDois)) {			
			    menorNumero = numeroTres;
				System.out.println("O menor n�mero �: " + numeroTres);			
		}	
	}
}
