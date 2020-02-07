package calculo;

public class CalculoInternet {

	int franquiaDado = 0;
	double dadoAdicional = 0.0;
	int gigaUsado =0;
	
	public double calculaInternet(double gigaUsado) {
		if(gigaUsado <= franquiaDado) {
			dadoAdicional = 0.0;
			
		}else {
			dadoAdicional = franquiaDado + (gigaUsado * 15.00);
		}
		return dadoAdicional;
	}
	
}
