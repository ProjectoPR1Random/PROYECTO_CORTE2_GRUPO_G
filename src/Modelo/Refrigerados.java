package Modelo;

public class Refrigerados extends Producto{
	private String codigoOrganismo;
	private String temperatura;

public Refrigerados(String pFechaCaducidad, String pNumeroDeLote, String pFechaEnvasado,
		String pPaisOrigen, String pCodigoOrganismo, String pTemperatura) {
		super(pFechaCaducidad, pNumeroDeLote, pFechaEnvasado, pPaisOrigen);
		// TODO Auto-generated constructor stub
		
		this.codigoOrganismo=pCodigoOrganismo;
		this.temperatura=pTemperatura;
	}

public String getCodigoOrganismo() {
	return codigoOrganismo;
}



public void setCodigoOrganismo(String codigoOrganismo) {
	this.codigoOrganismo = codigoOrganismo;
}

public String getTemperatura() {
	return temperatura;
}

public void setTemperatura(String temperatura) {
	this.temperatura = temperatura;
}

}
