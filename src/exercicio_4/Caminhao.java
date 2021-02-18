package exercicio_4;

public class Caminhao implements Transporte {

	@Override
	public double calcularFrete(double valor, double peso) {
		 double frete;
	        if(valor > 40.000){
	           frete = (peso * 0.12) + (valor * 0.3);
	           double novoFrete = frete - (frete * 0.25);
	           return novoFrete;
	        }else{
	           frete = peso * 0.12 + valor * 0.3;
	           return frete;
        }		
	}
}
