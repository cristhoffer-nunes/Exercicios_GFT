package exercicio_3;

public class Multiplicacao implements Operacao{

	@Override
	public double efetuarOperacao(double x, double y) {
		double mult = x *y;
		return mult;
	}

}
