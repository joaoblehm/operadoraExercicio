package calculo;

import br.com.tabajaradigital.negocio.Plano;

public class CalculoInternet  {
	Plano plano = new Plano();
	int franquiaDado = 0;
	double dadoAdicional = 0.0;
	int gigaUsado =0;

	
	
	public double calculaInternet(double gigaUsado) {
		if(gigaUsado <= franquiaDado) {
			dadoAdicional = 0.0;
			
		}else if (plano.getValorPlano() == 65.00 ) {
			dadoAdicional = franquiaDado + (gigaUsado * 15.00);
		}else if (plano.getValorPlano() == 120.00) {
			dadoAdicional = franquiaDado + (gigaUsado * 10.00);
		}else {
			
		}
		return dadoAdicional;
	}
	
}
