package exercicio_3;

public class Divisao implements Operacao{

	@Override
	public double efetuarOperacao(double x, double y) {
		double div = x/y;
		if(y==0) {
			System.out.println("A opera��o n�o ser� poss�vel");
			return 0;
		}else {			
			return div;
		}
	}
}
