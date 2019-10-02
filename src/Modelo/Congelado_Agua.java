package Modelo;

public class Congelado_Agua extends Congelados {

	private String salinidadDelAgua;

	public Congelado_Agua(String pFechaCaducidad, String pNumeroDeLote, String pFechaEnvasado, String pPaisOrigen,
			String pTemperatura, String pSalinidadDelAgua) {
		super(pFechaCaducidad, pNumeroDeLote, pFechaEnvasado, pPaisOrigen, pTemperatura);
		// TODO Auto-generated constructor stub

		this.salinidadDelAgua = pSalinidadDelAgua;
	}

	public String getSalinidadDelAgua() {
		return salinidadDelAgua;
	}

	public void setSalinidadDelAgua(String salinidadDelAgua) {
		this.salinidadDelAgua = salinidadDelAgua;
	}

}
