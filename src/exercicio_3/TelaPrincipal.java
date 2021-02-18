package exercicio_3;

import java.util.Scanner;

public class TelaPrincipal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double x,y;
		String operacao;
		
		System.out.println("Informe qual operacao deseja realizar (soma, subtracao, divisao, multiplicacao): ");
		operacao = entrada.nextLine();
		System.out.println("Digite um valor para x: ");
		x = entrada.nextDouble();
		System.out.println("Digite um valor para y: ");
		y = entrada.nextDouble();
		
		if(operacao.equals("soma")) {
			Soma soma = new Soma();			
			System.out.println("A soma efetuada é: " + soma.efetuarOperacao(x, y));
		}else if(operacao.equals("subtracao")) {
			Subtracao sub = new Subtracao();			
			System.out.println("A subtração efetuada é: " + sub.efetuarOperacao(x, y));
		}else if(operacao.equals("divisao")) {
			Divisao div = new Divisao();			
			System.out.println("A divisão efetuada é: " + div.efetuarOperacao(x, y));
		}else if(operacao.equals("multiplicacao")) {
			Multiplicacao multi = new Multiplicacao();			
			System.out.println("A multiplicação efetuada é: " + multi.efetuarOperacao(x, y));
		}
	}
}
