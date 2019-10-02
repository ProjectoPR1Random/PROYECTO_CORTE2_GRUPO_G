package Modelo;

public class Congelado_Nitrogeno extends Congelados {

	private String metodoCongelacion;
	private String tiempoExposicion;

	public Congelado_Nitrogeno(String pFechaCaducidad, String pNumeroDeLote, String pFechaEnvasado, String pPaisOrigen,
			String pTemperatura, String pMetodoCongelacion, String pTiempoExposicion) {
		super(pFechaCaducidad, pNumeroDeLote, pFechaEnvasado, pPaisOrigen, pTemperatura);
		// TODO Auto-generated constructor stub

		this.metodoCongelacion = pMetodoCongelacion;
		this.tiempoExposicion = pTiempoExposicion;
	}

	public String getMetodoCongelacion() {
		return metodoCongelacion;
	}

	public void setMetodoCongelacion(String metodoCongelacion) {
		this.metodoCongelacion = metodoCongelacion;
	}

	public String getTiempoExposicion() {
		return tiempoExposicion;
	}

	public void setTiempoExposicion(String tiempoExposicion) {
		this.tiempoExposicion = tiempoExposicion;
	}

}
