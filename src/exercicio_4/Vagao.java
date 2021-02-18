package exercicio_4;

public class Vagao implements Transporte {
	
	@Override
	public double calcularFrete(double valor, double peso) {
		double frete;
        if(peso < 15.000){
           frete = 0.2 * peso  + 0.1 * valor + 5.000;
           return frete;
        }else{
           frete = 0.2 * peso + 0.1 * valor;
           return frete;
        }
	}
}
