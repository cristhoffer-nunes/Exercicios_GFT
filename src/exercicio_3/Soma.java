package exercicio_3;

public class Soma implements Operacao{

	@Override
	public double efetuarOperacao(double x, double y) {
		double soma = x+ y;
		return soma;
	}

}
