package Modelo;

public class Congelados extends Producto{

	private String temperatura;
	
	/**
	 * Constructor de la clase Congelados
	 * <b>pre</b> Que exista el atributo
	 * <b>post</b> Creacion de parametros
	 * @param pFechaCaducidad La fecha de caducidad el producto. pFechaCaducidad!=null, pFechaCaducidad!=""
	 * @param pNumeroDeLote La fecha de la creacion del producto. pNumeroDeLote!=null, pNumeroDeLote!=""
	 * @param pFechaEnvasado La fecha en que se envaso el producto. pFechaEnvasado!=null, pFechaEnvasado!=""
	 * @param pPaisOrigen Pais de origen del producto. pPaisOrigen!=null, pPaisOrigen!=""
	 * @param pTemperatura Temperatura ideal del producto pTemperatura!=null, pTemperatura!=""
	 */
	
	public Congelados(String pFechaCaducidad, String pNumeroDeLote, String pFechaEnvasado,
			String pPaisOrigen, String pTemperatura) {
		super(pFechaCaducidad, pNumeroDeLote, pFechaEnvasado, pPaisOrigen);
		// TODO Auto-generated constructor stub
		this.temperatura=pTemperatura;
	}
	
	
	/**
	 * metodo para obtener la temperatura
	 * <b>pre</b> que el atributo temperatura exista
	 * <b>post </b> obtener temperatura
	 * @return temperatura
	 */
	
	public String getTemperatura() {
		return temperatura;
		
		/**
		 * Meotodo para actualizar el atributo
		 * <b>pre</b> que el atributo temperatura exista
		 * <b>post</b> que se actualice el atributo
		 * @param temperatura
		 */
		
	}
	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

}
