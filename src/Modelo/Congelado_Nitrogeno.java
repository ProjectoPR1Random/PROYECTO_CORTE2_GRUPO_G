package Modelo;

public class Congelado_Nitrogeno extends Congelados {

	private String metodoCongelacion;
	private String tiempoExposicion;
	
	/**
	 * Constructor de la clase Congelado_Nitrogeno
	 * <b>pre</b> Que exista el atributo
	 * <b>post</b> Creacion de parametros
	 * @param pFechaCaducidad La fecha de caducidad el producto. pFechaCaducidad!=null, pFechaCaducidad!=""
	 * @param pNumeroDeLote La fecha de la creacion del producto. pNumeroDeLote!=null, pNumeroDeLote!=""
	 * @param pFechaEnvasado La fecha en que se envaso el producto. pFechaEnvasado!=null, pFechaEnvasado!=""
	 * @param pPaisOrigen Pais de origen del producto. pPaisOrigen!=null, pPaisOrigen!=""
	 * @param pTemperatura Temperatura ideal del producto pTemperatura!=null, pTemperatura!=""
	 * @param pMetodoCongelacion El metodo de congelacion del producto pMetodoCongelacion!=null, pMetodoCongelacion!=""
	 * @param pTiempoExposicion El tiempo maximo de exposicion del producto. pTiempoExposicion!=null, pTiempoExposicion!=""
	 */

	public Congelado_Nitrogeno(String pFechaCaducidad, String pNumeroDeLote, String pFechaEnvasado, String pPaisOrigen,
			String pTemperatura, String pMetodoCongelacion, String pTiempoExposicion) {
		super(pFechaCaducidad, pNumeroDeLote, pFechaEnvasado, pPaisOrigen, pTemperatura);
		// TODO Auto-generated constructor stub

		this.metodoCongelacion = pMetodoCongelacion;
		this.tiempoExposicion = pTiempoExposicion;
	}

	/**
	 * metodo para obtener la composicion del aire
	 * <b>pre</b> que el atributo metodoCongelacion exista
	 * <b>post </b> obtener metodo de congelacion
	 * @return metodoCongelacion
	 */
	
	public String getMetodoCongelacion() {
		return metodoCongelacion;
	}
	
	/**
	 * Meotodo para actualizar el atributo
	 * <b>pre</b> que el atributo metodoCongelacion exista
	 * <b>post</b> que se actualice el atributo
	 * @param metodoCongelacion
	 */

	public void setMetodoCongelacion(String metodoCongelacion) {
		this.metodoCongelacion = metodoCongelacion;
	}

	/**
	 * metodo para obtener el tiempo de exposicion
	 * <b>pre</b> que el atributo tiempoExposicion exista
	 * <b>post </b> obtener tiempo de exposicion
	 * @return tiempoExposicion
	 */
	
	public String getTiempoExposicion() {
		return tiempoExposicion;
	}
	
	/**
	 * Meotodo para actualizar el atributo
	 * <b>pre</b> que el atributo tiempoExposicion exista
	 * <b>post</b> que se actualice el atributo
	 * @param tiempoExposicion
	 */


	public void setTiempoExposicion(String tiempoExposicion) {
		this.tiempoExposicion = tiempoExposicion;
	}

}
