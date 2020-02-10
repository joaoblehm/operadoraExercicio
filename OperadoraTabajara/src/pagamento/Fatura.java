package pagamento;

import br.com.tabajaradigital.internet.PlanoInternet;
import br.com.tabajaradigital.negocio.Cliente;
import br.com.tabajaradigital.negocio.Operadora;
import br.com.tabajaradigital.negocio.Plano;
import br.com.tabajaradigital.negocio.StatusCliente;
import calculo.CalculoInternet;
import calculo.CalculoMinuto;


public class Fatura extends Plano {
public static void main(String[] args) {
	


	Cliente cliente = new Cliente(69,"Janete Ledesma", 115, null);
	Operadora operadora = new Operadora(15,"VIVO");
	Plano plano = new Plano(156,"VIVO PLUS", 120);
	CalculoInternet internet = new CalculoInternet();
	CalculoMinuto minuto = new CalculoMinuto();
	
	
	System.out.println("FATURA" + 
					   "\nCliente: " + cliente
					   +"\nOperadora: " + operadora
					   +"\nPlano: " + plano
					   +"\nInternet: " + internet.calculaInternet(4)
					   +"\nMinuto: " + minuto.calculaMinuto(10));

	
	
	

	
	
}	
}
