package Modelo;

public class Congelados extends Producto{

	private String temperatura;
	public Congelados(String pFechaCaducidad, String pNumeroDeLote, String pFechaEnvasado,
			String pPaisOrigen, String pTemperatura) {
		super(pFechaCaducidad, pNumeroDeLote, pFechaEnvasado, pPaisOrigen);
		// TODO Auto-generated constructor stub
		this.temperatura=pTemperatura;
	}
	public String getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

}
