package exercicio_3;

public class Subtracao implements Operacao {

	@Override
	public double efetuarOperacao(double x, double y) {
		double sub = x - y;
		return sub;
	}

}
