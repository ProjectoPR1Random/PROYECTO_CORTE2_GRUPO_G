package Modelo;

public class Congelado_Aire extends Congelados {

	private String composicionDelAire;

	public Congelado_Aire(String pFechaCaducidad, String pNumeroDeLote, String pFechaEnvasado, String pPaisOrigen,
			String pTemperatura, String pComposici�nDelAire) {
		super(pFechaCaducidad, pNumeroDeLote, pFechaEnvasado, pPaisOrigen, pTemperatura);
		// TODO Auto-generated constructor stub

		this.composicionDelAire = pComposici�nDelAire;
	}

	public String getComposicionDelAire() {
		return composicionDelAire;
	}

	public void setComposicionDelAire(String composicionDelAire) {
		this.composicionDelAire = composicionDelAire;
	}

}
