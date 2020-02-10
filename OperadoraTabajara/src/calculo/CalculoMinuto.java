package calculo;

public class CalculoMinuto {

	double minutoAdicional = 0.0;
	double franquiaMinuto = 0.0;
	double minutosFalados = 0.0;
	
	
	public double calculaMinuto(double minutoFalado) {
			if (minutoFalado <= franquiaMinuto) {				
				minutoAdicional = 0.0;				
			} else {				
				minutoAdicional = franquiaMinuto + (minutoFalado * 0.08);				
			}
			return minutoAdicional;
	}

}
