package exercicio_4;

import java.util.Scanner;

public class TelaPrincipal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double valor, peso;
		System.out.println("Digite um número para Valor: ");
		valor = entrada.nextDouble();
		System.out.println("Digite um número para Peso: ");
		peso = entrada.nextDouble();
		
		Caminhao c = new Caminhao();
		System.out.println("O frete do caminhão é: " + c.calcularFrete(valor, peso));
		
		Vagao v = new Vagao();
		System.out.println("O frete do vagão é: " + v.calcularFrete(valor, peso));
		
	
}
}
