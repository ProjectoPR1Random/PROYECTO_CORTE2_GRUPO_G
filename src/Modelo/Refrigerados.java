package Modelo;

public class Refrigerados extends Producto{
	private String codigoOrganismo;
	private String temperatura;

	/**
	 * Constructor de la clase Congelado_Agua
	 * <b>pre</b> Que exista el atributo
	 * <b>post</b> Creacion de parametros
	 * @param pFechaCaducidad La fecha de caducidad el producto. pFechaCaducidad!=null, pFechaCaducidad!=""
	 * @param pNumeroDeLote La fecha de la creacion del producto. pNumeroDeLote!=null, pNumeroDeLote!=""
	 * @param pFechaEnvasado La fecha en que se envaso el producto. pFechaEnvasado!=null, pFechaEnvasado!=""
	 * @param pPaisOrigen Pais de origen del producto. pPaisOrigen!=null, pPaisOrigen!=""
	 * @param pCodigoOrganismo El codigo del respectivo organismo .pCodigoOrganismo!=null, pCodigoOrganismo!=""
	 * @param pTemperatura La temperatura ideal del producto .pTemperatura!=null, pTemperatura!=""
	 */
	
	public Refrigerados(String pFechaCaducidad, String pNumeroDeLote, String pFechaEnvasado,
		String pPaisOrigen, String pCodigoOrganismo, String pTemperatura) {
		super(pFechaCaducidad, pNumeroDeLote, pFechaEnvasado, pPaisOrigen);
		// TODO Auto-generated constructor stub
		
		this.codigoOrganismo=pCodigoOrganismo;
		this.temperatura=pTemperatura;
	}

	/**
	 * metodo para obtener el codigo de organismo
	 * <b>pre</b> que el atributo codigoOrganismo exista
	 * <b>post </b> obtener codigoOrganismo
	 * @return codigoOrganismo
	 */	
	
public String getCodigoOrganismo() {
	return codigoOrganismo;
}


/**
 * Meotodo para actualizar el atributo
 * <b>pre</b> que el atributo codigoOrganismo exista
 * <b>post</b> que se actualice el atributo
 * @param codigoOrganismo
 */

public void setCodigoOrganismo(String codigoOrganismo) {
	this.codigoOrganismo = codigoOrganismo;
}


      /**
       * metodo para obtener la temperatura
       * <b>pre</b> que el atributo temperatura exista
       * <b>post </b> obtener temperatura
       * @return temperatura
       */	

public String getTemperatura() {
	return temperatura;
}

/**
 * Meotodo para actualizar el atributo
 * <b>pre</b> que el atributo temperatura exista
 * <b>post</b> que se actualice el atributo
 * @param temperatura
 */

public void setTemperatura(String temperatura) {
	this.temperatura = temperatura;
}

}
