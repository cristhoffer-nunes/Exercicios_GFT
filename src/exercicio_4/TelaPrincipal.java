package exercicio_4;

import java.util.Scanner;

public class TelaPrincipal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double valor, peso;
		System.out.println("Digite um n�mero para Valor: ");
		valor = entrada.nextDouble();
		System.out.println("Digite um n�mero para Peso: ");
		peso = entrada.nextDouble();
		
		Caminhao c = new Caminhao();
		System.out.println("O frete do caminh�o �: " + c.calcularFrete(valor, peso));
		
		Vagao v = new Vagao();
		System.out.println("O frete do vag�o �: " + v.calcularFrete(valor, peso));
		
	
}
}
